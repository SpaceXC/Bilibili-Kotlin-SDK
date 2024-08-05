package cn.spacexc.bilibilisdk.sdk.message.data.direct.list

data class Data(
    val anti_disturb_cleaning: Boolean,
    val has_more: Int,
    val is_address_list_empty: Int,
    val session_list: List<Session>,
    val show_level: Boolean,
    val system_msg: SystemMsg
)