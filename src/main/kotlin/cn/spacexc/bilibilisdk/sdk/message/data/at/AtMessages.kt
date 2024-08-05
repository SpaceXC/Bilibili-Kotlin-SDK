package cn.spacexc.bilibilisdk.sdk.message.data.at

data class AtMessages(
    val code: Int,
    val `data`: Data,
    val message: String,
    val ttl: Int
)