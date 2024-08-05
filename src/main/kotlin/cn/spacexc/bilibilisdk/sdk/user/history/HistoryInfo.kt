package cn.spacexc.bilibilisdk.sdk.user.history

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.sdk.user.history.remote.HistoryList

/**
 * Created by XC-Qan on 2023/6/24.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object HistoryInfo {
    /**
     * @param lastTimeStamp 上一页的最后一个项目的时间戳 `view_at`
     */
    suspend fun getHistoryByPage(
        lastTimeStamp: Long = 0
    ): NetworkResponse<HistoryList> {
        //return KtorNetworkUtils.get("https://api.bilibili.com/x/web-interface/history/cursor?max=0&view_at=$lastTimeStamp&business=")   //官方在这里就没有写business参数，大概是限定返回结果类型的参数
        return KtorNetworkUtils.get("https://api.bilibili.com/x/web-interface/history/cursor?max=0&view_at=$lastTimeStamp&business=")   //官方在这里就没有写business参数，大概是限定返回结果类型的参数
    }
}