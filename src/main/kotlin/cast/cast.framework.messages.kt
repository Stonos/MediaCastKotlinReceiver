@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "EXTERNAL_DELEGATION"
)
@file:JsQualifier("cast.framework.messages")

package cast

external enum class CaptionMimeType {
    CEA608 /* = 'text/cea608' */,
    TTML /* = 'application/ttml+xml' */,
    TTML_MP4 /* = 'application/mp4' */,
    VTT /* = 'text/vtt' */
}

external enum class Command {
    PAUSE /* = 1 */,
    SEEK /* = 2 */,
    STREAM_VOLUME /* = 4 */,
    STREAM_MUTE /* = 8 */,
    QUEUE_NEXT /* = 64 */,
    QUEUE_PREV /* = 128 */,
    QUEUE_SHUFFLE /* = 256 */,
    SKIP_AD /* = 512 */,
    QUEUE_REPEAT_ALL /* = 1024 */,
    QUEUE_REPEAT_ONE /* = 2048 */,
    QUEUE_REPEAT /* = 3072 */,
    EDIT_TRACKS /* = 4096 */,
    PLAYBACK_RATE /* = 8192 */,
    ALL_BASIC_MEDIA /* = 12303 */,
    LIKE /* = 16384 */,
    DISLIKE /* = 32768 */,
    FOLLOW /* = 65536 */,
    UNFOLLOW /* = 131072 */,
    STREAM_TRANSFER /* = 262144 */
}

external enum class ContainerType {
    GENERIC_CONTAINER /* = 0 */,
    AUDIOBOOK_CONTAINER /* = 1 */
}

external enum class ContentFilteringMode {
    FILTER_EXPLICIT /* = 'FILTER_EXPLICIT' */
}

external enum class ErrorReason {
    APP_ERROR /* = 'APP_ERROR' */,
    AUTHENTICATION_EXPIRED /* = 'AUTHENTICATION_EXPIRED' */,
    CONCURRENT_STREAM_LIMIT /* = 'CONCURRENT_STREAM_LIMIT' */,
    CONTENT_ALREADY_PLAYING /* = 'CONTENT_ALREADY_PLAYING' */,
    CONTENT_FILTERED /* = 'CONTENT_FILTERED' */,
    DUPLICATE_REQUEST_ID /* = 'DUPLICATE_REQUEST_ID' */,
    END_OF_QUEUE /* = 'END_OF_QUEUE' */,
    GENERIC_LOAD_ERROR /* = 'GENERIC_LOAD_ERROR' */,
    INVALID_COMMAND /* = 'INVALID_COMMAND' */,
    INVALID_MEDIA_SESSION_ID /* = 'INVALID_MEDIA_SESSION_ID' */,
    INVALID_PARAMS /* = 'INVALID_PARAMS' */,
    INVALID_REQUEST /* = 'INVALID_REQUEST' */,
    LANGUAGE_NOT_SUPPORTED /* = 'LANGUAGE_NOT_SUPPORTED' */,
    NOT_AVAILABLE_IN_REGION /* = 'NOT_AVAILABLE_IN_REGION' */,
    NOT_SUPPORTED /* = 'NOT_SUPPORTED' */,
    PARENTAL_CONTROL_RESTRICTED /* = 'PARENTAL_CONTROL_RESTRICTED' */,
    PREMIUM_ACCOUNT_REQUIRED /* = 'PREMIUM_ACCOUNT_REQUIRED' */,
    SKIP_LIMIT_REACHED /* = 'SKIP_LIMIT_REACHED' */,
    VIDEO_DEVICE_REQUIRED /* = 'VIDEO_DEVICE_REQUIRED' */
}

external enum class ErrorType {
    ERROR /* = 'ERROR' */,
    INVALID_PLAYER_STATE /* = 'INVALID_PLAYER_STATE' */,
    INVALID_REQUEST /* = 'INVALID_REQUEST' */,
    LOAD_CANCELLED /* = 'LOAD_CANCELLED' */,
    LOAD_FAILED /* = 'LOAD_FAILED' */
}

external enum class ExtendedPlayerState {
    LOADING /* = 'LOADING' */
}

external enum class FocusState {
    IN_FOCUS /* = 'IN_FOCUS' */,
    NOT_IN_FOCUS /* = 'NOT_IN_FOCUS' */
}

external enum class GetStatusOptions {
    NO_METADATA /* = 1 */,
    NO_QUEUE_ITEMS /* = 2 */
}

