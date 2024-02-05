package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


import com.google.gson.annotations.SerializedName

data class Nameplate(
    val nid: Long,
    val name: String,
    val image: String,
    @SerializedName("image_small") val imageSmall: String,
    val level: String,
    val condition: String
)