package cn.spacexc.bilibilisdk.sdk.message.data.like

data class Total(
    val cursor: Cursor,
    val items: List<LikeMessage>
)