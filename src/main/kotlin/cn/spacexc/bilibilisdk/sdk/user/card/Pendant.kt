package cn.spacexc.bilibilisdk.sdk.user.card


import com.google.gson.annotations.SerializedName

data class Pendant(
    @SerializedName("expire")
    val expire: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("image_enhance")
    val imageEnhance: String,
    @SerializedName("image_enhance_frame")
    val imageEnhanceFrame: String,
    @SerializedName("n_pid")
    val nPid: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("pid")
    val pid: Long
)