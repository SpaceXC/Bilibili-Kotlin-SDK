package cn.spacexc.bilibilisdk.sdk.message.data.direct.list

data class LastMsg(
    val at_uids: Any,
    val content: String,
    val msg_key: Long,
    val msg_seqno: Long,
    val msg_source: Int,
    val msg_status: Int,
    val msg_type: Int,
    val new_face_version: Int,
    val notify_code: String,
    val receiver_id: Long,
    val receiver_type: Int,
    val sender_uid: Long,
    val timestamp: Int
)