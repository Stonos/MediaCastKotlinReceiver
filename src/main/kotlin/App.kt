import components.receiver
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

external interface AppState : RState {

}

class App : RComponent<RProps, AppState>() {
    override fun AppState.init() {

    }

    override fun RBuilder.render() {
        receiver { }
    }
}