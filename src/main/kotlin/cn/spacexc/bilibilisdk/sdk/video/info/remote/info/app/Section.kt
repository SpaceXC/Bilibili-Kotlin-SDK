package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.app


import com.google.gson.annotations.SerializedName

data class Section(
    val episodes: List<Episode>,
    val id: Long,
    @SerializedName("season_id")
    val seasonId: Int,
    val title: String,
    val type: Int
)