external enum class HdrType {
    DV /* = 'dv' */,
    HDR /* = 'hdr' */,
    SDR /* = 'sdr' */
}

external enum class HlsSegmentFormat {
    AAC /* = 'aac' */,
    AC3 /* = 'ac3' */,
    E_AC3 /* = 'e_ac3' */,
    FMP4 /* = 'fmp4' */,
    MP3 /* = 'mp3' */,
    TS /* = 'ts' */,
    TS_AAC /* = 'ts_aac' */
}

external enum class HlsVideoSegmentFormat {
    FMP4 /* = 'fmp4' */,
    MPEG2_TS /* = 'mpeg2_ts' */
}

external enum class IdleReason {
    CANCELLED /* = 'CANCELLED' */,
    ERROR /* = 'ERROR' */,
    FINISHED /* = 'FINISHED' */,
    INTERRUPTED /* = 'INTERRUPTED' */
}

external enum class MediaCategory {
    AUDIO /* = 'AUDIO' */,
    IMAGE /* = 'IMAGE' */,
    VIDEO /* = 'VIDEO' */
}

external enum class MessageType {
    CLOUD_STATUS /* = 'CLOUD_STATUS' */,
    CUSTOM_COMMAND /* = 'CUSTOM_COMMAND' */,
    CUSTOM_STATE /* = 'CUSTOM_STATE' */,
    DISPLAY_STATUS /* = 'DISPLAY_STATUS' */,
    EDIT_AUDIO_TRACKS /* = 'EDIT_AUDIO_TRACKS' */,
    EDIT_TRACKS_INFO /* = 'EDIT_TRACKS_INFO' */,
    EXECUTE_ACTION_SCRIPT /* = 'EXECUTE_ACTION_SCRIPT' */,
    FOCUS_STATE /* = 'FOCUS_STATE' */,
    GET_STATUS /* = 'GET_STATUS' */,
    LOAD /* = 'LOAD' */,
    LOAD_BY_ENTITY /* = 'LOAD_BY_ENTITY' */,
    MEDIA_STATUS /* = 'MEDIA_STATUS' */,
    PAUSE /* = 'PAUSE' */,
    PLAY /* = 'PLAY' */,
    PLAY_AGAIN /* = 'PLAY_AGAIN' */,
    PLAY_STRING /* = 'PLAY_STRING' */,
    PRECACHE /* = 'PRECACHE' */,
    PRELOAD /* = 'PRELOAD' */,
    QUEUE_CHANGE /* = 'QUEUE_CHANGE' */,
    QUEUE_GET_ITEMS /* = 'QUEUE_GET_ITEMS' */,
    QUEUE_GET_ITEM_IDS /* = 'QUEUE_GET_ITEM_IDS' */,
    QUEUE_GET_ITEM_RANGE /* = 'QUEUE_GET_ITEM_RANGE' */,
    QUEUE_INSERT /* = 'QUEUE_INSERT' */,
    QUEUE_ITEMS /* = 'QUEUE_ITEMS' */,
    QUEUE_ITEM_IDS /* = 'QUEUE_ITEM_IDS' */,
    QUEUE_LOAD /* = 'QUEUE_LOAD' */,
    QUEUE_NEXT /* = 'QUEUE_NEXT' */,
    QUEUE_PREV /* = 'QUEUE_PREV' */,
    QUEUE_REMOVE /* = 'QUEUE_REMOVE' */,
    QUEUE_REORDER /* = 'QUEUE_REORDER' */,
    QUEUE_SHUFFLE /* = 'QUEUE_SHUFFLE' */,
    QUEUE_UPDATE /* = 'QUEUE_UPDATE' */,
    REFRESH_CREDENTIALS /* = 'REFRESH_CREDENTIALS' */,
    RESUME_SESSION /* = 'RESUME_SESSION' */,
    SEEK /* = 'SEEK' */,
    SESSION_STATE /* = 'SESSION_STATE' */,
    SET_CREDENTIALS /* = 'SET_CREDENTIALS' */,
    SET_PLAYBACK_RATE /* = 'SET_PLAYBACK_RATE' */,
    SET_VOLUME /* = 'SET_VOLUME' */,
    SHOW_REMOTE_CONTROL_OVERLAY /* = 'SHOW_REMOTE_CONTROL_OVERLAY' */,
    SKIP_AD /* = 'SKIP_AD' */,
    STOP /* = 'STOP' */,
    STORE_SESSION /* = 'STORE_SESSION' */,
    USER_ACTION /* = 'USER_ACTION' */
}

