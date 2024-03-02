package cn.spacexc.bilibilisdk.sdk.user.profile.remote.video.app


import com.google.gson.annotations.SerializedName

data class ThreePoint(
    val type: String,
    val icon: String,
    val text: String,
    @SerializedName("share_succ_toast") val shareSuccToast: String?,
    @SerializedName("share_fail_toast") val shareFailToast: String?,
    @SerializedName("share_path") val sharePath: String?,
    @SerializedName("short_link") val shortLink: String?,
    @SerializedName("share_subtitle") val shareSubtitle: String?
)