package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


import com.google.gson.annotations.SerializedName

data class Series(
    @SerializedName("user_upgrade_status") val userUpgradeStatus: Int,
    @SerializedName("show_upgrade_window") val showUpgradeWindow: Boolean
)