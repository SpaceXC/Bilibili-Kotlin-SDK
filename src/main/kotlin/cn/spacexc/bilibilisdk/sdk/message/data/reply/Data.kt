package cn.spacexc.bilibilisdk.sdk.message.data.reply

data class Data(
    val cursor: Cursor,
    val items: List<ReplyMessage>,
    val last_view_at: Int
)