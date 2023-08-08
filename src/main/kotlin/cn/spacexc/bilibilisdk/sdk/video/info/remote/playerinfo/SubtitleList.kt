package cn.spacexc.bilibilisdk.sdk.video.info.remote.playerinfo

data class SubtitleList(
    val allow_submit: Boolean,
    val lan: String,
    val lan_doc: String,
    val subtitles: List<Subtitle>
)