package cn.spacexc.bilibilisdk.sdk.bangumi.info.remote

data class UserStatus(
    val area_limit: Int,
    val ban_area_show: Int,
    val follow: Int,
    val follow_status: Int,
    val login: Int,
    val pay: Int,
    val pay_pack_paid: Long,
    val sponsor: Int
)