package cn.spacexc.bilibilisdk.sdk.video.info.remote.playurl.tv


import com.google.gson.annotations.SerializedName

data class QnExtra(
    val attribute: Int,
    val icon: String,
    val icon2: String,
    @SerializedName("is_preview")
    val isPreview: Boolean,
    @SerializedName("need_login")
    val needLogin: Boolean,
    @SerializedName("need_vip")
    val needVip: Boolean,
    @SerializedName("preview_time")
    val previewTime: Int,
    val qn: Int
)