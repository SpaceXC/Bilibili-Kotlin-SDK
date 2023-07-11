package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.app

data class Cm(
    val ad_info: AdInfo,
    val client_ip: String,
    val index: Int,
    val is_ad_loc: Boolean,
    val request_id: String,
    val rsc_id: Long,
    val src_id: Long
)