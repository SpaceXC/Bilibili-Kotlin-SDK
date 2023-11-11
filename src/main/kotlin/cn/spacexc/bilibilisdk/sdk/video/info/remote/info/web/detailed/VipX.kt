package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class VipX(
    @SerializedName("avatar_subscript")
    val avatarSubscript: Int,
    @SerializedName("avatar_subscript_url")
    val avatarSubscriptUrl: String,
    @SerializedName("due_date")
    val dueDate: Long,
    val label: Label,
    @SerializedName("nickname_color")
    val nicknameColor: String,
    val role: Int,
    val status: Int,
    @SerializedName("theme_type")
    val themeType: Int,
    @SerializedName("tv_due_date")
    val tvDueDate: Int,
    @SerializedName("tv_vip_pay_type")
    val tvVipPayType: Int,
    @SerializedName("tv_vip_status")
    val tvVipStatus: Int,
    val type: Int,
    @SerializedName("vip_pay_type")
    val vipPayType: Int
)