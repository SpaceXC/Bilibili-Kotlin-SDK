package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info

data class CurrentUserInfo(
    val code: Int,
    val `data`: Data,
    val message: String,
    val ttl: Int
)