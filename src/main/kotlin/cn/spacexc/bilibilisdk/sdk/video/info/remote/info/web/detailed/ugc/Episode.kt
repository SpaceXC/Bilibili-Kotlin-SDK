package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed.ugc


import com.google.gson.annotations.SerializedName

data class Episode(
    val aid: Long,
    val arc: Arc,
    val attribute: Int,
    val bvid: String,
    val cid: Long,
    val id: Long,
    val page: Page,
    @SerializedName("season_id")
    val seasonid: Long,
    @SerializedName("section_id")
    val sectionid: Long,
    val title: String
)