package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class LevelInfo(
    @SerializedName("current_exp")
    val currentExp: Int,
    @SerializedName("current_level")
    val currentLevel: Int,
    @SerializedName("current_min")
    val currentMin: Int,
    @SerializedName("next_exp")
    val nextExp: Int
)