package cn.spacexc.bilibilisdk.sdk.video.info.remote.playurl

data class Audio(
    val backupUrl: List<String>,
    val backup_url: List<String>,
    val bandwidth: Int,
    val baseUrl: String,
    val base_url: String,
    val codecid: Long,
    val codecs: String,
    val frameRate: String,
    val frame_rate: String,
    val height: Int,
    val id: Long,
    val mimeType: String,
    val mime_type: String,
    val sar: String,
    val startWithSap: Int,
    val start_with_sap: Int,
    val width: Int
)