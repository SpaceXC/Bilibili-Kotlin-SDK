package cn.spacexc.bilibilisdk.sdk.video.info.remote.playerinfo

data class Vip(
    val avatar_subscript: Int,
    val avatar_subscript_url: String,
    val due_date: Long,
    val label: Label,
    val nickname_color: String,
    val role: Int,
    val status: Int,
    val theme_type: Int,
    val tv_due_date: Int,
    val tv_vip_pay_type: Int,
    val tv_vip_status: Int,
    val type: Int,
    val vip_pay_type: Int
)