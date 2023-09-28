package cn.spacexc.bilibilisdk.sdk.user.favorite.action.remote.commit


import com.google.gson.annotations.SerializedName

data class FavoriteResult(
    val code: Int,
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("message")
    val message: String
)