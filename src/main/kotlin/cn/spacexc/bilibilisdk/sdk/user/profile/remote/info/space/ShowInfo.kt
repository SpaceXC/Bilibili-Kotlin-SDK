package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


import com.google.gson.annotations.SerializedName

data class ShowInfo(
    val show: Boolean,
    val state: Int,
    val title: String,
    val icon: String,
    @SerializedName("jump_url") val jumpUrl: String
)