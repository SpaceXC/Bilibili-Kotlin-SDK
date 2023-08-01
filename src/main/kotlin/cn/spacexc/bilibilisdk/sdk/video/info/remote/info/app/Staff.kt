package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.app

data class Staff(
    val attention: Int,
    val face: String,
    val mid: Long,
    val name: String,
    val official_verify: OfficialVerifyX,
    val title: String,
    val vip: VipX?
)