package cn.spacexc.bilibilisdk.sdk.message.data.like

data class Item(
    val business: String,
    val business_id: Int,
    val ctime: Int,
    val desc: String,
    val detail_name: String,
    val image: String,
    val item_id: Long,
    val like_business_id: Int,
    val native_uri: String,
    val pid: Int,
    val reply_business_id: Int,
    val title: String,
    val type: String,
    val uri: String
)