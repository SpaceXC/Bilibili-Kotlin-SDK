package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class RightsX(
    @SerializedName("arc_pay")
    val arcPay: Int,
    val autoplay: Int,
    val bp: Int,
    @SerializedName("clean_mode")
    val cleanMode: Int,
    val download: Int,
    val elec: Int,
    @SerializedName("free_watch")
    val freeWatch: Int,
    val hd5: Int,
    @SerializedName("is_360")
    val is360: Int,
    @SerializedName("is_cooperation")
    val isCooperation: Int,
    @SerializedName("is_stein_gate")
    val isSteinGate: Int,
    val movie: Int,
    @SerializedName("no_background")
    val noBackground: Int,
    @SerializedName("no_reprint")
    val noReprint: Int,
    @SerializedName("no_share")
    val noShare: Int,
    val pay: Int,
    @SerializedName("ugc_pay")
    val ugcPay: Int,
    @SerializedName("ugc_pay_preview")
    val ugcPayPreview: Int
)