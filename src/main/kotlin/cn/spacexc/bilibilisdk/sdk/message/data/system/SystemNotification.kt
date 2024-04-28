package cn.spacexc.bilibilisdk.sdk.message.data.system


data class SystemNotification(
    val code: Int,
    val msg: String,
    val message: String,
    val ttl: Int,
    val `data`: List<SystemNotify>
)