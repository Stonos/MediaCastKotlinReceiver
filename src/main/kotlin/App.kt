import cast.*
import components.Stats
import components.debugPanel
import kotlinx.css.*
import react.*
import styled.css
import styled.styledDiv

external interface AppState : RState {
    var logs: List<String>
    var stats: Stats
    var debugEnabled: Boolean
}

class App : RComponent<RProps, AppState>() {
    override fun AppState.init() {
        logs = listOf()
        stats = Stats(0, "INIT", 0)
        debugEnabled = true
    }

    override fun RBuilder.render() {
        styledDiv {
            css {
                backgroundColor = Color.black
                color = Color.white
                height = 100.pct
                textAlign = TextAlign.left
            }
            debugPanel {
                logs = state.logs
                stats = state.stats
                debugEnabled = state.debugEnabled
            }
            castMediaPlayer { }
        }
    }

    override fun componentDidMount() {
        init()
    }

    private fun init() {
        log("[mediacast:init] - Initializing.")
        log("test", state.stats)

        val context = CastReceiverContext.getInstance()
        val player = context.getPlayerManager()

        context.setLoggerLevel(LoggerLevel.DEBUG)

        setPlayerEvents(player)

        context.addCustomMessageListener("urn:x-cast:com.google.cast.mediacast") { event: Event ->
            log("Custom message:", event)
        }

        context.start()
    }

    private fun setPlayerEvents(player: PlayerManager) {
        // Load event
        player.setMessageInterceptor(MessageType.LOAD) { loadRequestData: LoadRequestData ->
            log("[mediacast:setPlayerEvents] - player.setMessageInterceptor:LOAD", loadRequestData)

            val url = loadRequestData.media.contentId;
            val licenseUrl: String = loadRequestData.media.customData.licenseUrl;
            val drm: String = loadRequestData.media.customData.drm;
            val ext = url.substring(url.lastIndexOf('.'), url.length)

            loadRequestData.media.contentType = when {
                ext.contains("mpd") -> {
                    "application/dash+xml";
                }
                ext.contains("m3u8") -> {
                    // TODO: Create option to set hlsSegmentFormat option.
                    loadRequestData.media.hlsSegmentFormat = HlsSegmentFormat.TS;

                    "application/vnd.apple.mpegurl";
                }
                ext.contains("ism") -> {
                    "application/vnd.ms-sstr+xml";
                }
                else -> "video/mp4"
            }

            player.setMediaPlaybackInfoHandler { loadRequest, playbackConfig ->
                playbackConfig.licenseUrl = licenseUrl
                playbackConfig.protectionSystem = DRMS[drm]
                log("[mediacast:playbackConfig - ", playbackConfig)

                playbackConfig
            }

            loadRequestData
        }

        player.addEventListener(PlayerEventType.PLAYER_LOAD_COMPLETE) { event: LoadEvent ->
            log("[mediacast:events:PLAYER_LOAD_COMPLETE")
            log(player.getStats())
            log(player.getMediaInformation())
        }

        player.addEventListener(PlayerEventType.BITRATE_CHANGED) { event: BitrateChangedEvent ->
            log("[mediacast:events:BITRATE_CHANGED -", event)
            setState { stats = stats.copy(bitrate = event.totalBitrate.toInt()) }
        }

        player.addEventListener(PlayerEventType.PLAYING) { event: MediaElementEvent ->
            log("[mediacast:events:PLAYING -", event)
        }

        player.addEventListener(PlayerEventType.PAUSE) { event: MediaElementEvent ->
            log("[mediacast:events:PAUSE -", event)
        }

        player.addEventListener(PlayerEventType.SEEKING) { event: MediaElementEvent ->
            log("[mediacast:events:SEEKING -", event)
        }

        player.addEventListener(PlayerEventType.BUFFERING) { event: MediaElementEvent ->
            log("[mediacast:events:BUFFERING -", event)
        }

        player.addEventListener(PlayerEventType.TIME_UPDATE) { event: MediaElementEvent ->
//            log("[mediacast:events:TIME_UPDATE -", event)
            setState { stats = stats.copy(currentMediaTime = event.currentMediaTime) }
        }

        player.addEventListener(PlayerEventType.MEDIA_STATUS) { event: MediaStatusEvent ->
            log("[mediacast:events:MEDIA_STATUS -", event)
            setState { stats = stats.copy(state = event.mediaStatus.playerState.toString()) }
        }

//        player.addEventListener(PlayerEventType.ALL) { event: MediaElementEvent ->
//            log("Player event:", event)
//        }
    }

    private fun log(vararg items: Any?) {
        val stringMap = items.mapNotNull { item ->
            if (item is String) {
                item
            } else {
                JSON.stringify(item)
            }
        }

        val loggedLine = stringMap.joinToString(" ")
        setState {
            logs += loggedLine
        }
        console.log(loggedLine)
    }

    companion object {
        private val DRMS = mapOf(
            "widevine" to ContentProtection.WIDEVINE,
            "playready" to ContentProtection.PLAYREADY
        )
    }
}