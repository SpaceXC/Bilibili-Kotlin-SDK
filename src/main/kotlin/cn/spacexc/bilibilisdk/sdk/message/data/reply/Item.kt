package cn.spacexc.bilibilisdk.sdk.message.data.reply

data class Item(
    val at_details: List<AtDetail>,
    val business: String,
    val business_id: Int,
    val danmu: Any,
    val desc: String,
    val detail_title: String,
    val hide_like_button: Boolean,
    val hide_reply_button: Boolean,
    val image: String,
    val like_state: Int,
    val message: String,
    val native_uri: String,
    val root_id: Long,
    val root_reply_content: String,
    val source_content: String,
    val source_id: Long,
    val subject_id: Long,
    val target_id: Long,
    val target_reply_content: String,
    val title: String,
    val topic_details: List<Any>,
    val type: String,
    val uri: String
)