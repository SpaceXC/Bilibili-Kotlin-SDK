package cn.spacexc.bilibilisdk.sdk.video.info.remote.playurl.tv


import com.google.gson.annotations.SerializedName

data class CoverMark(
    val covermarks: List<CovermarkX>,
    @SerializedName("is_cover")
    val isCover: Boolean,
    val url: String
)