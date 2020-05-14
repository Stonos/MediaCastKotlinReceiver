@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

package cast

import kotlin.js.*

external enum class SystemEventType {
    ALLOW_GROUP_CHANGE /* = 'allowgroupchange' */,
    ERROR /* = 'error' */,
    FEEDBACK_STARTED /* = 'feedbackstarted' */,
    GROUP_CAPABILITIES /* = 'groupcapabilities' */,
    MAX_VIDEO_RESOLUTION_CHANGED /* = 'maxvideoresolutionchanged' */,
    PROXIMITY_CHANGED /* = 'proximitychanged' */,
    READY /* = 'ready' */,
    SENDER_CONNECTED /* = 'senderconnected' */,
    SENDER_DISCONNECTED /* = 'senderdisconnected' */,
    SHUTDOWN /* = 'shutdown' */,
    STANDBY_CHANGED /* = 'standbychanged' */,
    SYSTEM_VOLUME_CHANGED /* = 'systemvolumechanged' */,
    VISIBILITY_CHANGED /* = 'visibilitychanged' */
}

external enum class SystemState {
    NOT_STARTED /* = 'notstarted' */,
    READY /* = 'ready' */,
    STARTING /* = 'starting' */,
    STARTING_IN_BACKGROUND /* = 'startinginbackground' */,
    STOPPING /* = 'stopping' */,
    STOPPING_IN_BACKGROUND /* = 'stoppinginbackground' */
}

external enum class StandbyState {
    NOT_STANDBY /* = 'notstandby' */,
    STANDBY /* = 'standby' */,
    UNKNOWN /* = 'unknown' */
}

external enum class DisconnectReason {
    ERROR /* = 'error' */,
    REQUESTED_BY_SENDER /* = 'requested_by_sender' */,
    UNKNOWN /* = 'unknown' */
}

external open class VisibilityChangedEvent(isVisible: Boolean) {
    open var isVisible: Boolean
}

external interface SystemVolumeData {
    var level: Number
    var muted: Boolean
}

external open class SystemVolumeChangedEvent(volume: SystemVolumeData) : SystemEvent {
    override var data: Any
}

external open class StandbyChangedEvent(isStandby: Boolean) {
    open var isStandby: Boolean
}

external interface ShutdownEvent : SystemEvent {
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}

external open class SenderDisconnectedEvent(senderId: String, userAgent: String) : SystemEvent {
    open var senderId: String
    open var userAgent: String
    open var reason: DisconnectReason
}

external open class SenderConnectedEvent(senderId: String, userAgent: String) : SystemEvent {
    open var senderId: String
    open var userAgent: String
}

external interface Sender {
    var id: String
    var largeMessageSupported: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var userAgent: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ReadyEvent(applicationData: ApplicationData) {
    open var data: ApplicationData
}

external open class MaxVideoResolutionChangedEvent(height: Number) : SystemEvent {
    open var height: Number
}

external interface FeedbackStartedEvent : SystemEvent {
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}

external open class SystemEvent(type: SystemEventType, data: Any = definedExternally) {
    open var type: SystemEventType
    open var data: Any
}

external interface ApplicationDataa {
    fun id(): String
    fun launchingSenderId(): String
    fun name(): String
    fun namespaces(): Array<String>
    fun sessionId(): Number
}