package cn.spacexc.bilibilisdk.sdk.message.data.direct.history

data class Data(
    val has_more: Int,
    val max_seqno: Long,
    val messages: List<Message>,
    val min_seqno: Long
)