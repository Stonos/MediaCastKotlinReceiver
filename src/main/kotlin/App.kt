import cast.castMediaPlayer
import components.Stats
import components.debugPanel
import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledDiv

external interface AppState : RState {
    var logs: List<String>
    var stats: Stats
    var debugEnabled: Boolean
}

class App : RComponent<RProps, AppState>() {
    override fun AppState.init() {
        logs = listOf()
        stats = Stats(0, "INIT", 0)
        debugEnabled = true
    }

    override fun RBuilder.render() {
        styledDiv {
            css {
                backgroundColor = Color.black
                color = Color.white
                height = 100.pct
                textAlign = TextAlign.left
            }
            debugPanel {
                logs = state.logs
                stats = state.stats
                debugEnabled = state.debugEnabled
            }
            castMediaPlayer { }
        }
    }
}