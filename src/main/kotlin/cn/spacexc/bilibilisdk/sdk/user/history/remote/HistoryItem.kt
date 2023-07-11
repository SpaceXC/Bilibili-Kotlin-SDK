package cn.spacexc.bilibilisdk.sdk.user.history.remote

data class HistoryItem(
    val author_face: String,
    val author_mid: Long,
    val author_name: String,
    val badge: String,
    val cover: String,
    val covers: Any,
    val current: String,
    val duration: Int,
    val history: History,
    val is_fav: Int,
    val is_finish: Int,
    val kid: Long,
    val live_status: Int,
    val long_title: String,
    val new_desc: String,
    val progress: Int,
    val show_title: String,
    val tag_name: String,
    val title: String,
    val total: Int,
    val uri: String,
    val videos: Int,
    val view_at: Long
)