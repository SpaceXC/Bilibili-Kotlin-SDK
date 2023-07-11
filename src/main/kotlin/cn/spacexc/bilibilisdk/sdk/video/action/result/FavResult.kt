package cn.spacexc.bilibilisdk.sdk.video.action.result

data class FavResult(
    val code: Int,
    val `data`: Data,
    val message: String
) {
    data class Data(
        val prompt: Boolean
    )
}