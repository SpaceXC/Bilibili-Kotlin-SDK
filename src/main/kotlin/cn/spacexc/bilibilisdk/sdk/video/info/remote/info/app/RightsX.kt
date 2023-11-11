package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.app


import com.google.gson.annotations.SerializedName

data class RightsX(
    @SerializedName("arc_pay")
    val arcPay: Int,
    val autoplay: Int,
    val bp: Int,
    val download: Int,
    val elec: Int,
    @SerializedName("free_watch")
    val freeWatch: Int,
    val hd5: Int,
    @SerializedName("is_cooperation")
    val isCooperation: Int,
    val movie: Int,
    @SerializedName("no_reprint")
    val noReprint: Int,
    val pay: Int,
    @SerializedName("ugc_pay")
    val ugcPay: Int,
    @SerializedName("ugc_pay_preview")
    val ugcPayPreview: Int
)