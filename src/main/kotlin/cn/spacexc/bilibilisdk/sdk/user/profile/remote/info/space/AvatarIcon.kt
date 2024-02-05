package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


import com.google.gson.annotations.SerializedName

data class AvatarIcon(
    @SerializedName("icon_type") val iconType: Int,
    @SerializedName("icon_resource") val iconResource: IconResource
)