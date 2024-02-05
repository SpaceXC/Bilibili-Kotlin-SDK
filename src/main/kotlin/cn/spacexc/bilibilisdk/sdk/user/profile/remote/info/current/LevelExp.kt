package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.current

data class LevelExp(
    val current_exp: Long,
    val current_level: Int,
    val current_min: Long,
    val level_up: Long,
    val next_exp: Long
)