@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "EXTERNAL_DELEGATION"
)
@file:JsQualifier("cast.framework")

package cast

import org.khronos.webgl.Uint8Array
import org.w3c.dom.HTMLMediaElement
import kotlin.js.Promise

external enum class LoggerLevel {
    DEBUG /* = 0 */,
    VERBOSE /* = 500 */,
    INFO /* = 800 */,
    WARNING /* = 900 */,
    ERROR /* = 1000 */,
    NONE /* = 1500 */
}

external enum class ContentProtection {
    NONE /* = 'none' */,
    CLEARKEY /* = 'clearkey' */,
    PLAYREADY /* = 'playready' */,
    WIDEVINE /* = 'widevine' */,
    AES_128 /* = 'aes_128' */,
    AES_128_CKP /* = 'aes_128_ckp' */;
}

external open class TextTracksManager(params: Any = definedExternally) {
    open fun addTracks(tracks: Array<Track>)
    open fun createTrack(): Track
    open fun getActiveIds(): Array<Number>
    open fun getActiveTracks(): Array<Track>
    open fun getTextTracksStyle(): TextTrackStyle
    open fun getTrackById(id: Number): Track
    open fun getTracks(): Array<Track>
    open fun getTracksByLanguage(language: String): Array<Track>
    open fun setActiveByIds(newIds: Array<Number>)
    open fun setActiveByLanguage(language: String)
    open fun setTextTrackStyle(style: TextTrackStyle)
}

external open class QueueManager(params: Any = definedExternally) {
    open fun getCurrentItem(): QueueItem
    open fun getCurrentItemIndex(): Number
    open fun getItems(): Array<QueueItem>
    open fun insertItems(items: Array<QueueItem>, insertBefore: Number = definedExternally)
    open fun removeItems(itemIds: Array<Number>)
    open fun setQueueStatusLimit(limitQueueItemsInStatus: Boolean)
    open fun updateItems(items: Array<QueueItem>)
}

external open class QueueBase {
    open fun fetchItems(itemId: Number, nextCount: Number, prevCount: Number): dynamic /* Array<messages.cast.QueueItem> | Promise<Array<messages.cast.QueueItem>> */
    open fun initialize(requestData: LoadRequestData): dynamic /* messages.cast.QueueData | Promise<messages.cast.QueueData> */
    open fun nextItems(itemId: Number = definedExternally): dynamic /* Array<messages.cast.QueueItem> | Promise<Array<messages.cast.QueueItem>> */
    open fun onCurrentItemIdChanged(itemId: Number)
    open fun onItemsInserted(items: Array<QueueItem>, insertBefore: Number = definedExternally)
    open fun onItemsRemoved(itemIds: Array<Number>)
    open fun prevItems(itemId: Number = definedExternally): dynamic /* Array<messages.cast.QueueItem> | Promise<Array<messages.cast.QueueItem>> */
    open fun shuffle(): dynamic /* Array<messages.cast.QueueItem> | Promise<Array<messages.cast.QueueItem>> */
}

