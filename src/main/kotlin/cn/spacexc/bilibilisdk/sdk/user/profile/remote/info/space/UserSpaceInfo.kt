package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


data class UserSpaceInfo(
    val code: Int,
    val message: String,
    val ttl: Int,
    val `data`: Data
)