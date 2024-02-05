package cn.spacexc.bilibilisdk.sdk.article.info.remote.content


import com.google.gson.annotations.SerializedName

data class Author(
    val mid: Long,
    val name: String,
    val face: String,
    val pendant: Pendant,
    @SerializedName("official_verify") val officialVerify: OfficialVerify,
    val nameplate: Nameplate,
    val vip: Vip,
    val fans: Int,
    val level: Int
)