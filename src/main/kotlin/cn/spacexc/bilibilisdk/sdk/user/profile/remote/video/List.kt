package cn.spacexc.bilibilisdk.sdk.user.profile.remote.video


import kotlin.collections.List

data class List(
    val tlist: Map<String, TagItem>,
    val vlist: List<Vlist>,
)