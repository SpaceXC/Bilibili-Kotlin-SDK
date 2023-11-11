package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class Pendant(
    val expire: Int,
    val image: String,
    @SerializedName("image_enhance")
    val imageEnhance: String,
    @SerializedName("image_enhance_frame")
    val imageEnhanceFrame: String,
    @SerializedName("n_pid")
    val nPid: Long,
    val name: String,
    val pid: Long
)