external enum class MetadataType {
    GENERIC /* = 0 */,
    MOVIE /* = 1 */,
    TV_SHOW /* = 2 */,
    MUSIC_TRACK /* = 3 */,
    PHOTO /* = 4 */,
    AUDIOBOOK_CHAPTER /* = 5 */
}

external enum class PlayStringId {
    FREE_TRIAL_ABOUT_TO_EXPIRE /* = 'FREE_TRIAL_ABOUT_TO_EXPIRE' */,
    PLAYING_ALTERNATE_MIX /* = 'PLAYING_ALTERNATE_MIX' */,
    STREAM_HIJACKED /* = 'STREAM_HIJACKED' */,
    SUBSCRIPTION_ABOUT_TO_EXPIRE /* = 'SUBSCRIPTION_ABOUT_TO_EXPIRE' */
}

external enum class PlayerState {
    BUFFERING /* = 'BUFFERING' */,
    IDLE /* = 'IDLE' */,
    PAUSED /* = 'PAUSED' */,
    PLAYING /* = 'PLAYING' */
}

external enum class QueueChangeType {
    INSERT /* = 'INSERT' */,
    ITEMS_CHANGE /* = 'ITEMS_CHANGE' */,
    NO_CHANGE /* = 'NO_CHANGE' */,
    REMOVE /* = 'REMOVE' */,
    UPDATE /* = 'UPDATE' */
}

external enum class QueueType {
    ALBUM /* = 'ALBUM' */,
    AUDIOBOOK /* = 'AUDIOBOOK' */,
    LIVE_TV /* = 'LIVE_TV' */,
    MOVIE /* = 'MOVIE' */,
    PLAYLIST /* = 'PLAYLIST' */,
    PODCAST_SERIES /* = 'PODCAST_SERIES' */,
    RADIO_STATION /* = 'RADIO_STATION' */,
    TV_SERIES /* = 'TV_SERIES' */,
    VIDEO_PLAYLIST /* = 'VIDEO_PLAYLIST' */
}

external enum class RepeatMode {
    REPEAT_ALL /* = 'REPEAT_ALL' */,
    REPEAT_ALL_AND_SHUFFLE /* = 'REPEAT_ALL_AND_SHUFFLE' */,
    REPEAT_OFF /* = 'REPEAT_OFF' */,
    REPEAT_SINGLE /* = 'REPEAT_SINGLE' */
}

external enum class SeekResumeState {
    PLAYBACK_PAUSE /* = 'PLAYBACK_PAUSE' */,
    PLAYBACK_START /* = 'PLAYBACK_START' */
}

external enum class StreamingProtocolType {
    UNKNOWN /* = 0 */,
    MPEG_DASH /* = 1 */,
    HLS /* = 2 */,
    SMOOTH_STREAMING /* = 3 */
}

external enum class StreamType {
    BUFFERED /* = 'BUFFERED' */,
    LIVE /* = 'LIVE' */,
    NONE /* = 'NONE' */
}

external enum class TextTrackEdgeType {
    DEPRESSED /* = 'DEPRESSED' */,
    DROP_SHADOW /* = 'DROP_SHADOW' */,
    NONE /* = 'NONE' */,
    OUTLINE /* = 'OUTLINE' */,
    RAISED /* = 'RAISED' */
}

external enum class TextTrackFontGenericFamily {
    CASUAL /* = 'CASUAL' */,
    CURSIVE /* = 'CURSIVE' */,
    MONOSPACED_SANS_SERIF /* = 'MONOSPACED_SANS_SERIF' */,
    MONOSPACED_SERIF /* = 'MONOSPACED_SERIF' */,
    SANS_SERIF /* = 'SANS_SERIF' */,
    SERIF /* = 'SERIF' */,
    SMALL_CAPITALS /* = 'SMALL_CAPITALS' */
}

external enum class TextTrackFontStyle {
    BOLD /* = 'BOLD' */,
    BOLD_ITALIC /* = 'BOLD_ITALIC' */,
    ITALIC /* = 'ITALIC' */,
    NORMAL /* = 'NORMAL' */
}

external enum class TextTrackType {
    CAPTIONS /* = 'CAPTIONS' */,
    CHAPTERS /* = 'CHAPTERS' */,
    DESCRIPTIONS /* = 'DESCRIPTIONS' */,
    METADATA /* = 'METADATA' */,
    SUBTITLES /* = 'SUBTITLES' */
}

