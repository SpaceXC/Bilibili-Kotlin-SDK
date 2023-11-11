package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class Subtitle(
    @SerializedName("allow_submit")
    val allowSubmit: Boolean,
    val list: List<SubtitleInfo>
)