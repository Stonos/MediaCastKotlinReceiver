@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

package cast

import kotlin.js.*
import org.khronos.webgl.*

external enum class PlayerEventType {
    ALL /* = '*' */,
    ABORT /* = 'ABORT' */,
    CAN_PLAY /* = 'CAN_PLAY' */,
    CAN_PLAY_THROUGH /* = 'CAN_PLAY_THROUGH' */,
    DURATION_CHANGE /* = 'DURATION_CHANGE' */,
    EMPTIED /* = 'EMPTIED' */,
    ENDED /* = 'ENDED' */,
    LOADED_DATA /* = 'LOADED_DATA' */,
    LOADED_METADATA /* = 'LOADED_METADATA' */,
    LOAD_START /* = 'LOAD_START' */,
    PAUSE /* = 'PAUSE' */,
    PLAY /* = 'PLAY' */,
    PLAYING /* = 'PLAYING' */,
    PROGRESS /* = 'PROGRESS' */,
    RATE_CHANGE /* = 'RATE_CHANGE' */,
    SEEKED /* = 'SEEKED' */,
    SEEKING /* = 'SEEKING' */,
    STALLED /* = 'STALLED' */,
    TIME_UPDATE /* = 'TIME_UPDATE' */,
    SUSPEND /* = 'SUSPEND' */,
    WAITING /* = 'WAITING' */,
    BITRATE_CHANGED /* = 'BITRATE_CHANGED' */,
    BREAK_STARTED /* = 'BREAK_STARTED' */,
    BREAK_ENDED /* = 'BREAK_ENDED' */,
    BREAK_CLIP_LOADING /* = 'BREAK_CLIP_LOADING' */,
    BREAK_CLIP_STARTED /* = 'BREAK_CLIP_STARTED' */,
    BREAK_CLIP_ENDED /* = 'BREAK_CLIP_ENDED' */,
    BUFFERING /* = 'BUFFERING' */,
    CACHE_LOADED /* = 'CACHE_LOADED' */,
    CACHE_HIT /* = 'CACHE_HIT' */,
    CACHE_INSERTED /* = 'CACHE_INSERTED' */,
    CLIP_STARTED /* = 'CLIP_STARTED' */,
    CLIP_ENDED /* = 'CLIP_ENDED' */,
    EMSG /* = 'EMSG' */,
    ERROR /* = 'ERROR' */,
    ID3 /* = 'ID3' */,
    MEDIA_STATUS /* = 'MEDIA_STATUS' */,
    CUSTOM_STATE /* = 'CUSTOM_STATE' */,
    MEDIA_INFORMATION_CHANGED /* = 'MEDIA_INFORMATION_CHANGED' */,
    MEDIA_FINISHED /* = 'MEDIA_FINISHED' */,
    PLAYER_PRELOADING /* = 'PLAYER_PRELOADING' */,
    PLAYER_PRELOADING_CANCELLED /* = 'PLAYER_PRELOADING_CANCELLED' */,
    PLAYER_LOAD_COMPLETE /* = 'PLAYER_LOAD_COMPLETE' */,
    PLAYER_LOADING /* = 'PLAYER_LOADING' */,
    SEGMENT_DOWNLOADED /* = 'SEGMENT_DOWNLOADED' */,
    REQUEST_SEEK /* = 'REQUEST_SEEK' */,
    REQUEST_LOAD /* = 'REQUEST_LOAD' */,
    REQUEST_STOP /* = 'REQUEST_STOP' */,
    REQUEST_PAUSE /* = 'REQUEST_PAUSE' */,
    REQUEST_PLAY /* = 'REQUEST_PLAY' */,
    REQUEST_PLAY_AGAIN /* = 'REQUEST_PLAY_AGAIN' */,
    REQUEST_PLAYBACK_RATE_CHANGE /* = 'REQUEST_PLAYBACK_RATE_CHANGE' */,
    REQUEST_SKIP_AD /* = 'REQUEST_SKIP_AD' */,
    REQUEST_VOLUME_CHANGE /* = 'REQUEST_VOLUME_CHANGE' */,
    REQUEST_EDIT_TRACKS_INFO /* = 'REQUEST_EDIT_TRACKS_INFO' */,
    REQUEST_EDIT_AUDIO_TRACKS /* = 'REQUEST_EDIT_AUDIO_TRACKS' */,
    REQUEST_SET_CREDENTIALS /* = 'REQUEST_SET_CREDENTIALS' */,
    REQUEST_LOAD_BY_ENTITY /* = 'REQUEST_LOAD_BY_ENTITY' */,
    REQUEST_USER_ACTION /* = 'REQUEST_USER_ACTION' */,
    REQUEST_DISPLAY_STATUS /* = 'REQUEST_DISPLAY_STATUS' */,
    REQUEST_CUSTOM_COMMAND /* = 'REQUEST_CUSTOM_COMMAND' */,
    REQUEST_FOCUS_STATE /* = 'REQUEST_FOCUS_STATE' */,
    REQUEST_QUEUE_LOAD /* = 'REQUEST_QUEUE_LOAD' */,
    REQUEST_QUEUE_INSERT /* = 'REQUEST_QUEUE_INSERT' */,
    REQUEST_QUEUE_UPDATE /* = 'REQUEST_QUEUE_UPDATE' */,
    REQUEST_QUEUE_REMOVE /* = 'REQUEST_QUEUE_REMOVE' */,
    REQUEST_QUEUE_REORDER /* = 'REQUEST_QUEUE_REORDER' */,
    REQUEST_QUEUE_GET_ITEM_RANGE /* = 'REQUEST_QUEUE_GET_ITEM_RANGE' */,
    REQUEST_QUEUE_GET_ITEMS /* = 'REQUEST_QUEUE_GET_ITEMS' */,
    REQUEST_QUEUE_GET_ITEM_IDS /* = 'REQUEST_QUEUE_GET_ITEM_IDS' */,
    REQUEST_PRECACHE /* = 'REQUEST_PRECACHE' */,
    LIVE_IS_MOVING_WINDOW_CHANGED /* = 'LIVE_IS_MOVING_WINDOW_CHANGED' */,
    LIVE_ENDED /* = 'LIVE_ENDED' */
}

