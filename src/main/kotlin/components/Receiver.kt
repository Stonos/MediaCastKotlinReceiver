package components

import cast.castMediaPlayer
import react.*

class Receiver: RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        castMediaPlayer {  }
    }
}

fun RBuilder.receiver(handler: RProps.() -> Unit): ReactElement {
    return child(Receiver::class) {
        this.attrs(handler)
    }
}