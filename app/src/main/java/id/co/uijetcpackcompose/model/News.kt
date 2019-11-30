package id.co.uijetcpackcompose.model

import androidx.ui.graphics.Image

/**
 * Created by pertadima on 30,November,2019
 */

data class News(
    val id: String,
    val title: String,
    val subtitle: String? = null,
    val url: String,
    val publication: Publication? = null,
    val metadata: MetaData,
    val paragraphs: List<Paragraph> = emptyList(),
    val imageId: Int,
    val imageThumbId: Int,
    val image: Image? = null,
    val imageThumb: Image? = null
)

data class MetaData(
    val author: PostAuthor,
    val date: String,
    val readTimeMinutes: Int
)

data class PostAuthor(
    val name: String,
    val url: String? = null
)


data class Publication(
    val name: String,
    val logoUrl: String
)

data class Paragraph(
    val type: ParagraphType,
    val text: String,
    val markups: List<Markup> = emptyList()
)

data class Markup(
    val type: MarkupType,
    val start: Int,
    val end: Int,
    val href: String? = null
)

enum class MarkupType {
    Link,
    Code,
    Italic,
    Bold,
}

enum class ParagraphType {
    Title,
    Caption,
    Header,
    Subhead,
    Text,
    CodeBlock,
    Quote,
    Bullet,
}

