package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class AiRcmd(
    val goto: String,
    val id: Long,
    val trackid: String,
    @SerializedName("uniq_id")
    val uniqId: String
)