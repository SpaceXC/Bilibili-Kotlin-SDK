package cn.spacexc.bilibilisdk.sdk.user.login.geetest.domain


data class GeetestChallenge(
    val code: Int,
    val `data`: Data,
    val message: String,
    val ttl: Int
)