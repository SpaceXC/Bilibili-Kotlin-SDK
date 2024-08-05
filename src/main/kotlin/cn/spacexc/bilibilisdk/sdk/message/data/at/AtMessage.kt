package cn.spacexc.bilibilisdk.sdk.message.data.at

data class AtMessage(
    val at_time: Long,
    val id: Long,
    val item: Item,
    val user: User
)