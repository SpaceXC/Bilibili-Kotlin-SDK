package cn.spacexc.bilibilisdk.sdk.season.remote.list


import com.google.gson.annotations.SerializedName

data class Meta(
    val category: Int,
    val cover: String,
    val description: String,
    val mid: Long,
    val name: String,
    val ptime: Int,
    @SerializedName("season_id")
    val seasonid: Long,
    val total: Int
)