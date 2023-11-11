package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class Honor(
    val aid: Long,
    val desc: String,
    val type: Int,
    @SerializedName("weekly_recommend_num")
    val weeklyRecommendNum: Int
)