external enum class DetailedErrorCode {
    MEDIA_UNKNOWN /* = 100 */,
    MEDIA_ABORTED /* = 101 */,
    MEDIA_DECODE /* = 102 */,
    MEDIA_NETWORK /* = 103 */,
    MEDIA_SRC_NOT_SUPPORTED /* = 104 */,
    SOURCE_BUFFER_FAILURE /* = 110 */,
    MEDIAKEYS_UNKNOWN /* = 200 */,
    MEDIAKEYS_NETWORK /* = 201 */,
    MEDIAKEYS_UNSUPPORTED /* = 202 */,
    MEDIAKEYS_WEBCRYPTO /* = 203 */,
    NETWORK_UNKNOWN /* = 300 */,
    SEGMENT_NETWORK /* = 301 */,
    HLS_NETWORK_MASTER_PLAYLIST /* = 311 */,
    HLS_NETWORK_PLAYLIST /* = 312 */,
    HLS_NETWORK_NO_KEY_RESPONSE /* = 313 */,
    HLS_NETWORK_KEY_LOAD /* = 314 */,
    HLS_NETWORK_INVALID_SEGMENT /* = 315 */,
    HLS_SEGMENT_PARSING /* = 316 */,
    DASH_NETWORK /* = 321 */,
    DASH_NO_INIT /* = 322 */,
    SMOOTH_NETWORK /* = 331 */,
    SMOOTH_NO_MEDIA_DATA /* = 332 */,
    MANIFEST_UNKNOWN /* = 400 */,
    HLS_MANIFEST_MASTER /* = 411 */,
    HLS_MANIFEST_PLAYLIST /* = 412 */,
    DASH_MANIFEST_UNKNOWN /* = 420 */,
    DASH_MANIFEST_NO_PERIODS /* = 421 */,
    DASH_MANIFEST_NO_MIMETYPE /* = 422 */,
    DASH_INVALID_SEGMENT_INFO /* = 423 */,
    SMOOTH_MANIFEST /* = 431 */,
    SEGMENT_UNKNOWN /* = 500 */,
    TEXT_UNKNOWN /* = 600 */,
    APP /* = 900 */,
    BREAK_CLIP_LOADING_ERROR /* = 901 */,
    BREAK_SEEK_INTERCEPTOR_ERROR /* = 902 */,
    IMAGE_ERROR /* = 903 */,
    LOAD_INTERRUPTED /* = 904 */,
    LOAD_FAILED /* = 905 */,
    MEDIA_ERROR_MESSAGE /* = 906 */,
    GENERIC /* = 999 */
}

external open class SegmentDownloadedEvent(downloadTime: Number = definedExternally, size: Number = definedExternally) : Event {
    open var downloadTime: Number
    open var size: Number
}

