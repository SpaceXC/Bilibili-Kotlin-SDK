package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class Space(
    @SerializedName("l_img")
    val lImg: String,
    @SerializedName("s_img")
    val sImg: String
)