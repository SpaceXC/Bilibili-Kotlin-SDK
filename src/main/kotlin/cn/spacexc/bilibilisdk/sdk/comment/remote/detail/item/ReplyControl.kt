package cn.spacexc.bilibilisdk.sdk.comment.remote.detail.item


import com.google.gson.annotations.SerializedName

data class ReplyControl(
    @SerializedName("max_line") val maxLine: Int,
    @SerializedName("time_desc") val timeDesc: String,
    val location: String?
)