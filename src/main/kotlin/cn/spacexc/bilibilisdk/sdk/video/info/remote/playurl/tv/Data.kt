package cn.spacexc.bilibilisdk.sdk.video.info.remote.playurl.tv


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("accept_description")
    val acceptDescription: List<String>,
    @SerializedName("accept_format")
    val acceptFormat: String,
    @SerializedName("accept_quality")
    val acceptQuality: List<Int>,
    @SerializedName("accept_watermark")
    val acceptWatermark: List<Boolean>,
    @SerializedName("auto_quality_max")
    val autoQualityMax: Int,
    val bp: Int,
    val clip: Clip,
    @SerializedName("cover_mark")
    val coverMark: CoverMark,
    val dash: Any,
    @SerializedName("debug_info")
    val debugInfo: List<Any>,
    @SerializedName("degrade_type")
    val degradeType: Int,
    @SerializedName("drm_tech_type")
    val drmTechType: Int,
    val durl: List<Durl>,
    val fnval: Int,
    val fnver: Int,
    val format: String,
    val from: String,
    @SerializedName("has_dolby")
    val hasDolby: Boolean,
    @SerializedName("has_paid")
    val hasPaid: Boolean,
    @SerializedName("is_drm")
    val isDrm: Boolean,
    @SerializedName("is_login")
    val isLogin: Boolean,
    @SerializedName("is_preview")
    val isPreview: Int,
    @SerializedName("is_vip")
    val isVip: Boolean,
    @SerializedName("live_cdn_159_switch")
    val liveCdn159Switch: Int,
    @SerializedName("no_rexcode")
    val noRexcode: Int,
    @SerializedName("play_tag")
    val playTag: Any,
    @SerializedName("proj_vip_type")
    val projVipType: Int,
    @SerializedName("qn_extras")
    val qnExtras: List<QnExtra>,
    val quality: Int,
    val result: String,
    @SerializedName("seek_param")
    val seekParam: String,
    @SerializedName("seek_type")
    val seekType: String,
    val status: Int,
    @SerializedName("support_formats")
    val supportFormats: List<SupportFormat>,
    val timelength: Int,
    val type: Int,
    @SerializedName("video_codecid")
    val videoCodecid: Int,
    @SerializedName("video_project")
    val videoProject: Boolean,
    @SerializedName("vip_status")
    val vipStatus: Int,
    @SerializedName("vip_type")
    val vipType: Int,
    val volume: Volume
)