package cn.spacexc.bilibilisdk.sdk.article.info.remote.content


data class ArticleInfo(
    val cvid: Long,
    val readInfo: ReadInfo,
    val readViewInfo: ReadViewInfo,
    val upInfo: UpInfo,
    val actInfo: ActInfo,
    val previewInfo: PreviewInfo,
    val draftInfo: DraftInfo,
    val query: Query,
    val hiddenInteraction: Boolean
)