import cast.CastReceiverContext
import cast.LoggerLevel
import kotlin.browser.document

external val cast: dynamic

fun main() {
    document.write("Hello, world!")

    val context: CastReceiverContext = cast.framework.CastReceiverContext.getInstance()
    console.log("Context:")
    console.log(context)

    val player = context.getPlayerManager()
    console.log("Player:")
    console.log(player)

    context.setLoggerLevel(LoggerLevel.DEBUG)
    context.start()
}