external open class RequestEvent(type: PlayerEventType, requestData: RequestData = definedExternally, senderId: String = definedExternally) : Event {
    open var requestData: RequestData
    open var senderId: String
}

external open class Event(type: PlayerEventType) {
    open var type: PlayerEventType
}

external open class MediaStatusEvent(type: PlayerEventType, mediaStatus: MediaStatus = definedExternally) : Event {
    open var mediaStatus: MediaStatus
}

external open class MediaPauseEvent(currentMediaTime: Number = definedExternally, ended: Boolean = definedExternally) : Event {
    open var ended: Boolean
}

external open class MediaFinishedEvent(currentMediaTime: Number = definedExternally, endedReason: String /* 'END_OF_STREAM' | 'ERROR' | 'STOPPED' | 'INTERRUPTED' | 'SKIPPED' | 'BREAK_SWITCH' */ = definedExternally) : Event {
    open var currentMediaTime: Number
    open var endedReason: String /* 'END_OF_STREAM' | 'ERROR' | 'STOPPED' | 'INTERRUPTED' | 'SKIPPED' | 'BREAK_SWITCH' */
}

external open class MediaElementEvent(type: PlayerEventType, currentMediaTime: Number = definedExternally) : Event {
    open var currentMediaTime: Number
}

external open class LoadEvent(type: PlayerEventType, media: MediaInformation = definedExternally) : Event {
    open var media: MediaInformation
}

external open class InbandTrackAddedEvent(track: Track) {
    open var track: Track
}

external open class Id3Event(segmentData: Uint8Array, timestamp: Number) : Event {
    open var segmentData: Uint8Array
    open var timestamp: Number
}

external open class EmsgEvent(emsgData: Any) : Event {
    open var endTime: Any
    open var eventDuration: Any
    open var id: Any
    open var messageData: Any
    open var presentationTimeDelta: Any
    open var schemeIdUri: Any
    open var segmentData: Any
    open var startTime: Any
    open var timescale: Any
    open var value: Any
}

external open class ClipEndedEvent(currentMediaTime: Number, endedReason: String /* 'END_OF_STREAM' | 'ERROR' | 'STOPPED' | 'INTERRUPTED' | 'SKIPPED' | 'BREAK_SWITCH' */ = definedExternally) : Event {
    open var currentMediaTime: Number
    open var endedReason: String /* 'END_OF_STREAM' | 'ERROR' | 'STOPPED' | 'INTERRUPTED' | 'SKIPPED' | 'BREAK_SWITCH' */
}

external open class CacheLoadedEvent(media: MediaInformation = definedExternally) : Event {
    open var media: MediaInformation
}

external open class CacheItemEvent(type: PlayerEventType, url: String) : Event {
    open var url: String
}

external open class BufferingEvent(isBuffering: Boolean) : Event {
    open var isBuffering: Boolean
}

external open class BreaksEvent(type: PlayerEventType, currentMediaTime: Number = definedExternally, index: Number = definedExternally, total: Number = definedExternally, whenSkippable: Number = definedExternally, endedReason: String /* 'END_OF_STREAM' | 'ERROR' | 'STOPPED' | 'INTERRUPTED' | 'SKIPPED' | 'BREAK_SWITCH' */ = definedExternally, breakClipId: String = definedExternally, breakId: String = definedExternally) : Event {
    open var breakId: String
    open var breakClipId: String
    open var currentMediaTime: Number
    open var endedReason: String /* 'END_OF_STREAM' | 'ERROR' | 'STOPPED' | 'INTERRUPTED' | 'SKIPPED' | 'BREAK_SWITCH' */
    open var index: Number
    open var total: Number
    open var whenSkippable: Number
}

external open class BitrateChangedEvent(totalBitrate: Number = definedExternally) {
    open var totalBitrate: Number
}

external open class ErrorEvent(detailedErrorCode: DetailedErrorCode = definedExternally, error: Any = definedExternally, reason: ErrorReason = definedExternally) : Event {
    open var detailedErrorCode: DetailedErrorCode
    open var error: Any
    open var reason: ErrorReason
}

external open class CustomStateEvent(state: Any) : Event {
    open var state: Any
}

external open class MediaInformationChangedEvent(media: MediaInformation = definedExternally) : Event {
    open var media: MediaInformation
}

external open class LiveStatusEvent(type: PlayerEventType, liveSeekableRange: LiveSeekableRange) : Event {
    open var liveSeekableRange: LiveSeekableRange
}