package cn.spacexc.bilibilisdk.sdk.bangumi.info.index.remote

data class Data(
    val has_next: Int,
    val list: List<BangumiFollowItem>,
    val num: Int,
    val size: Int,
    val total: Int
)