external open class PlayerManager(params: Any = definedExternally) {
    open fun addEventListener(eventType: dynamic /* cast.PlayerEventType.ABORT | Array<cast.PlayerEventType.ABORT> | cast.PlayerEventType.CAN_PLAY | Array<cast.PlayerEventType.CAN_PLAY> | cast.PlayerEventType.CAN_PLAY_THROUGH | Array<cast.PlayerEventType.CAN_PLAY_THROUGH> | cast.PlayerEventType.DURATION_CHANGE | Array<cast.PlayerEventType.DURATION_CHANGE> | cast.PlayerEventType.EMPTIED | Array<cast.PlayerEventType.EMPTIED> | cast.PlayerEventType.ENDED | Array<cast.PlayerEventType.ENDED> | cast.PlayerEventType.LOADED_DATA | Array<cast.PlayerEventType.LOADED_DATA> | cast.PlayerEventType.LOADED_METADATA | Array<cast.PlayerEventType.LOADED_METADATA> | cast.PlayerEventType.LOAD_START | Array<cast.PlayerEventType.LOAD_START> | cast.PlayerEventType.PLAY | Array<cast.PlayerEventType.PLAY> | cast.PlayerEventType.PLAYING | Array<cast.PlayerEventType.PLAYING> | cast.PlayerEventType.PROGRESS | Array<cast.PlayerEventType.PROGRESS> | cast.PlayerEventType.RATE_CHANGE | Array<cast.PlayerEventType.RATE_CHANGE> | cast.PlayerEventType.SEEKED | Array<cast.PlayerEventType.SEEKED> | cast.PlayerEventType.SEEKING | Array<cast.PlayerEventType.SEEKING> | cast.PlayerEventType.STALLED | Array<cast.PlayerEventType.STALLED> | cast.PlayerEventType.TIME_UPDATE | Array<cast.PlayerEventType.TIME_UPDATE> | cast.PlayerEventType.SUSPEND | Array<cast.PlayerEventType.SUSPEND> | cast.PlayerEventType.WAITING | Array<cast.PlayerEventType.WAITING> */, eventListener: MediaElementEventHandler)

//    open fun addEventListener(eventType: PlayerEventType, eventListener: PauseEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: PauseEventHandler)
open fun addEventListener(eventType: PlayerEventType, eventListener: BitrateChangedEventHandler)

    //    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: BitrateChangedEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: BreaksEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: BreaksEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: BreaksEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: BreaksEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: BreaksEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: BreaksEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: BreaksEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: BreaksEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: BreaksEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: BreaksEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: BufferingEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: BufferingEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: CacheLoadedEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: CacheLoadedEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: CacheItemEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: CacheItemEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: CacheItemEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: CacheItemEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: ClipEndedEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: ClipEndedEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: EmsgEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: EmsgEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: ErrorEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: ErrorEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: Id3EventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: Id3EventHandler)
    open fun addEventListener(eventType: PlayerEventType, eventListener: MediaStatusEventHandler)

    //    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: MediaStatusEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: CustomStateEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: CustomStateEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: MediaInformationChangedEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: MediaInformationChangedEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: MediaFinishedEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: MediaFinishedEventHandler)
    open fun addEventListener(eventType: PlayerEventType, eventListener: LoadEventHandler)

    //    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: LoadEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: LoadEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: SegmentDownloadedEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: SegmentDownloadedEventHandler)
//    open fun addEventListener(eventType: dynamic /* cast.PlayerEventType.REQUEST_SEEK | Array<cast.PlayerEventType.REQUEST_SEEK> | cast.PlayerEventType.REQUEST_LOAD | Array<cast.PlayerEventType.REQUEST_LOAD> | cast.PlayerEventType.REQUEST_STOP | Array<cast.PlayerEventType.REQUEST_STOP> | cast.PlayerEventType.REQUEST_PAUSE | Array<cast.PlayerEventType.REQUEST_PAUSE> | cast.PlayerEventType.REQUEST_PRECACHE | Array<cast.PlayerEventType.REQUEST_PRECACHE> | cast.PlayerEventType.REQUEST_PLAY | Array<cast.PlayerEventType.REQUEST_PLAY> | cast.PlayerEventType.REQUEST_SKIP_AD | Array<cast.PlayerEventType.REQUEST_SKIP_AD> | cast.PlayerEventType.REQUEST_PLAY_AGAIN | Array<cast.PlayerEventType.REQUEST_PLAY_AGAIN> | cast.PlayerEventType.REQUEST_PLAYBACK_RATE_CHANGE | Array<cast.PlayerEventType.REQUEST_PLAYBACK_RATE_CHANGE> | cast.PlayerEventType.REQUEST_VOLUME_CHANGE | Array<cast.PlayerEventType.REQUEST_VOLUME_CHANGE> | cast.PlayerEventType.REQUEST_EDIT_TRACKS_INFO | Array<cast.PlayerEventType.REQUEST_EDIT_TRACKS_INFO> | cast.PlayerEventType.REQUEST_EDIT_AUDIO_TRACKS | Array<cast.PlayerEventType.REQUEST_EDIT_AUDIO_TRACKS> | cast.PlayerEventType.REQUEST_SET_CREDENTIALS | Array<cast.PlayerEventType.REQUEST_SET_CREDENTIALS> | cast.PlayerEventType.REQUEST_LOAD_BY_ENTITY | Array<cast.PlayerEventType.REQUEST_LOAD_BY_ENTITY> | cast.PlayerEventType.REQUEST_USER_ACTION | Array<cast.PlayerEventType.REQUEST_USER_ACTION> | cast.PlayerEventType.REQUEST_DISPLAY_STATUS | Array<cast.PlayerEventType.REQUEST_DISPLAY_STATUS> | cast.PlayerEventType.REQUEST_CUSTOM_COMMAND | Array<cast.PlayerEventType.REQUEST_CUSTOM_COMMAND> | cast.PlayerEventType.REQUEST_FOCUS_STATE | Array<cast.PlayerEventType.REQUEST_FOCUS_STATE> | cast.PlayerEventType.REQUEST_QUEUE_LOAD | Array<cast.PlayerEventType.REQUEST_QUEUE_LOAD> | cast.PlayerEventType.REQUEST_QUEUE_INSERT | Array<cast.PlayerEventType.REQUEST_QUEUE_INSERT> | cast.PlayerEventType.REQUEST_QUEUE_UPDATE | Array<cast.PlayerEventType.REQUEST_QUEUE_UPDATE> | cast.PlayerEventType.REQUEST_QUEUE_REMOVE | Array<cast.PlayerEventType.REQUEST_QUEUE_REMOVE> | cast.PlayerEventType.REQUEST_QUEUE_REORDER | Array<cast.PlayerEventType.REQUEST_QUEUE_REORDER> | cast.PlayerEventType.REQUEST_QUEUE_GET_ITEM_RANGE | Array<cast.PlayerEventType.REQUEST_QUEUE_GET_ITEM_RANGE> | cast.PlayerEventType.REQUEST_QUEUE_GET_ITEMS | Array<cast.PlayerEventType.REQUEST_QUEUE_GET_ITEMS> | cast.PlayerEventType.REQUEST_QUEUE_GET_ITEM_IDS | Array<cast.PlayerEventType.REQUEST_QUEUE_GET_ITEM_IDS> */, eventListener: RequestEventHandler)
//
//    open fun addEventListener(eventType: PlayerEventType, eventListener: LiveStatusEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: LiveStatusEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: LiveStatusEventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: LiveStatusEventHandler)
//    open fun addEventListener(eventType: PlayerEventType, eventListener: EventHandler)
//    open fun addEventListener(eventType: Array<PlayerEventType>, eventListener: EventHandler)
    open fun broadcastStatus(
        includeMedia: Boolean = definedExternally,
        requestId: Number = definedExternally,
        customData: Any = definedExternally,
        includeQueueItems: Boolean = definedExternally
    )

    open fun getAudioTracksManager(): AudioTracksManager
    open fun getBreakClipCurrentTimeSec(): Number
    open fun getBreakClipDurationSec(): Number
    open fun getBreakManager(): BreakManager
    open fun getBreaks(): Array<Break>
    open fun getCurrentTimeSec(): Number
    open fun getDurationSec(): Number
    open fun getLiveSeekableRange(): LiveSeekableRange
    open fun getMediaInformation(): MediaInformation
    open fun getPlaybackConfig(): PlaybackConfig
    open fun getPlaybackRate(): Number
    open fun getPlayerState(): PlayerState
    open fun getPreferredPlaybackRate(): Number
    open fun getPreferredTextLanguage(): String
    open fun getQueueManager(): QueueManager
    open fun getStats(): Any
    open fun getTextTracksManager(): TextTracksManager
    open fun load(loadRequest: LoadRequestData): Promise<Unit>
    open fun pause()
    open fun play()
    open fun playString(stringId: PlayStringId, args: Array<String> = definedExternally): Promise<ErrorData>
    open fun refreshCredentials(): Promise<Unit>
    open fun removeEventListener(eventType: PlayerEventType, eventListener: EventHandler)
    open fun removeEventListener(eventType: Array<PlayerEventType>, eventListener: EventHandler)
    open fun seek(seekTime: Number)
    open fun sendError(
        senderId: String,
        requestId: Number,
        type: ErrorType,
        reason: ErrorReason = definedExternally,
        customData: Any = definedExternally
    )

    open fun sendLocalMediaRequest(request: RequestData)
    open fun sendStatus(
        senderId: String,
        requestId: Number,
        includeMedia: Boolean = definedExternally,
        customData: Any = definedExternally,
        includeQueueItems: Boolean = definedExternally
    )

    open fun setIdleReason(idleReason: IdleReason)
    open fun setMediaElement(mediaElement: HTMLMediaElement)
    open fun setMediaInformation(mediaInformation: MediaInformation, opt_broadcast: Boolean = definedExternally)
    open fun setMediaPlaybackInfoHandler(handler: (loadRequestData: LoadRequestData, playbackConfig: PlaybackConfig) -> PlaybackConfig)
    open fun setMediaUrlResolver(resolver: (loadRequestData: LoadRequestData) -> Unit)

    //    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: CloudMediaStatus) -> CloudMediaStatus)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: CloudMediaStatus) -> Promise<CloudMediaStatus>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: CloudMediaStatus) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: CustomCommandRequestData) -> CustomCommandRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: CustomCommandRequestData) -> Promise<CustomCommandRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: CustomCommandRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: DisplayStatusRequestData) -> DisplayStatusRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: DisplayStatusRequestData) -> Promise<DisplayStatusRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: DisplayStatusRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: EditAudioTracksRequestData) -> EditAudioTracksRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: EditAudioTracksRequestData) -> Promise<EditAudioTracksRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: EditAudioTracksRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: EditTracksInfoRequestData) -> EditTracksInfoRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: EditTracksInfoRequestData) -> Promise<EditTracksInfoRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: EditTracksInfoRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: FocusStateRequestData) -> FocusStateRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: FocusStateRequestData) -> Promise<FocusStateRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: FocusStateRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: GetStatusRequestData) -> GetStatusRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: GetStatusRequestData) -> Promise<GetStatusRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: GetStatusRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: LoadRequestData) -> LoadRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: LoadRequestData) -> Promise<LoadRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: LoadRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: LoadByEntityRequestData) -> LoadByEntityRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: LoadByEntityRequestData) -> Promise<LoadByEntityRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: LoadByEntityRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: MediaStatus) -> MediaStatus)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: MediaStatus) -> Promise<MediaStatus>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: MediaStatus) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: PrecacheRequestData) -> PrecacheRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: PrecacheRequestData) -> Promise<PrecacheRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: PrecacheRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: PreloadRequestData) -> PreloadRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: PreloadRequestData) -> Promise<PreloadRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: PreloadRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueChange) -> QueueChange)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueChange) -> Promise<QueueChange>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueChange) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: GetItemsInfoRequestData) -> GetItemsInfoRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: GetItemsInfoRequestData) -> Promise<GetItemsInfoRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: GetItemsInfoRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: FetchItemsRequestData) -> FetchItemsRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: FetchItemsRequestData) -> Promise<FetchItemsRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: FetchItemsRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueInsertRequestData) -> QueueInsertRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueInsertRequestData) -> Promise<QueueInsertRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueInsertRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: ItemsInfo) -> ItemsInfo)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: ItemsInfo) -> Promise<ItemsInfo>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: ItemsInfo) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueIds) -> QueueIds)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueIds) -> Promise<QueueIds>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueIds) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueLoadRequestData) -> QueueLoadRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueLoadRequestData) -> Promise<QueueLoadRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueLoadRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueRemoveRequestData) -> QueueRemoveRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueRemoveRequestData) -> Promise<QueueRemoveRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueRemoveRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueReorderRequestData) -> QueueReorderRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueReorderRequestData) -> Promise<QueueReorderRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueReorderRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueUpdateRequestData) -> QueueUpdateRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueUpdateRequestData) -> Promise<QueueUpdateRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: QueueUpdateRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: ResumeSessionRequestData) -> ResumeSessionRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: ResumeSessionRequestData) -> Promise<ResumeSessionRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: ResumeSessionRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: SeekRequestData) -> SeekRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: SeekRequestData) -> Promise<SeekRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: SeekRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: StoreSessionResponseData) -> StoreSessionResponseData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: StoreSessionResponseData) -> Promise<StoreSessionResponseData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: StoreSessionResponseData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: SetCredentialsRequestData) -> SetCredentialsRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: SetCredentialsRequestData) -> Promise<SetCredentialsRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: SetCredentialsRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: SetPlaybackRateRequestData) -> SetPlaybackRateRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: SetPlaybackRateRequestData) -> Promise<SetPlaybackRateRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: SetPlaybackRateRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: VolumeRequestData) -> VolumeRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: VolumeRequestData) -> Promise<VolumeRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: VolumeRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: StoreSessionRequestData) -> StoreSessionRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: StoreSessionRequestData) -> Promise<StoreSessionRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: StoreSessionRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: UserActionRequestData) -> UserActionRequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: UserActionRequestData) -> Promise<UserActionRequestData>)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: UserActionRequestData) -> Nothing?)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: RequestData) -> RequestData)?)
//    open fun setMessageInterceptor(type: MessageType, interceptor: ((messageData: RequestData) -> Promise<RequestData>)?)
    open fun setMessageInterceptor(type: MessageType, interceptor: (RequestData) -> Unit)
    open fun setMessageInterceptor(type: MessageType, interceptor: (LoadRequestData) -> LoadRequestData)

    //    open fun setMessageInterceptor(type: MessageType, interceptor: (PreloadRequestData) -> PreloadRequestData)
    open fun setPlaybackConfig(playbackConfig: PlaybackConfig)
    open fun setPreferredPlaybackRate(preferredPlaybackRate: Number)
    open fun setPreferredTextLanguage(preferredTextLanguage: String)
    open fun stop()
}

