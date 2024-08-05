package cn.spacexc.bilibilisdk.sdk.message.data.reply

data class ReplyMessages(
    val code: Int,
    val `data`: Data,
    val message: String,
    val ttl: Int
)