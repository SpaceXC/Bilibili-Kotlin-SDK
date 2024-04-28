package cn.spacexc.bilibilisdk.sdk.comment.remote.detail.item


import com.google.gson.annotations.SerializedName

data class LevelInfo(
    @SerializedName("current_level") val currentLevel: Int,
    @SerializedName("current_min") val currentMin: Int,
    @SerializedName("current_exp") val currentExp: Int,
    @SerializedName("next_exp") val nextExp: Int
)