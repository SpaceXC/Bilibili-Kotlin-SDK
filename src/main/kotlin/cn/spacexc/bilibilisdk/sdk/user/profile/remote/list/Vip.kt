package cn.spacexc.bilibilisdk.sdk.user.profile.remote.list

data class Vip(
    val avatar_icon: Any,
    val avatar_subscript: Int,
    val avatar_subscript_url: String,
    val due_date: String,
    val label: Label,
    val nickname_color: String,
    val role: String,
    val status: Int,
    val theme_type: Int,
    val tv_due_date: String,
    val tv_vip_pay_type: Int,
    val tv_vip_status: Int,
    val type: Int,
    val vip_pay_type: Int
)