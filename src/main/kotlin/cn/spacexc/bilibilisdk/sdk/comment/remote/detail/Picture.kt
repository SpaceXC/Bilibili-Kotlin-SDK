package cn.spacexc.bilibilisdk.sdk.comment.remote.detail


import com.google.gson.annotations.SerializedName

data class Picture(
    @SerializedName("img_src") val imgSrc: String,
    @SerializedName("img_width") val imgWidth: Int,
    @SerializedName("img_height") val imgHeight: Int,
    @SerializedName("img_size") val imgSize: Double
)