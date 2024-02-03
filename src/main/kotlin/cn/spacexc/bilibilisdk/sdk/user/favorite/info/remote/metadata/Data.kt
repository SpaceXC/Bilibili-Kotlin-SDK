package cn.spacexc.bilibilisdk.sdk.user.favorite.info.remote.metadata

data class Data(
    val attr: Long,
    val cnt_info: CntInfo,
    val cover: String,
    val cover_type: Int,
    val ctime: Int,
    val fav_state: Int,
    val fid: Long,
    val id: Long,
    val intro: String,
    val like_state: Int,
    val media_count: Int,
    val mid: Long,
    val mtime: Int,
    val state: Int,
    val title: String,
    val type: Int,
    val upper: Upper
)