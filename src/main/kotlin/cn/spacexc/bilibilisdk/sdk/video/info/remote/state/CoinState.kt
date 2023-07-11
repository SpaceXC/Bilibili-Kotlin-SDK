package cn.spacexc.bilibilisdk.sdk.video.info.remote.state

data class CoinState(
    val code: Int,
    val `data`: Data,
    val message: String,
    val ttl: Int
) {
    data class Data(
        val multiply: Int
    )
}