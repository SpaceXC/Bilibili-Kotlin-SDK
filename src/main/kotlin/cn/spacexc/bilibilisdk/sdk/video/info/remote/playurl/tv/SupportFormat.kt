package cn.spacexc.bilibilisdk.sdk.video.info.remote.playurl.tv


import com.google.gson.annotations.SerializedName

data class SupportFormat(
    val description: String,
    @SerializedName("display_desc")
    val displayDesc: String,
    val format: String,
    @SerializedName("new_description")
    val newDescription: String,
    val quality: Int,
    val superscript: String
)