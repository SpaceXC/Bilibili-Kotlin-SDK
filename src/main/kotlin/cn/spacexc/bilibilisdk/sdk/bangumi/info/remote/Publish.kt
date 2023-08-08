package cn.spacexc.bilibilisdk.sdk.bangumi.info.remote

data class Publish(
    val is_finish: Int,
    val is_started: Int,
    val pub_time: String,
    val pub_time_show: String,
    val unknow_pub_date: Int,
    val weekday: Int
)