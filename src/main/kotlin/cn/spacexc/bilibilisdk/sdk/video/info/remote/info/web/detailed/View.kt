package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import cn.spacexc.bilibilisdk.sdk.video.info.remote.info.app.UgcSeason
import com.google.gson.annotations.SerializedName

data class View(
    val aid: Long,
    val bvid: String,
    val cid: Long,
    val copyright: Int,
    val ctime: Int,
    val desc: String,
    @SerializedName("redirect_url")
    val redirectUrl: String?,
    @SerializedName("desc_v2")
    val descV2: List<DescV2>,
    val dimension: Dimension,
    @SerializedName("disable_show_up_info")
    val disableShowUpInfo: Boolean,
    val duration: Int,
    val `dynamic`: String,
    @SerializedName("enable_vt")
    val enableVt: Int,
    @SerializedName("honor_reply")
    val honorReply: HonorReply,
    @SerializedName("is_chargeable_season")
    val isChargeableSeason: Boolean,
    @SerializedName("is_season_display")
    val isSeasonDisplay: Boolean,
    @SerializedName("is_story")
    val isStory: Boolean,
    @SerializedName("is_upower_exclusive")
    val isUpowerExclusive: Boolean,
    @SerializedName("is_upower_play")
    val isUpowerPlay: Boolean,
    @SerializedName("like_icon")
    val likeIcon: String,
    @SerializedName("mission_id")
    val missionid: Long,
    @SerializedName("need_jump_bv")
    val needJumpBv: Boolean,
    @SerializedName("no_cache")
    val noCache: Boolean,
    val owner: OwnerX,
    val pages: List<Page>,
    val pic: String,
    val premiere: Any,
    val pubdate: Long,
    val rights: RightsX,
    val staff: List<Staff>?,
    val stat: StatX,
    val state: Int,
    val subtitle: Subtitle,
    @SerializedName("teenage_mode")
    val teenageMode: Int,
    val tid: Long,
    val title: String,
    val tname: String,
    @SerializedName("user_garb")
    val userGarb: UserGarb,
    val videos: Int,
    @SerializedName("vt_display")
    val vtDisplay: String,
    @SerializedName("ugc_season")
    val ugcSeason: UgcSeason?
)