package cn.spacexc.bilibilisdk.sdk.user.profile.remote.stat


import com.google.gson.annotations.SerializedName

data class UserStat(
    val code: Int,
    val message: String,
    val ttl: Int,
    val `data`: Data
)