package cn.spacexc.bilibilisdk.sdk.user.follow.following.remote.tags

data class FollowedUserTags(
    val code: Int,
    val `data`: List<FollowedUserTag>,
    val message: String,
    val ttl: Int
)