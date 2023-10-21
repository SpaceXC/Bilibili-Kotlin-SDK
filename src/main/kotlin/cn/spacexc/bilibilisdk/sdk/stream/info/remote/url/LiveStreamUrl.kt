package cn.spacexc.bilibilisdk.sdk.stream.info.remote.url

data class LiveStreamUrl(
    val code: Int,
    val `data`: Data,
    val message: String,
    val ttl: Int
)