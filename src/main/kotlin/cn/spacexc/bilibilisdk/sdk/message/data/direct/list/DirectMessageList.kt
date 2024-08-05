package cn.spacexc.bilibilisdk.sdk.message.data.direct.list

data class DirectMessageList(
    val code: Int,
    val `data`: Data,
    val message: String,
    val msg: String,
    val ttl: Int
)