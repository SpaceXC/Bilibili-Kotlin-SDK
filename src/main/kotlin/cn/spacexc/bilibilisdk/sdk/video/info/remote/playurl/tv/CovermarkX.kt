package cn.spacexc.bilibilisdk.sdk.video.info.remote.playurl.tv


import com.google.gson.annotations.SerializedName

data class CovermarkX(
    val height: Int,
    @SerializedName("right_margin")
    val rightMargin: Int,
    @SerializedName("top_margin")
    val topMargin: Int,
    val width: Int,
    @SerializedName("window_type")
    val windowType: String
)