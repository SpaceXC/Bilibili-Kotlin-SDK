package cn.spacexc.bilibilisdk.sdk.video.info.remote.playurl

data class Dash(
    val audio: List<Audio>,
    val dolby: Dolby,
    val duration: Int,
    val flac: Any,
    val minBufferTime: Double,
    val min_buffer_time: Double,
    val video: List<Video>
)