external open class PlaybackConfig {
    open var autoPauseDuration: Number
    open var autoResumeDuration: Number
    open var autoResumeNumberOfSegments: Number
    open var captionsRequestHandler: RequestHandler
    open var initialBandwidth: Number
    open var licenseCustomData: String
    open var licenseHandler: BinaryHandler
    open var licenseRequestHandler: RequestHandler
    open var licenseUrl: String
    open var manifestHandler: (manifest: String) -> String
    open var manifestRequestHandler: RequestHandler
    open var protectionSystem: ContentProtection?
    open var segmentHandler: BinaryHandler
    open var segmentRequestHandler: RequestHandler
    open var segmentRequestRetryLimit: Number
}

external open class NetworkRequestInfo {
    open var content: Uint8Array
    open var headers: Any
    open var url: String
    open var withCredentials: Boolean
}

external open class CastReceiverOptions {
    open var customNamespaces: Any
    open var disableIdleTimeout: Boolean
    open var localSenderId: String
    open var maxInactivity: Number
    open var mediaElement: HTMLMediaElement
    open var playbackConfig: PlaybackConfig
    open var playWatchedBreak: Boolean
    open var preferredPlaybackRate: Number
    open var preferredTextLanguage: String
    open var queue: QueueBase
    open var statusText: String
    open var supportedCommands: Number
    open var useLegacyDashSupport: Boolean
    open var versionCode: Number
}

