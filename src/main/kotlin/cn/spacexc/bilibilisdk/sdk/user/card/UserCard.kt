package cn.spacexc.bilibilisdk.sdk.user.card


import com.google.gson.annotations.SerializedName

data class UserCard(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("message")
    val message: String,
    @SerializedName("ttl")
    val ttl: Int
)