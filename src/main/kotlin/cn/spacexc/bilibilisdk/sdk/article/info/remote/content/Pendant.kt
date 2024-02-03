package cn.spacexc.bilibilisdk.sdk.article.info.remote.content


import com.google.gson.annotations.SerializedName

data class Pendant(
    val pid: Int,
    val name: String,
    val image: String,
    val expire: Int
)