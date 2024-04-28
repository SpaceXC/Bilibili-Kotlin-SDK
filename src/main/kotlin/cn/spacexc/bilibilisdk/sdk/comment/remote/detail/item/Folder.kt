package cn.spacexc.bilibilisdk.sdk.comment.remote.detail.item


import com.google.gson.annotations.SerializedName

data class Folder(
    @SerializedName("has_folded") val hasFolded: Boolean,
    @SerializedName("is_folded") val isFolded: Boolean,
    val rule: String
)