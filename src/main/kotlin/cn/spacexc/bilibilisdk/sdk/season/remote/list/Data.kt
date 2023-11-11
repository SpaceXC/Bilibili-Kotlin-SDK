package cn.spacexc.bilibilisdk.sdk.season.remote.list


data class Data(
    val aids: List<Int>,
    val archives: List<Archive>,
    val meta: Meta,
    val page: Page
)