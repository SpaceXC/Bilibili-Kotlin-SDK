package cn.spacexc.bilibilisdk.sdk.message.data.system


import com.google.gson.annotations.SerializedName

data class SystemNotify(
    val id: Long,
    val cursor: Long,
    val publisher: Publisher?,
    val type: Int,
    val title: String,
    val content: String,
    val source: Source,
    @SerializedName("time_at") val timeAt: String,
    @SerializedName("card_type") val cardType: Int,
    @SerializedName("card_brief") val cardBrief: String,
    @SerializedName("card_msg_brief") val cardMsgBrief: String,
    @SerializedName("card_cover") val cardCover: String,
    @SerializedName("card_story_title") val cardStoryTitle: String,
    @SerializedName("card_link") val cardLink: String,
    val mc: String,
    @SerializedName("is_station") val isStation: Int,
    @SerializedName("is_send") val isSend: Int,
    @SerializedName("notify_cursor") val notifyCursor: Int
)