package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


import com.google.gson.annotations.SerializedName

data class Medal(
    val uid: Int,
    @SerializedName("target_id") val targetId: Int,
    @SerializedName("medal_id") val medalId: Int,
    val level: Int,
    @SerializedName("medal_name") val medalName: String,
    @SerializedName("medal_color") val medalColor: Int,
    val intimacy: Int,
    @SerializedName("next_intimacy") val nextIntimacy: Int,
    @SerializedName("day_limit") val dayLimit: Int,
    @SerializedName("medal_color_start") val medalColorStart: Int,
    @SerializedName("medal_color_end") val medalColorEnd: Int,
    @SerializedName("medal_color_border") val medalColorBorder: Int,
    @SerializedName("is_lighted") val isLighted: Int,
    @SerializedName("light_status") val lightStatus: Int,
    @SerializedName("wearing_status") val wearingStatus: Int,
    val score: Int
)