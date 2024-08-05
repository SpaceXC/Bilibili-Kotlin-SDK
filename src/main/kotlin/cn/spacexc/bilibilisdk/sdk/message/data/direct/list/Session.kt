package cn.spacexc.bilibilisdk.sdk.message.data.direct.list

import cn.spacexc.bilibilisdk.sdk.user.profile.remote.list.UserCard

data class Session(
    val account_info: AccountInfo?,
    val ack_seqno: Long,
    val ack_ts: Long,
    val at_seqno: Int,
    val biz_msg_unread_count: Int,
    val can_fold: Int,
    val group_cover: String,
    val group_name: String,
    val group_type: Int,
    val is_dnd: Int,
    val is_follow: Int,
    val is_guardian: Int,
    val is_intercept: Int,
    val is_trust: Int,
    val last_msg: LastMsg,
    val live_status: Int,
    val max_seqno: Long,
    val new_push_msg: Int,
    val session_ts: Long,
    val session_type: Int,
    val setting: Int,
    val status: Int,
    val system_msg_type: Int,
    val talker_id: Long,
    val top_ts: Long,
    val unread_count: Int,
    val userCard: UserCard? = null,
)