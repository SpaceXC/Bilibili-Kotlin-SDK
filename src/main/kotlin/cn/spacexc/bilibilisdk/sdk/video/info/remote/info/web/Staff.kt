package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web


import com.google.gson.annotations.SerializedName

data class Staff(
    val face: String,
    val follower: Int,
    @SerializedName("label_style")
    val labelStyle: Int,
    val mid: Long,
    val name: String,
    val official: Official?,
    val title: String,
    val vip: Vip?
)