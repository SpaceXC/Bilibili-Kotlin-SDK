package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


import com.google.gson.annotations.SerializedName

data class LiveRoom(
    val roomStatus: Int,
    val liveStatus: Int,
    val url: String,
    val title: String,
    val cover: String,
    val roomid: Int,
    val roundStatus: Int,
    @SerializedName("broadcast_type") val broadcastType: Int,
    @SerializedName("watched_show") val watchedShow: WatchedShow
)