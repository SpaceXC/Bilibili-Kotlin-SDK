package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


import com.google.gson.annotations.SerializedName

data class Pendant(
    val pid: Int,
    val name: String,
    val image: String,
    val expire: Int,
    @SerializedName("image_enhance") val imageEnhance: String,
    @SerializedName("image_enhance_frame") val imageEnhanceFrame: String,
    @SerializedName("n_pid") val nPid: Int
)