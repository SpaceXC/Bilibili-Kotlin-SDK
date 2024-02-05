package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


import com.google.gson.annotations.SerializedName

data class Vip(
    val type: Int,
    val status: Int,
    @SerializedName("due_date") val dueDate: Long,
    @SerializedName("vip_pay_type") val vipPayType: Int,
    @SerializedName("theme_type") val themeType: Int,
    val label: Label,
    @SerializedName("avatar_subscript") val avatarSubscript: Int,
    @SerializedName("nickname_color") val nicknameColor: String,
    val role: Int,
    @SerializedName("avatar_subscript_url") val avatarSubscriptUrl: String,
    @SerializedName("tv_vip_status") val tvVipStatus: Int,
    @SerializedName("tv_vip_pay_type") val tvVipPayType: Int,
    @SerializedName("tv_due_date") val tvDueDate: Int,
    @SerializedName("avatar_icon") val avatarIcon: AvatarIcon
)