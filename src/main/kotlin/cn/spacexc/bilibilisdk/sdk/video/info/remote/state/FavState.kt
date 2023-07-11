package cn.spacexc.bilibilisdk.sdk.video.info.remote.state

data class FavState(
    val code: Int,
    val `data`: Data,
    val message: String,
    val ttl: Int
) {
    data class Data(
        val count: Int,
        val favoured: Boolean
    )
}