@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

package cast

import kotlin.js.*

external enum class State {
    LAUNCHING /* = 'launching' */,
    IDLE /* = 'idle' */,
    LOADING /* = 'loading' */,
    BUFFERING /* = 'buffering' */,
    PAUSED /* = 'paused' */,
    PLAYING /* = 'playing' */
}

external enum class PlayerDataEventType {
    ACTIVE_TRACK_IDS_CHANGED /* = 'activeTrackIdsChanged' */,
    ANY_CHANGE /* = '*' */,
    APPLICATION_DATA_CHANGED /* = 'applicationDataChanged' */,
    BREAK_PERCENTAGE_POSITIONS_CHANGED /* = 'breakPercentagePositionsChanged' */,
    BREAK_TITLE_CHANGED /* = 'breakTitleChanged' */,
    CONTENT_TYPE_CHANGED /* = 'contentTypeChanged' */,
    CURRENT_BREAK_CLIP_NUMBER_CHANGED /* = 'currentBreakClipNumberChanged' */,
    CURRENT_TIME_CHANGED /* = 'currentTimeChanged' */,
    CUSTOM_STATE_CHANGED /* = 'customStateChanged' */,
    DISPLAY_STATUS_CHANGED /* = 'displayStatusChanged' */,
    DISPLAY_TYPE_CHANGED /* = 'displayTypeChanged' */,
    DURATION_CHANGED /* = 'durationChanged' */,
    IS_AT_LIVE_EDGE_CHANGED /* = 'isAtLiveEdgeChanged' */,
    IS_BREAK_SKIPPABLE_CHANGED /* = 'isBreakSkippableChanged' */,
    IS_LIVE_CHANGED /* = 'isLiveChanged' */,
    IS_PLAYING_BREAK_CHANGED /* = 'isPlayingBreakChanged' */,
    IS_SEEKING_CHANGED /* = 'isSeekingChanged' */,
    LIVE_SEEKABLE_RANGE_CHANGED /* = 'liveSeekableRangeChanged' */,
    MEDIA_CATEGORY_CHANGED /* = 'mediaCategoryChanged' */,
    MEDIA_CHANGED /* = 'mediaChanged' */,
    MEDIA_SESSION_ID_CHANGED /* = 'mediaSessionIdChanged' */,
    MEDIA_START_ABSOLUTE_TIME_CHANGED /* = 'mediaStartAbsoluteTimeChanged' */,
    METADATA_CHANGED /* = 'metadataChanged' */,
    NEXT_SUBTITLE_CHANGED /* = 'nextSubtitleChanged' */,
    NEXT_THUMBNAIL_URL_CHANGED /* = 'nextThumbnailUrlChanged' */,
    NEXT_TITLE_CHANGED /* = 'nextTitleChanged' */,
    NUMBER_BREAK_CLIPS_CHANGED /* = 'numberBreakClipsChanged' */,
    PLAYBACK_RATE_CHANGED /* = 'playbackRateChanged' */,
    PRELOADING_NEXT_CHANGED /* = 'preloadingNextChanged' */,
    PRESENTATION_CHANGED /* = 'presentationChanged' */,
    QUEUE_DATA_CHANGED /* = 'queueDataChanged' */,
    SECTION_DURATION_CHANGED /* = 'sectionDurationChanged' */,
    SECTION_START_TIME_IN_MEDIA_CHANGED /* = 'sectionStartTimeInMediaChanged' */,
    STATE_CHANGED /* = 'stateChanged' */,
    SUBTITLE_CHANGED /* = 'subtitleChanged' */,
    SUPPORTED_MEDIA_COMMANDS_CHANGED /* = 'supportedMediaCommandsChanged' */,
    THUMBNAIL_URL_CHANGED /* = 'thumbnailUrlChanged' */,
    TITLE_CHANGED /* = 'titleChanged' */,
    WHEN_SKIPPABLE_CHANGED /* = 'whenSkippableChanged' */
}

external open class ApplicationData(name: String, iconUrl: String, groupName: String = definedExternally, isRemoteControl: Boolean = definedExternally) {
    open var groupName: String
    open var iconUrl: String
    open var isRemoteControl: Boolean
    open var name: String
}

external open class PlayerDataChangedEvent(type: PlayerDataEventType, field: String, value: Any) {
    open var field: String
    open var type: PlayerDataEventType
    open var value: Any
}

external open class PlayerDataBinder {
    constructor(playerData: Any?)
    constructor(playerData: PlayerData)
    open var addEventListener: (type: PlayerDataEventType, listener: PlayerDataChangedEventHandler) -> Unit
    open var removeEventListener: (type: PlayerDataEventType, listener: PlayerDataChangedEventHandler) -> Unit
}

external open class PlayerData {
    open var activeTrackIds: Array<Number>
    open var applicationData: ApplicationData
    open var breakPercentagePositions: Array<Number>
    open var breakTitle: String
    open var currentBreakClipNumber: Number
    open var currentTime: Number
    open var customState: Any?
    open var displayStatus: Boolean
    open var displayType: String
    open var duration: Number
    open var isAtLiveEdge: Boolean
    open var isBreakSkippable: Boolean
    open var isLive: Boolean
    open var isPlayingBreak: Boolean
    open var isSeeking: Boolean
    open var liveSeekableRange: LiveSeekableRange
    open var media: MediaInformation
    open var mediaCategory: MediaCategory
    open var mediaSessionId: Number
    open var mediaStartAbsoluteTime: Number
    open var metadata: dynamic /* cast.MediaMetadata | Any? */
    open var nextSubtitle: String
    open var nextThumbnailUrl: String
    open var nextTitle: String
    open var numberBreakClips: Number
    open var playbackRate: Number
    open var preloadingNext: Boolean
    open var queueData: QueueData
    open var sectionDuration: Number
    open var sectionStartTimeInMedia: Number
    open var state: State
    open var thumbnailUrl: String
    open var title: String
    open var whenSkippable: Number
}