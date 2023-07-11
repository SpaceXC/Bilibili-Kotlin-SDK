package cn.spacexc.bilibilisdk.sdk.user.history.remote

data class Cursor(
    val business: String,
    val max: Int,
    val ps: Int,
    val view_at: Int
)