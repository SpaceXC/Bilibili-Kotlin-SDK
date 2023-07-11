package cn.spacexc.bilibilisdk.sdk.video.info.remote.related

data class Data(
    val aid: Long,
    val bvid: String,
    val cid: Long,
    val copyright: Int,
    val ctime: Int,
    val desc: String,
    val dimension: Dimension,
    val duration: Int,
    val `dynamic`: String,
    val enable_vt: Int,
    val first_frame: String,
    val is_ogv: Boolean,
    val mission_id: Long,
    val ogv_info: Any,
    val owner: Owner,
    val pic: String,
    val pub_location: String,
    val pubdate: Int,
    val rcmd_reason: String,
    val redirect_url: String,
    val rights: Rights,
    val season_type: Int,
    val short_link_v2: String,
    val stat: Stat,
    val state: Int,
    val tid: Long,
    val title: String,
    val tname: String,
    val up_from_v2: Int,
    val videos: Int
)