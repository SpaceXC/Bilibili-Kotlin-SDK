package cn.spacexc.bilibilisdk.sdk.user.card


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("archive_count")
    val archiveCount: Int,
    @SerializedName("article_count")
    val articleCount: Int,
    @SerializedName("card")
    val card: Card,
    @SerializedName("follower")
    val follower: Int,
    @SerializedName("following")
    val following: Boolean,
    @SerializedName("like_num")
    val likeNum: Int
)