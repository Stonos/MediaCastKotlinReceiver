package components

import kotlinx.css.*
import kotlinx.css.properties.lh
import org.w3c.dom.Element
import react.*
import react.dom.div
import styled.css
import styled.styledDiv
import styled.styledSpan

data class Stats(val bitrate: Int, val state: String, val currentMediaTime: Number)

external interface DebugPanelProps : RProps {
    var logs: List<String>
    var stats: Stats
    var debugEnabled: Boolean
}

class DebugPanel : RComponent<DebugPanelProps, RState>() {
    var logDiv = createRef<Element>()

    override fun RBuilder.render() {
        styledDiv {
            css {
                display = if (props.debugEnabled) Display.block else Display.none
                height = 100.pct
                width = 50.pct
                fontFamily = "monospace"
                paddingLeft = 10.px
                paddingTop = 10.px
                position = Position.absolute
                top = 0.px
                left = 0.px
                zIndex = 1
            }

            styledDiv { //TODO: Extract to a debug-stats component
                css {
                    textAlign = TextAlign.left
                    width = 100.pct
                    height = 20.pct
                }

                div { +"bandwidth: ${props.stats.bitrate}" }
                div { +"state: ${props.stats.state}" }
                div { +"current time: ${props.stats.currentMediaTime}" }
            }

            styledDiv {
                css {
                    overflow = Overflow.auto
                    textAlign = TextAlign.left
                    width = 100.pct
                    height = 75.pct
                    wordWrap = WordWrap.breakWord
                }

                props.logs.forEachIndexed { index, log ->
                    styledDiv {
                        ref = logDiv
                        css {
                            borderBottom = "1px solid #fff3"
                            lineHeight = 1.4.em.lh
                            margin(0.px)
                            padding(0.em, 0.5.em)
                            width = 100.pct
                        }
                        key = index.toString()
                        styledSpan {
                            css {
                                paddingRight = 0.5.em
                                whiteSpace = WhiteSpace.preWrap
                            }
                            +log
                        }
                    }
                }
            }
        }
    }

    override fun componentDidUpdate(prevProps: DebugPanelProps, prevState: RState, snapshot: Any) {
        logDiv.current?.scrollIntoView()
    }
}

fun RBuilder.debugPanel(handler: DebugPanelProps.() -> Unit): ReactElement {
    return child(DebugPanel::class) {
        this.attrs(handler)
    }
}