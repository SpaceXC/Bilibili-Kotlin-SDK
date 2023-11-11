package cn.spacexc.bilibilisdk.sdk.season.remote.list


import com.google.gson.annotations.SerializedName

data class Archive(
    val aid: Long,
    val bvid: String,
    val ctime: Int,
    val duration: Int,
    @SerializedName("enable_vt")
    val enableVt: Boolean,
    @SerializedName("interactive_video")
    val interactiveVideo: Boolean,
    val pic: String,
    @SerializedName("playback_position")
    val playbackPosition: Int,
    val pubdate: Int,
    val stat: Stat,
    val state: Int,
    val title: String,
    @SerializedName("ugc_pay")
    val ugcPay: Int,
    @SerializedName("vt_display")
    val vtDisplay: String
)