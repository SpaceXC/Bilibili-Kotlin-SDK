package cn.spacexc.bilibilisdk.sdk.user.follow.following.remote.user

data class Vip(
    val accessStatus: Int,
    val avatar_subscript: Int,
    val avatar_subscript_url: String,
    val dueRemark: String,
    val label: Label,
    val nickname_color: String,
    val themeType: Int,
    val vipDueDate: Long,
    val vipStatus: Int,
    val vipStatusWarn: String,
    val vipType: Int
)