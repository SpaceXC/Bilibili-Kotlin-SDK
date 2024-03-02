package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed.ugc


import com.google.gson.annotations.SerializedName

data class StatX(
    val coin: Int,
    val danmaku: Int,
    val fav: Int,
    @SerializedName("his_rank")
    val hisRank: Int,
    val like: Int,
    @SerializedName("now_rank")
    val nowRank: Int,
    val reply: Int,
    @SerializedName("season_id")
    val seasonid: Long,
    val share: Int,
    val view: Int,
    val vt: Int,
    val vv: Int
)