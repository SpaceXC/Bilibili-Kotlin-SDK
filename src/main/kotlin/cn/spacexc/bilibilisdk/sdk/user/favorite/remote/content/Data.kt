package cn.spacexc.bilibilisdk.sdk.user.favorite.remote.content

data class Data(
    val has_more: Boolean,
    val info: Info,
    val medias: List<Media>,
    val ttl: Int
)