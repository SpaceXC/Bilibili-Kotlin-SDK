package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


import com.google.gson.annotations.SerializedName

data class Profession(
    val name: String,
    val department: String,
    val title: String,
    @SerializedName("is_show") val isShow: Int
)