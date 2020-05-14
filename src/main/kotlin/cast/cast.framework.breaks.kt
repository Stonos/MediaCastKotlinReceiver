@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

package cast

import kotlin.js.*

external open class BreakSeekData(seekFrom: Number, seekTo: Number, breaks: Array<Break>) {
    open var breaks: Array<Break>
    open var seekFrom: Number
    open var seekTo: Number
}

external open class BreakClipLoadInterceptorContext(brk: Break) {
    open var `break`: Break
}

external interface BreakManager {
    fun getBreakById(id: String): Break
    fun getBreakClipById(id: String): BreakClip
    fun getBreakClips(): Array<BreakClip>
    fun getBreaks(): Array<Break>
    fun getPlayWatchedBreak(): Boolean
    fun setBreakClipLoadInterceptor(interceptor: (breakClip: BreakClip, breakClipLoaderContext: BreakClipLoadInterceptorContext) -> Unit)
    fun setBreakSeekInterceptor(seekInterceptor: (breakSeekData: BreakSeekData) -> Unit)
    fun setPlayWatchedBreak(playWatchedBreak: Boolean)
    fun setVastTrackingInterceptor(interceptor: (trackingUrl: String) -> Unit = definedExternally)
}