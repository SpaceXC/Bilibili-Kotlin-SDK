package cn.spacexc.bilibilisdk.sdk.user.card


import com.google.gson.annotations.SerializedName

data class AvatarIcon(
    @SerializedName("icon_resource")
    val iconResource: IconResource,
    @SerializedName("icon_type")
    val iconType: Int
)