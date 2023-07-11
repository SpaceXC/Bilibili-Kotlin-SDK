package cn.spacexc.bilibilisdk.sdk.user.watchlater.info

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.sdk.user.watchlater.info.remote.WatchLaterList

/**
 * Created by XC-Qan on 2023/6/24.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object WatchLaterInfo {
    suspend fun getAllWatchLater(): NetworkResponse<WatchLaterList> =
        KtorNetworkUtils.get("https://api.bilibili.com/x/v2/history/toview/web")
}