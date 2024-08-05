package cn.spacexc.bilibilisdk.sdk.message.data.direct.history

data class DirectMessageHistory(
    val code: Int,
    val `data`: Data,
    val message: String,
    val msg: String,
    val ttl: Int
)