package cn.spacexc.bilibilisdk.sdk.article.info.remote.content


import com.google.gson.annotations.SerializedName

data class Label(
    val path: String,
    val text: String,
    @SerializedName("label_theme") val labelTheme: String
)