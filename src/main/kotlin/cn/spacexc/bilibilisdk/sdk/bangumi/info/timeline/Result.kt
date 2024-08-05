package cn.spacexc.bilibilisdk.sdk.bangumi.info.timeline

data class Result(
    val date: String,
    val date_ts: Long,
    val day_of_week: Int,
    val episodes: List<Episode>,
    val is_today: Int
)