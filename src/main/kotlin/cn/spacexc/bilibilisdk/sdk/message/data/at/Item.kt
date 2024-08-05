package cn.spacexc.bilibilisdk.sdk.message.data.at

data class Item(
    val at_details: List<AtDetail>,
    val business: String,
    val business_id: Int,
    val hide_reply_button: Boolean,
    val image: String,
    val native_uri: String,
    val root_id: Int,
    val source_content: String,
    val source_id: Long,
    val subject_id: Long,
    val target_id: Long,
    val title: String,
    val topic_details: List<Any>,
    val type: String,
    val uri: String
)