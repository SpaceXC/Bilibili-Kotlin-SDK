package cn.spacexc.bilibilisdk.sdk.user.card


import com.google.gson.annotations.SerializedName

data class Official(
    @SerializedName("desc")
    val desc: String,
    @SerializedName("role")
    val role: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: Int
)