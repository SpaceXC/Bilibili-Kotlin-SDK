package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class Emergency(
    @SerializedName("no_coin")
    val noCoin: Boolean,
    @SerializedName("no_fav")
    val noFav: Boolean,
    @SerializedName("no_like")
    val noLike: Boolean,
    @SerializedName("no_share")
    val noShare: Boolean
)