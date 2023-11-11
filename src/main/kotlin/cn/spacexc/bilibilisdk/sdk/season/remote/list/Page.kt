package cn.spacexc.bilibilisdk.sdk.season.remote.list


import com.google.gson.annotations.SerializedName

data class Page(
    @SerializedName("page_num")
    val pageNum: Int,
    @SerializedName("page_size")
    val pageSize: Int,
    val total: Int
)