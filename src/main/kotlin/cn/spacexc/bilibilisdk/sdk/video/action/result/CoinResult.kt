package cn.spacexc.bilibilisdk.sdk.video.action.result

data class CoinResult(
    val code: Int,
    val `data`: Data,
    val message: String,
    val ttl: Int
) {
    data class Data(
        val like: Boolean
    )
}