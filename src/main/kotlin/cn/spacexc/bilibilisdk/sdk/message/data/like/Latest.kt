package cn.spacexc.bilibilisdk.sdk.message.data.like

data class Latest(
    val items: List<LikeMessage>,
    val last_view_at: Int
)