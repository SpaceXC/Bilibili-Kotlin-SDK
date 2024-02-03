package cn.spacexc.bilibilisdk.sdk.article.info.remote.content


import com.google.gson.annotations.SerializedName

data class Stats(
    val view: Int,
    val favorite: Int,
    val like: Int,
    val dislike: Int,
    val reply: Int,
    val share: Int,
    val coin: Int,
    val `dynamic`: Int
)