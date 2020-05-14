@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package cast

import kotlin.js.*
import org.khronos.webgl.*

external interface PromiseLike<T> {
    fun <TResult1, TResult2> then(onfulfilled: ((value: T) -> dynamic)? = definedExternally, onrejected: ((reason: Any) -> dynamic)? = definedExternally): PromiseLike<dynamic /* TResult1 | TResult2 */>
}

external interface ArrayLike<T> {
    var length: Number
    @nativeGetter
    operator fun get(n: Number): T?
    @nativeSetter
    operator fun set(n: Number, value: T)
}

external interface ArrayBufferTypes {
    var ArrayBuffer: ArrayBuffer
}

typealias ArrayBufferLike = Any

external interface ArrayBufferConstructor {
    var prototype: ArrayBuffer
    fun isView(arg: Any): Boolean
}

external interface Uint8ArrayConstructor {
    fun from(arrayLike: Iterable<Number>, mapfn: (v: Number, k: Number) -> Number = definedExternally, thisArg: Any = definedExternally): Uint8Array
    var prototype: Uint8Array
    var BYTES_PER_ELEMENT: Number
    fun of(vararg items: Number): Uint8Array
    fun from(arrayLike: ArrayLike<Number>): Uint8Array
    fun <T> from(arrayLike: ArrayLike<T>, mapfn: (v: T, k: Number) -> Number, thisArg: Any = definedExternally): Uint8Array
}