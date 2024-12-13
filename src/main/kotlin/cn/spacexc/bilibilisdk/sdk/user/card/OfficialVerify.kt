package cn.spacexc.bilibilisdk.sdk.user.card


import com.google.gson.annotations.SerializedName

data class OfficialVerify(
    @SerializedName("desc")
    val desc: String,
    @SerializedName("type")
    val type: Int
)