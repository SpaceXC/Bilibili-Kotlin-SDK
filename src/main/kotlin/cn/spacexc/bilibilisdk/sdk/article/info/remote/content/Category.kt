package cn.spacexc.bilibilisdk.sdk.article.info.remote.content


import com.google.gson.annotations.SerializedName

data class Category(
    val id: Long,
    @SerializedName("parent_id") val parentId: Int,
    val name: String
)