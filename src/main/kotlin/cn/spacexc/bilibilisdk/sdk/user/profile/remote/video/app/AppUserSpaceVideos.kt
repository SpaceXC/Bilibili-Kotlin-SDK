package cn.spacexc.bilibilisdk.sdk.user.profile.remote.video.app


import com.google.gson.annotations.SerializedName

data class AppUserSpaceVideos(
    val code: Int,
    val message: String,
    val ttl: Int,
    val `data`: Data
)