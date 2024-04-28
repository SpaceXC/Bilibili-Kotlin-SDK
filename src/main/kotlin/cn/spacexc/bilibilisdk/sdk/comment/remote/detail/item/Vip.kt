package cn.spacexc.bilibilisdk.sdk.comment.remote.detail.item


import com.google.gson.annotations.SerializedName

data class Vip(
    val vipType: Int,
    val vipDueDate: Long,
    val dueRemark: String,
    val accessStatus: Int,
    val vipStatus: Int,
    val vipStatusWarn: String,
    val themeType: Int,
    val label: Label,
    @SerializedName("avatar_subscript") val avatarSubscript: Int,
    @SerializedName("nickname_color") val nicknameColor: String
)