package cn.spacexc.bilibilisdk.sdk.user.webi.remote

data class WebiSignatureKey(
    val code: Int,
    val `data`: Data,
    val message: String,
    val ttl: Int
)