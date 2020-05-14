package cast

import kotlinx.html.HTMLTag
import kotlinx.html.HtmlInlineTag
import kotlinx.html.TagConsumer
import react.RBuilder
import react.ReactElement
import react.dom.RDOMBuilder
import react.dom.tag

class CastMediaPlayer(consumer: TagConsumer<*>) :
    HTMLTag("cast-media-player", consumer, emptyMap(), inlineTag = true, emptyTag = true), HtmlInlineTag

inline fun RBuilder.castMediaPlayer(block: RDOMBuilder<CastMediaPlayer>.() -> Unit): ReactElement =
    tag(block) { CastMediaPlayer(it) }