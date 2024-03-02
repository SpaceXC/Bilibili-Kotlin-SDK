package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


import com.google.gson.annotations.SerializedName

data class Medal(
    val uid: Long,
    @SerializedName("target_id") val targetid: Long,
    @SerializedName("medal_id") val medalid: Long,
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