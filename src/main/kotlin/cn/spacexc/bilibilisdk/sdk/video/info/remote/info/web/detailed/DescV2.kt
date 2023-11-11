package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class DescV2(
    @SerializedName("biz_id")
    val bizId: Int,
    @SerializedName("raw_text")
    val rawText: String,
    val type: Int
)