external enum class TextTrackWindowType {
    NONE /* = 'NONE' */,
    NORMAL /* = 'NORMAL' */,
    ROUNDED_CORNERS /* = 'ROUNDED_CORNERS' */
}

external enum class TrackType {
    AUDIO /* = 'AUDIO' */,
    TEXT /* = 'TEXT' */,
    VIDEO /* = 'VIDEO' */
}

external enum class UserAction {
    DISLIKE /* = 'DISLIKE' */,
    FLAG /* = 'FLAG' */,
    FOLLOW /* = 'FOLLOW' */,
    LIKE /* = 'LIKE' */,
    SKIP_AD /* = 'SKIP_AD' */,
    UNFOLLOW /* = 'UNFOLLOW' */
}

external enum class UserActionContext {
    ALBUM /* = 'ALBUM' */,
    ARTIST /* = 'ARTIST' */,
    CHANNEL /* = 'CHANNEL' */,
    COACH /* = 'COACH' */,
    EPISODE /* = 'EPISODE' */,
    MOVIE /* = 'MOVIE' */,
    PLAYER /* = 'PLAYER' */,
    PLAYLIST /* = 'PLAYLIST' */,
    SERIES /* = 'SERIES' */,
    TEAM /* = 'TEAM' */,
    TRACK /* = 'TRACK' */,
    UNKNOWN_CONTEXT /* = 'UNKNOWN_CONTEXT' */
}

external open class RefreshCredentialsRequestData {
    @nativeGetter
    open operator fun get(key: String): Any?
    @nativeSetter
    open operator fun set(key: String, value: Any)
}

external open class VolumeRequestData : RequestData {
    open var volume: Volume
}

external open class Volume {
    open var level: Number
    open var muted: Boolean
}

external open class VideoInformation(width: Number, height: Number, hdrType: HdrType) {
    open var width: Number
    open var height: Number
    open var hdrType: HdrType
}

external open class VastAdsRequest {
    open var adsResponse: String
    open var adTagUrl: String
}

external open class UserActionRequestData : RequestData {
    open var clear: Boolean
    open var source: String
    open var userAction: UserAction
    open var userActionContext: UserActionContext
}

external open class TvShowMediaMetadata {
    open var episode: Number
    open var episodeNumber: Number
    open var episodeTitle: String
    open var images: Array<Image>
    open var originalAirdate: String
    open var releaseYear: Number
    open var season: Number
    open var seasonNumber: Number
    open var seriesTitle: String
    open var title: String
}

external open class Track(trackId: Number, trackType: TrackType) {
    open var customData: String
    open var language: String
    open var name: String
    open var subtype: String
    open var trackContentId: String
    open var trackContentType: String
    open var trackId: Number
    open var type: TrackType
}

external open class TextTrackStyle {
    open var backgroundColor: String
    open var customData: Any
    open var edgeColor: String
    open var edgeType: TextTrackEdgeType
    open var fontFamily: String
    open var fontGenericFamily: TextTrackFontGenericFamily
    open var fontScale: Number
    open var fontStyle: TextTrackFontStyle
    open var foregroundColor: String
    open var windowColor: String
    open var windowRoundedCornerRadius: Number
    open var windowType: TextTrackWindowType
}

external open class StoreSessionResponseData(sessionState: SessionState) : RequestData {
    open var sessionState: SessionState
}

external open class StoreSessionRequestData : RequestData

external open class SetPlaybackRateRequestData : RequestData {
    open var playbackRate: Number
    open var relativePlaybackRate: Number
}

external open class SetCredentialsRequestData : RequestData {
    open var credentials: String
    open var forRequestId: Number
    open var source: String
}

external open class SessionState {
    open var customData: Any?
    open var loadRequestData: LoadRequestData
}

external open class SeekRequestData : RequestData {
    open var currentTime: Number
    open var relativeTime: Number
    open var resumeState: SeekResumeState
}

external open class SeekableRange(start: Number = definedExternally, end: Number = definedExternally) {
    open var end: Number
    open var start: Number
}

external open class ResumeSessionRequestData : RequestData {
    open var sessionState: SessionState
}

external open class RequestData(type: MessageType) {
    open var customData: Any
    open var mediaSessionId: Number
    open var requestId: Number
    open var type: MessageType
}

external open class QueueUpdateRequestData : RequestData {
    open var currentItemId: Number
    open var currentTime: Number
    open var items: Array<QueueItem>
    open var jump: Number
    open var repeatMode: RepeatMode
    open var shuffle: Boolean
}

