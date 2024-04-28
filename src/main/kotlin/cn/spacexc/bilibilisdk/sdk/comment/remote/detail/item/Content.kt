package cn.spacexc.bilibilisdk.sdk.comment.remote.detail.item


import cn.spacexc.bilibilisdk.sdk.comment.remote.detail.Picture
import cn.spacexc.bilibilisdk.sdk.comment.remote.detail.emote.EmoteItem
import cn.spacexc.bilibilisdk.sdk.comment.remote.detail.member.AtMember
import com.google.gson.annotations.SerializedName

data class Content(
    val message: String,
    val members: List<AtMember>,
    val pictures: List<Picture>?,
    @SerializedName("jump_url") val jumpUrl: Map<String, JumpUrlObject>,
    @SerializedName("max_line") val maxLine: Int,
    val emote: Map<String, EmoteItem>?
) {
    data class JumpUrlObject(
        val title: String,
        @SerializedName("prefix_icon") val prefixIcon: String?,
        val extra: JumpUrlExtra
    )

    data class JumpUrlExtra(@SerializedName("is_word_search") val isWordSearch: Boolean)
}