external open class CastReceiverContext(params: Any) {
    open fun addCustomMessageListener(namespace: String, listener: EventHandler)
    open fun addEventListener(type: String, handler: EventHandler)
    open fun addEventListener(type: PlayerEventType, handler: EventHandler)
    open fun addEventListener(type: Array<PlayerEventType>, handler: EventHandler)
    open fun canDisplayType(mimeType: String, codecs: String = definedExternally, width: Number = definedExternally, height: Number = definedExternally, framerate: Number = definedExternally): Boolean
    open fun getApplicationData(): ApplicationData
    open fun getDeviceCapabilities(): Any
    open fun getPlayerManager(): PlayerManager
    open fun getSender(senderId: String): Sender
    open fun getSenders(): Array<Sender>
    open fun getStandbyState(): StandbyState
    open fun getSystemState(): SystemState
    open fun getVisibilityState(): Any
    open fun isSystemReady(): Boolean
    open fun loadPlayerLibraries(useLegacyDashSupport: Boolean = definedExternally)
    open fun removeCustomMessageListener(namespace: String, listener: EventHandler)
    open fun removeEventListener(type: PlayerEventType, handler: EventHandler)
    open fun sendCustomMessage(namespace: String, senderId: String?, message: Any)
    open fun sendFeedbackMessage(feedbackMessage: String)
    open fun setApplicationState(statusText: String)
    open fun setInactivityTimeout(maxInactivity: Number)
    open fun setLoggerLevel(level: LoggerLevel)
    open fun start(options: CastReceiverOptions = definedExternally): CastReceiverContext
    open fun stop()

    companion object {
        fun getInstance(): CastReceiverContext
    }
}

external open class AudioTracksManager(params: Any) {
    open fun getActiveId(): Number
    open fun getActiveTrack(): Track
    open fun getTrackById(id: Number): Track
    open fun getTracks(): Array<Track>
    open fun getTracksByLanguage(language: String): Array<Track>
    open fun setActiveById(id: Number)
    open fun setActiveByLanguage(language: String)
}