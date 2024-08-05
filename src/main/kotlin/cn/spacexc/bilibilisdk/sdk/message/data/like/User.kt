package cn.spacexc.bilibilisdk.sdk.message.data.like

data class User(
    val avatar: String,
    val fans: Int,
    val follow: Boolean,
    val mid: Long,
    val mid_link: String,
    val nickname: String
)