external open class QueueReorderRequestData(itemIds: Array<Number>) : RequestData {
    open var currentItemId: Number
    open var currentTime: Number
    open var insertBefore: Number
    open var itemIds: Array<Number>
}

external open class QueueRemoveRequestData(itemIds: Array<Number>) : RequestData {
    open var currentItemId: Number
    open var currentTime: Number
    open var itemIds: Array<Number>
}

external open class QueueLoadRequestData(items: Array<QueueItem>) : RequestData {
    open var currentTime: Number
    open var items: Array<QueueItem>
    open var repeatMode: RepeatMode
    open var startIndex: Number
}

external open class QueueItem(opt_itemId: Number = definedExternally) {
    open var activeTrackIds: Array<Number>
    open var autoplay: Boolean
    open var customData: Any
    open var itemId: Number
    open var media: MediaInformation
    open var playbackDuration: Number
    open var preloadTime: Number
    open var startTime: Number
}

external open class QueueInsertRequestData(items: Array<QueueItem>) : RequestData {
    open var currentItemId: Number
    open var currentItemIndex: Number
    open var currentTime: Number
    open var insertBefore: Number
    open var items: Array<QueueItem>
}

external open class QueueIds {
    open var itemIds: Array<Number>
    open var requestId: Number
    open var type: MessageType
}

external open class ContainerMetadata(type: ContainerType = definedExternally) {
    open var containerDuration: Number
    open var containerImages: Array<Image>
    open var containerType: ContainerType
    open var sections: Array<MediaMetadata>
    open var title: String
}

external open class QueueData(id: String = definedExternally, name: String = definedExternally, description: String = definedExternally, repeatMode: RepeatMode = definedExternally, items: Array<QueueItem> = definedExternally, startIndex: Number = definedExternally, startTime: Number = definedExternally) {
    open var containerMetadata: ContainerMetadata
    open var description: String
    open var entity: String
    open var id: String
    open var items: Array<QueueItem>
    open var name: String
    open var queueType: QueueType
    open var repeatMode: RepeatMode
    open var shuffle: Boolean
    open var startIndex: Number
    open var startTime: Number
}

external open class QueueChange {
    open var changeType: QueueChangeType
    open var insertBefore: Number
    open var itemIds: Array<Number>
    open var requestId: Number
    open var sequenceNumber: Number
    open var type: MessageType
}

external open class PreloadRequestData(itemId: Number) : LoadRequestData {
    open var itemId: Number
}

external open class PrecacheRequestData(data: String = definedExternally) : LoadRequestData {
    open var precacheData: String
}

external open class PlayStringRequestData(stringId: PlayStringId, opt_arguments: Array<String> = definedExternally) {
    open var arguments: Array<String>
    open var stringId: PlayStringId
}

external open class PhotoMediaMetadata {
    open var artist: String
    open var creationDateTime: String
    open var height: Number
    open var images: Array<Image>
    open var latitude: Number
    open var location: String
    open var longitude: Number
    open var title: String
    open var width: Number
}

external open class MusicTrackMediaMetadata {
    open var albumArtist: String
    open var albumName: String
    open var artist: String
    open var artistName: String
    open var composer: String
    open var discNumber: Number
    open var images: Array<Image>
    open var releaseDate: String
    open var releaseYear: String
    open var songName: String
    open var title: String
    open var trackNumber: Number
}

external open class MovieMediaMetadata {
    open var images: Array<Image>
    open var releaseDate: String
    open var releaseYear: Number
    open var studio: String
    open var subtitle: String
    open var title: String
}

external open class MediaStatus {
    open var activeTrackIds: Array<Number>
    open var breakStatus: BreakStatus
    open var currentItemId: Number
    open var currentTime: Number
    open var customData: Any
    open var extendedStatus: ExtendedMediaStatus
    open var idleReason: IdleReason
    open var items: Array<QueueItem>
    open var liveSeekableRange: LiveSeekableRange
    open var loadingItemId: Number
    open var media: MediaInformation
    open var mediaSessionId: Number
    open var playbackRate: Number
    open var playerState: PlayerState
    open var preloadedItemId: Number
    open var queueData: QueueData
    open var repeatMode: RepeatMode
    open var supportedMediaCommands: Number
    open var type: MessageType
    open var videoInfo: VideoInformation
    open var volume: Volume
}

external open class MediaMetadata(type: MetadataType) {
    open var metadataType: MetadataType
}

