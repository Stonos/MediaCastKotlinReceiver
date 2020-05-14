import cast.CastReceiverContext
import cast.LoggerLevel
import react.dom.render
import kotlin.browser.document

external val cast: dynamic

fun main() {
    render(document.getElementById("root")) {
        child(App::class) {}
    }
}