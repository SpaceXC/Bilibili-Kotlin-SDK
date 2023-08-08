package cn.spacexc.bilibilisdk.sdk.bangumi.info.remote

data class Season(
    val badge: String,
    val badge_info: BadgeInfo,
    val badge_type: Int,
    val cover: String,
    val enable_vt: Boolean,
    val horizontal_cover_1610: String,
    val horizontal_cover_169: String,
    val media_id: Long,
    val new_ep: NewEpX,
    val season_id: Long,
    val season_title: String,
    val season_type: Int,
    val stat: Stat
)