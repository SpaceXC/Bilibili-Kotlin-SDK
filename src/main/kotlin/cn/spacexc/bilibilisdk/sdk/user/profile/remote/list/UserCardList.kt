package cn.spacexc.bilibilisdk.sdk.user.profile.remote.list

data class UserCardList(
    val code: Int,
    val `data`: Map<Long, UserCard>,
    val message: String,
    val ttl: Int
)