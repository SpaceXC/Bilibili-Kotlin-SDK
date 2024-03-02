package cn.spacexc.bilibilisdk.sdk.user.profile.remote.video


import com.google.gson.annotations.SerializedName

data class Vlist(
    val comment: Int,
    val typeid: Long,
    val play: Int,
    val pic: String,
    val subtitle: String,
    val description: String,
    val copyright: String,
    val title: String,
    val review: Int,
    val author: String,
    val mid: Long,
    val created: Int,
    val length: String,
    @SerializedName("video_review") val videoReview: Int,
    val aid: Long,
    val bvid: String,
    @SerializedName("hide_click") val hideClick: Boolean,
    @SerializedName("is_pay") val isPay: Int,
    @SerializedName("is_union_video") val isUnionVideo: Int,
    @SerializedName("is_steins_gate") val isSteinsGate: Int,
    @SerializedName("is_live_playback") val isLivePlayback: Int,
    @SerializedName("is_lesson_video") val isLessonVideo: Int,
    @SerializedName("is_lesson_finished") val isLessonFinished: Int,
    @SerializedName("lesson_update_info") val lessonUpdateInfo: String,
    @SerializedName("jump_url") val jumpUrl: String,
    val meta: Any?,
    @SerializedName("is_avoided") val isAvoided: Int,
    @SerializedName("season_id") val seasonid: Long,
    val attribute: Int,
    @SerializedName("is_charging_arc") val isChargingArc: Boolean,
    val vt: Int,
    @SerializedName("enable_vt") val enableVt: Int,
    @SerializedName("vt_display") val vtDisplay: String,
    @SerializedName("playback_position") val playbackPosition: Int
)