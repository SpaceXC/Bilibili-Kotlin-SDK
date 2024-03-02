package cn.spacexc.bilibilisdk.sdk.video.action.result

data class SanlianResult(
    val code: Int,
    val message: String,
    val ttl: Int,
    val data: Data
) {
    data class Data(
        val like: Boolean,
        val coin: Boolean,
        val fav: Boolean,
        val multiply: Int
    )
}