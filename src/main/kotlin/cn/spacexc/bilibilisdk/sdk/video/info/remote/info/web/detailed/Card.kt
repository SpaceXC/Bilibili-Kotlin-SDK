package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class Card(
    @SerializedName("archive_count")
    val archiveCount: Int,
    @SerializedName("article_count")
    val articleCount: Int,
    val card: CardX,
    val follower: Int,
    val following: Boolean,
    @SerializedName("like_num")
    val likeNum: Int,
    val space: Space
)