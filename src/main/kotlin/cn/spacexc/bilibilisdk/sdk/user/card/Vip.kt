package cn.spacexc.bilibilisdk.sdk.user.card


import com.google.gson.annotations.SerializedName

data class Vip(
    @SerializedName("avatar_icon")
    val avatarIcon: AvatarIcon,
    @SerializedName("avatar_subscript")
    val avatarSubscript: Int,
    @SerializedName("avatar_subscript_url")
    val avatarSubscriptUrl: String,
    @SerializedName("due_date")
    val dueDate: Long,
    @SerializedName("label")
    val label: Label,
    @SerializedName("nickname_color")
    val nicknameColor: String,
    @SerializedName("role")
    val role: Int,
    @SerializedName("status")
    val status: Int,
    @SerializedName("theme_type")
    val themeType: Int,
    @SerializedName("tv_due_date")
    val tvDueDate: Int,
    @SerializedName("tv_vip_pay_type")
    val tvVipPayType: Int,
    @SerializedName("tv_vip_status")
    val tvVipStatus: Int,
    @SerializedName("type")
    val type: Int,
    @SerializedName("vip_pay_type")
    val vipPayType: Int,
    @SerializedName("vipStatus")
    val vipStatus: Int,
    @SerializedName("vipType")
    val vipType: Int
)