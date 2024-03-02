package cn.spacexc.bilibilisdk.sdk.user.profile.remote.video.app


import com.google.gson.annotations.SerializedName

data class Item(
    val title: String,
    val subtitle: String,
    val tname: String,
    val cover: String,
    @SerializedName("cover_icon") val coverIcon: String,
    val uri: String,
    val `param`: String,
    val goto: String,
    val length: String,
    val duration: Int,
    @SerializedName("is_popular") val isPopular: Boolean,
    @SerializedName("is_steins") val isSteins: Boolean,
    @SerializedName("is_ugcpay") val isUgcpay: Boolean,
    @SerializedName("is_cooperation") val isCooperation: Boolean,
    @SerializedName("is_pgc") val isPgc: Boolean,
    @SerializedName("is_live_playback") val isLivePlayback: Boolean,
    @SerializedName("is_pugv") val isPugv: Boolean,
    @SerializedName("is_fold") val isFold: Boolean,
    val play: Int,
    val danmaku: Int,
    val ctime: Int,
    @SerializedName("ugc_pay") val ugcPay: Int,
    val author: String,
    val state: Boolean,
    val bvid: String,
    val videos: Int,
    @SerializedName("three_point") val threePoint: List<ThreePoint>,
    @SerializedName("first_cid") val firstCid: Long,
    @SerializedName("view_content") val viewContent: String,
    @SerializedName("icon_type") val iconType: Int,
    @SerializedName("publish_time_text") val publishTimeText: String
)