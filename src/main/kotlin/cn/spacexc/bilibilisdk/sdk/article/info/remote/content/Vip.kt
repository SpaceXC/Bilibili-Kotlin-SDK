package cn.spacexc.bilibilisdk.sdk.article.info.remote.content


import com.google.gson.annotations.SerializedName

data class Vip(
    val type: Int,
    val status: Int,
    @SerializedName("due_date") val dueDate: Int,
    @SerializedName("vip_pay_type") val vipPayType: Int,
    @SerializedName("theme_type") val themeType: Int,
    val label: Label,
    @SerializedName("avatar_subscript") val avatarSubscript: Int,
    @SerializedName("nickname_color") val nicknameColor: String
)