package cn.spacexc.bilibilisdk.sdk.user.history.remote

data class History(
    val business: String,
    val bvid: String,
    val cid: Long,
    val dt: Int,
    val epid: Long,
    val oid: Long,
    val page: Int,
    val part: String
)