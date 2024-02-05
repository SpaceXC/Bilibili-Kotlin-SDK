package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


import com.google.gson.annotations.SerializedName

data class WatchedShow(
    val switch: Boolean,
    val num: Int,
    @SerializedName("text_small") val textSmall: String,
    @SerializedName("text_large") val textLarge: String,
    val icon: String,
    @SerializedName("icon_location") val iconLocation: String,
    @SerializedName("icon_web") val iconWeb: String
)