package cn.spacexc.bilibilisdk.sdk.user.watchlater.info.remote

data class WatchLaterList(
    val code: Int,
    val `data`: Data,
    val message: String,
    val ttl: Int
)