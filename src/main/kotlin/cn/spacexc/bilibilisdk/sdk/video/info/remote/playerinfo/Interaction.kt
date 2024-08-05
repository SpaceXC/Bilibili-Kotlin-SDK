package cn.spacexc.bilibilisdk.sdk.video.info.remote.playerinfo

data class Interaction(
    val error_toast: String,
    val graph_version: Int,
    val history_node: HistoryNode?,
    val mark: Int,
    val msg: String,
    val need_reload: Int
)