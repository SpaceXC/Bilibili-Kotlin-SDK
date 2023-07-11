package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.app

data class Elec(
    val elec_num: Int,
    val show: Boolean,
    val state: Int,
    val total: Int,
    val upower_icon_url: String,
    val upower_jump_show_type: Int,
    val upower_jump_url: String,
    val upower_state: Int,
    val upower_title: String
)