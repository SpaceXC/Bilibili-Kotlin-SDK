package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class Page(
    val cid: Long,
    val dimension: Dimension,
    val duration: Int,
    @SerializedName("first_frame")
    val firstFrame: String,
    val from: String,
    val page: Int,
    val part: String,
    val vid: String,
    val weblink: String
)