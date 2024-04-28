package cn.spacexc.bilibilisdk.sdk.comment.remote.detail.label


import com.google.gson.annotations.SerializedName

data class CardLabel(
    val rpid: Long,
    @SerializedName("text_content") val textContent: String,
    @SerializedName("text_color_day") val textColorDay: String,
    @SerializedName("text_color_night") val textColorNight: String,
    @SerializedName("label_color_day") val labelColorDay: String,
    @SerializedName("label_color_night") val labelColorNight: String,
    val image: String,
    val type: Int,
    val background: String,
    @SerializedName("background_width") val backgroundWidth: Int,
    @SerializedName("background_height") val backgroundHeight: Int,
    @SerializedName("jump_url") val jumpUrl: String,
    val effect: Int,
    @SerializedName("effect_start_time") val effectStartTime: Int
)