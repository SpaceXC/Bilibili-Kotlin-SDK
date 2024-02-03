package cn.spacexc.bilibilisdk.sdk.article.info.remote.content


import com.google.gson.annotations.SerializedName

data class Dispute(
    val dispute: String,
    @SerializedName("dispute_url") val disputeUrl: String
)