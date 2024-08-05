package cn.spacexc.bilibilisdk.sdk.message

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.sdk.message.data.at.AtMessages
import cn.spacexc.bilibilisdk.sdk.message.data.direct.history.DirectMessageHistory
import cn.spacexc.bilibilisdk.sdk.message.data.direct.list.DirectMessageList
import cn.spacexc.bilibilisdk.sdk.message.data.like.LikeMessages
import cn.spacexc.bilibilisdk.sdk.message.data.reply.ReplyMessages
import cn.spacexc.bilibilisdk.sdk.message.data.system.SystemNotification
import cn.spacexc.bilibilisdk.utils.UserUtils
import cn.spacexc.bilibilisdk.utils.isZeroOrNull

object MessageInfo {
    suspend fun getSystemNotifications(lastNotificationCursor: Long?) =
        KtorNetworkUtils.get<SystemNotification>(
            "https://message.bilibili.com/x/sys-msg/query_notify_list?" +
                    "csrf=${UserUtils.csrf()}" +
                    "&data_type=1" +
                    if (lastNotificationCursor.isZeroOrNull()) "" else "&cursor=$lastNotificationCursor" +
                            "&build=0" +
                            "&mobi_app=web"
        )

    suspend fun getDirectMessages(lastMessageCursor: Long?) =
        KtorNetworkUtils.getWithWebiSignature<DirectMessageList>(
            host = "https://api.vc.bilibili.com/session_svr/v1/session_svr/get_sessions",
            origParams = "session_type=1" +
                    "&group_fold=0" +
                    "&unfollow_fold=0&sort_rule=2" +
                    "&build=0" +
                    "&mobi_app=web" +
                    if (lastMessageCursor.isZeroOrNull()) "" else "&end_ts=$lastMessageCursor"
        )

    suspend fun getDirectMessageHistory(talkerMid: Long) =  //这里先不做分页了
        KtorNetworkUtils.get<DirectMessageHistory>("https://api.vc.bilibili.com/svr_sync/v1/svr_sync/fetch_session_msgs?talker_id=$talkerMid&session_type=1&size=200&sender_device_id=1&build=0&mobi_app=web")

    suspend fun getAtMessages(lastTimestamp: Long? = null) =
        KtorNetworkUtils.get<AtMessages>("https://api.bilibili.com/x/msgfeed/at?${if (lastTimestamp != null) "at_time=$lastTimestamp&" else ""}platform=web&build=0&mobi_app=web")

    suspend fun getReplyMessages(lastTimestamp: Long? = null) =
        KtorNetworkUtils.get<ReplyMessages>("https://api.bilibili.com/x/msgfeed/reply?${if (lastTimestamp != null) "reply_time=$lastTimestamp&" else ""}platform=web&build=0&mobi_app=web")

    suspend fun getLikeMessages(lastTimestamp: Long? = null) =
        KtorNetworkUtils.get<LikeMessages>("https://api.bilibili.com/x/msgfeed/like?${if (lastTimestamp != null) "like_time=$lastTimestamp&" else ""}platform=web&build=0&mobi_app=web")
}