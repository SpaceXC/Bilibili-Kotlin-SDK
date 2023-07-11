package cn.spacexc.bilibilisdk.utils.remote

data class UserExitResult(
    val code: Int,
    val `data`: Data,
    val status: Boolean,
    val ts: Int
)