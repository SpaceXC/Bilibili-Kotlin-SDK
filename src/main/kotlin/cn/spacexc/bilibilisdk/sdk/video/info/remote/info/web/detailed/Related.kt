package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class Related(
    @SerializedName("ai_rcmd")
    val aiRcmd: AiRcmd,
    val aid: Long,
    val bvid: String,
    val cid: Long,
    val copyright: Int,
    val ctime: Int,
    val desc: String,
    val dimension: Dimension,
    val duration: Int,
    val `dynamic`: String,
    @SerializedName("enable_vt")
    val enableVt: Int,
    @SerializedName("first_frame")
    val firstFrame: String,
    @SerializedName("is_ogv")
    val isOgv: Boolean,
    @SerializedName("mission_id")
    val missionId: Int,
    @SerializedName("ogv_info")
    val ogvInfo: Any,
    val owner: Owner,
    val pic: String,
    @SerializedName("pub_location")
    val pubLocation: String,
    val pubdate: Int,
    @SerializedName("rcmd_reason")
    val rcmdReason: String,
    val rights: Rights,
    @SerializedName("season_id")
    val seasonId: Int,
    @SerializedName("season_type")
    val seasonType: Int,
    @SerializedName("short_link_v2")
    val shortLinkV2: String,
    val stat: Stat,
    val state: Int,
    val tid: Long,
    val title: String,
    val tname: String,
    @SerializedName("up_from_v2")
    val upFromV2: Int,
    val videos: Int
)