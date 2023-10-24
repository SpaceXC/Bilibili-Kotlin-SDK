package cn.spacexc.bilibilisdk.sdk.video.info.remote.playurl.tv


import com.google.gson.annotations.SerializedName

data class Durl(
    val ahead: String,
    @SerializedName("backup_url")
    val backupUrl: List<String>,
    val length: Int,
    val md5: String,
    val order: Int,
    val size: Int,
    val url: String,
    val vhead: String
)