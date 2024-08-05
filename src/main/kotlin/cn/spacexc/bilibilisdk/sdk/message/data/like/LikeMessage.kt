package cn.spacexc.bilibilisdk.sdk.message.data.like

data class LikeMessage(
    val counts: Int,
    val id: Long,
    val item: Item,
    val like_time: Long,
    val notice_state: Int,
    val users: List<User>
)