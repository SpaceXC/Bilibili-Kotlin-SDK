package cn.spacexc.bilibilisdk.sdk.comment.remote.detail.emote


import com.google.gson.annotations.SerializedName

data class EmoteItem(
    val id: Long,
    @SerializedName("package_id") val packageId: Long,
    val state: Int,
    val type: Int,
    val attr: Long,
    val text: String,
    val url: String,
    val meta: Meta,
    val mtime: Int,
    @SerializedName("jump_title") val jumpTitle: String
)