package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.app

data class Vip(
    val accessStatus: Int,
    val dueRemark: String,
    val label: Label,
    val themeType: Int,
    val vipDueDate: Long,
    val vipStatus: Int,
    val vipStatusWarn: String,
    val vipType: Int
)