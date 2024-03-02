package cn.spacexc.bilibilisdk.sdk.user.profile.remote.video


import com.google.gson.annotations.SerializedName

data class UserSpaceVideos(
    val code: Int,
    val message: String,
    val ttl: Int,
    val `data`: Data
)