package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.app

data class Config(
    val autoplay_countdown: Int,
    val feed_has_next: Boolean,
    val feed_style: String,
    val has_guide: Boolean,
    val is_absolute_time: Boolean,
    val local_play: Int,
    val rec_three_point_style: Int,
    val relates_title: String,
    val share_style: Int,
    val valid_show_m: Int,
    val valid_show_n: Int
)