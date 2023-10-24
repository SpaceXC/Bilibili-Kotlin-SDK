package cn.spacexc.bilibilisdk.sdk.video.info.remote.playurl.tv


import com.google.gson.annotations.SerializedName

data class Volume(
    @SerializedName("measured_i")
    val measuredI: Double,
    @SerializedName("measured_lra")
    val measuredLra: Double,
    @SerializedName("measured_threshold")
    val measuredThreshold: Double,
    @SerializedName("measured_tp")
    val measuredTp: Double,
    @SerializedName("target_i")
    val targetI: Int,
    @SerializedName("target_offset")
    val targetOffset: Double,
    @SerializedName("target_tp")
    val targetTp: Int
)