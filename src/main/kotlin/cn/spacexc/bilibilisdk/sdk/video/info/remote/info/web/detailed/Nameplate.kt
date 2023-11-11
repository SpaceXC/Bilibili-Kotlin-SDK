package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class Nameplate(
    val condition: String,
    val image: String,
    @SerializedName("image_small")
    val imageSmall: String,
    val level: String,
    val name: String,
    val nid: Long
)