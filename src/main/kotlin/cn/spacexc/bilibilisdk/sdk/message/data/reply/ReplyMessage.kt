package cn.spacexc.bilibilisdk.sdk.message.data.reply

data class ReplyMessage(
    val counts: Int,
    val id: Long,
    val is_multi: Int,
    val item: Item,
    val reply_time: Long,
    val user: User
)