external open class MediaInformation {
    open var breakClips: Array<BreakClip>
    open var breaks: Array<Break>
    open var contentId: String
    open var contentType: String
    open var contentUrl: String
    open var customData: dynamic
    open var duration: Number
    open var entity: String
    open var hlsSegmentFormat: HlsSegmentFormat
    open var metadata: dynamic /* cast.MediaMetadata | cast.GenericMediaMetadata | cast.MovieMediaMetadata | cast.MusicTrackMediaMetadata | cast.PhotoMediaMetadata | cast.TvShowMediaMetadata */
    open var streamType: StreamType
    open var textTrackStyle: TextTrackStyle
    open var tracks: Array<Track>
    open var vmapAdsRequest: VastAdsRequest
}

external open class LoadRequestData : RequestData {
    open var activeTrackIds: Array<Number>
    open var autoplay: Boolean
    open var credentials: String
    open var credentialsType: String
    open var currentTime: Number
    open var loadOptions: LoadOptions
    open var media: MediaInformation
    open var playbackRate: Number
    open var queueData: QueueData
}

external open class LoadOptions {
    open var contentFilteringMode: ContentFilteringMode
}

external open class LoadByEntityRequestData {
    open var entity: String
    open var shuffle: Boolean
    open var source: String
}

external open class LiveSeekableRange(start: Number = definedExternally, end: Number = definedExternally, isMovingWindow: Boolean = definedExternally, isLiveDone: Boolean = definedExternally) {
    open var isLiveDone: Boolean
    open var isMovingWindow: Boolean
}

external open class ItemsInfo {
    open var items: Array<QueueItem>
    open var requestId: Number
    open var type: MessageType
}

external open class Image(url: String) {
    open var height: Number
    open var url: String
    open var width: Number
}

external open class GetStatusRequestData : RequestData {
    open var options: GetStatusOptions
}

external open class GetItemsInfoRequestData(itemIds: Array<Number>) : RequestData {
    open var itemIds: Array<Number>
}

external open class GenericMediaMetadata : MediaMetadata {
    open var images: Array<Image>
    open var releaseDate: String
    open var releaseYear: Number
    open var subtitle: String
    open var title: String
}

external open class FocusStateRequestData : RequestData {
    open var state: FocusState
}

external open class FetchItemsRequestData(itemId: Number, nextCount: Number, prevCount: Number) : RequestData {
    open var itemId: Number
    open var nextCount: Number
    open var prevCount: Number
}

external open class ExtendedMediaStatus(playerState: MediaInformation, opt_media: MediaInformation = definedExternally) {
    open var media: MediaInformation
    open var playerState: ExtendedPlayerState
}

external open class MessageErrorEvent(detailedErrorCode: DetailedErrorCode = definedExternally, error: Any = definedExternally) : Event {
    open var detailedErrorCode: DetailedErrorCode
    open var error: Any
}

external open class ErrorData(type: ErrorType) {
    open var customData: Any
    open var requestId: Number
}

external open class EditTracksInfoRequestData : RequestData {
    open var activeTrackIds: Array<Number>
    open var enableTextTracks: Boolean
    open var isSuggestedLanguage: Boolean
    open var language: String
    open var textTrackStyle: TextTrackStyle
}

external open class EditAudioTracksRequestData : RequestData {
    open var isSuggestedLanguage: Boolean
    open var language: String
}

external open class DisplayStatusRequestData : RequestData {
    open var source: String
}

external open class CustomCommandRequestData : RequestData {
    open var data: String
    open var source: String
}

external open class CloudMediaStatus : MediaStatus

external open class BreakStatus(currentBreakTime: Number, currentBreakClipTime: Number) {
    open var breakClipId: String
    open var breakId: String
    open var currentBreakClipTime: Number
    open var currentBreakTime: Number
    open var whenSkippable: Number
}

external open class BreakClip(id: String) {
    open var clickThroughUrl: String
    open var contentId: String
    open var contentType: String
    open var contentUrl: String
    open var customData: Any
    open var duration: Number
    open var hlsSegmentFormat: HlsSegmentFormat
    open var id: String
    open var posterUrl: String
    open var title: String
    open var vastAdsRequest: VastAdsRequest
    open var whenSkippable: Number
}

external open class Break(id: String, breakClipIds: Array<String>, position: Number) {
    open var breakClipIds: Array<String>
    open var duration: Number
    open var id: String
    open var isEmbedded: Boolean
    open var isWatched: Boolean
    open var position: Number
}