package cn.spacexc.bilibilisdk.sdk.bangumi.info.url

data class SupportFormat(
    val codecs: List<Any>,
    val description: String,
    val display_desc: String,
    val format: String,
    val need_login: Boolean,
    val new_description: String,
    val quality: Int,
    val superscript: String
)