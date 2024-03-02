package cn.spacexc.bilibilisdk.sdk.article.info.remote.content


import com.google.gson.annotations.SerializedName

data class Media(
    val score: Int,
    @SerializedName("media_id") val mediaid: Long,
    val title: String,
    val cover: String,
    val area: String,
    @SerializedName("type_id") val typeid: Long,
    @SerializedName("type_name") val typeName: String,
    val spoiler: Int,
    @SerializedName("season_id") val seasonid: Long
)