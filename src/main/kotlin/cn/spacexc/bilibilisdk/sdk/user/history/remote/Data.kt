package cn.spacexc.bilibilisdk.sdk.user.history.remote

data class Data(
    val cursor: Cursor,
    val list: List<HistoryItem>,
    val tab: List<Tab>
)