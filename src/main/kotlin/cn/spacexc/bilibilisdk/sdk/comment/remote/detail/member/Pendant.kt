package cn.spacexc.bilibilisdk.sdk.comment.remote.detail.member


import com.google.gson.annotations.SerializedName

data class Pendant(
    val pid: Long,
    val name: String,
    val image: String,
    val expire: Int,
    @SerializedName("image_enhance") val imageEnhance: String,
    @SerializedName("image_enhance_frame") val imageEnhanceFrame: String,
    @SerializedName("n_pid") val nPid: Long
)