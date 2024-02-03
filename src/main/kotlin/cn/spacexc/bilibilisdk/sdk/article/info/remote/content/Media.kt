package cn.spacexc.bilibilisdk.sdk.article.info.remote.content


import com.google.gson.annotations.SerializedName

data class Media(
    val score: Int,
    @SerializedName("media_id") val mediaId: Int,
    val title: String,
    val cover: String,
    val area: String,
    @SerializedName("type_id") val typeId: Int,
    @SerializedName("type_name") val typeName: String,
    val spoiler: Int,
    @SerializedName("season_id") val seasonId: Int
)