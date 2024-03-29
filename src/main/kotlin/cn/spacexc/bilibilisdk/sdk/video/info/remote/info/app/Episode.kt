package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.app


import com.google.gson.annotations.SerializedName

data class Episode(
    val aid: Long,
    val arc: Arc,
    val attribute: Int,
    val bvid: String,
    val cid: Long,
    val id: Long,
    val page: PageX,
    @SerializedName("season_id")
    val seasonid: Long,
    @SerializedName("section_id")
    val sectionid: Long,
    val title: String
)