package cn.spacexc.bilibilisdk.sdk.comment.remote.detail.member


import com.google.gson.annotations.SerializedName

data class Nameplate(
    val nid: Int,
    val name: String,
    val image: String,
    @SerializedName("image_small") val imageSmall: String,
    val level: String,
    val condition: String
)