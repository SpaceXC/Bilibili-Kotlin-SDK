package cn.spacexc.bilibilisdk.sdk.bangumi.info.url

data class Durl(
    val ahead: String,
    val backup_url: List<String>,
    val length: Int,
    val md5: String,
    val order: Int,
    val size: Long,
    val url: String,
    val vhead: String
)