package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class SubtitleInfo(
    @SerializedName("ai_status")
    val aiStatus: Int,
    @SerializedName("ai_type")
    val aiType: Int,
    val author: Author,
    val id: Long,
    @SerializedName("id_str")
    val idStr: String,
    @SerializedName("is_lock")
    val isLock: Boolean,
    val lan: String,
    @SerializedName("lan_doc")
    val lanDoc: String,
    @SerializedName("subtitle_url")
    val subtitleUrl: String,
    val type: Int
)