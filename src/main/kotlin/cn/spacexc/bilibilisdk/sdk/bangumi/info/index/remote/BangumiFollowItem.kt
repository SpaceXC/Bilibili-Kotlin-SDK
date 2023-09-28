package cn.spacexc.bilibilisdk.sdk.bangumi.info.index.remote

data class BangumiFollowItem(
    val badge: String,
    val badge_info: BadgeInfo,
    val badge_type: Int,
    val cover: String,
    val first_ep: FirstEp,
    val index_show: String,
    val is_finish: Int,
    val link: String,
    val media_id: Long,
    val order: String,
    val order_type: String,
    val score: String,
    val season_id: Long,
    val season_status: Int,
    val season_type: Int,
    val subTitle: String,
    val title: String,
    val title_icon: String
)