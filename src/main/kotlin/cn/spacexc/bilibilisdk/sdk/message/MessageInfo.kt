package cn.spacexc.bilibilisdk.sdk.message

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
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
}