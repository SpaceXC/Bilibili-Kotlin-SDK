package cn.spacexc.bilibilisdk.sdk.user.follow.following.remote.user

data class FollowedUsersGroup(
    val code: Int,
    val `data`: List<Data>,
    val message: String,
    val ttl: Int
)