package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed.ugc


import com.google.gson.annotations.SerializedName

data class Section(
    val episodes: List<Episode>,
    val id: Long,
    @SerializedName("season_id")
    val seasonId: Int,
    val title: String,
    val type: Int
)