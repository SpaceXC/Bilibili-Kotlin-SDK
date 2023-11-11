package cn.spacexc.bilibilisdk.sdk.user.login.geetest.domain


data class Data(
    val geetest: Geetest,
    val tencent: Tencent,
    val token: String,
    val type: String
)