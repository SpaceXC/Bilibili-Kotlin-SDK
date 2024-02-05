package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


import com.google.gson.annotations.SerializedName

data class Contract(
    @SerializedName("is_display") val isDisplay: Boolean,
    @SerializedName("is_follow_display") val isFollowDisplay: Boolean
)