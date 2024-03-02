package cn.spacexc.bilibilisdk.sdk.video.info.remote.playurl.lowresolution

data class Data(
    val accept_description: List<String>,
    val accept_format: String,
    val accept_quality: List<Int>,
    val durl: List<Durl>,
    val format: String,
    val from: String,
    val high_format: HighFormat,
    val last_play_cid: Long,
    val last_play_time: Long,
    val message: String,
    val quality: Int,
    val result: String,
    val seek_param: String,
    val seek_type: String,
    val support_formats: List<SupportFormat>,
    val timelength: Long,
    val video_codecid: Long
)