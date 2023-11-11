package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class Tag(
    val alpha: Int,
    @SerializedName("archive_count")
    val archiveCount: String,
    val attribute: Int,
    val color: String,
    val content: String,
    val count: Count,
    val cover: String,
    val ctime: Int,
    @SerializedName("extra_attr")
    val extraAttr: Int,
    @SerializedName("featured_count")
    val featuredCount: Int,
    val hated: Int,
    val hates: Int,
    @SerializedName("head_cover")
    val headCover: String,
    @SerializedName("is_activity")
    val isActivity: Boolean,
    @SerializedName("is_atten")
    val isAtten: Int,
    @SerializedName("is_season")
    val isSeason: Boolean,
    @SerializedName("jump_url")
    val jumpUrl: String,
    val liked: Int,
    val likes: Int,
    @SerializedName("music_id")
    val musicId: String,
    @SerializedName("short_content")
    val shortContent: String,
    val state: Int,
    @SerializedName("subscribed_count")
    val subscribedCount: Int,
    @SerializedName("tag_id")
    val tagId: Int,
    @SerializedName("tag_name")
    val tagName: String,
    @SerializedName("tag_type")
    val tagType: String,
    val type: Int
)