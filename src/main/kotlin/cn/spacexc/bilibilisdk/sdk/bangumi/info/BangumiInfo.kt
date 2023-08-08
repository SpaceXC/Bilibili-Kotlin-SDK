package cn.spacexc.bilibilisdk.sdk.bangumi.info

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.sdk.bangumi.info.index.remote.BangumiFollowIndex
import cn.spacexc.bilibilisdk.sdk.bangumi.info.remote.BangumiInfo
import cn.spacexc.bilibilisdk.sdk.bangumi.info.url.BangumiPlayBackUrl

/**
 * Created by XC-Qan on 2023/7/19.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

const val BANGUMI_ID_TYPE_EPID = "ep_id"
const val BANGUMI_ID_TYPE_CID = "cid"

object BangumiInfo {
    suspend fun getBangumiInfo(
        bangumiIdType: String,
        bangumiId: Long
    ): NetworkResponse<BangumiInfo> {
        return KtorNetworkUtils.get("https://api.bilibili.com/pgc/view/web/season?$bangumiIdType=$bangumiId")
    }

    suspend fun getBangumiPlaybackUrl(
        bangumiIdType: String,
        bangumiId: Long
    ): NetworkResponse<BangumiPlayBackUrl> {
        return KtorNetworkUtils.get("https://api.bilibili.com/pgc/player/web/playurl?$bangumiIdType=$bangumiId")
    }

    suspend fun getBangumiFollowIndex(
        itemsPerPage: Int = 20,
        page: Int = 1
    ) : NetworkResponse<BangumiFollowIndex> {
        return KtorNetworkUtils.get("https://api.bilibili.com/pgc/season/index/result?season_version=-1&spoken_language_type=-1&area=-1&is_finish=-1&copyright=-1&season_status=-1&season_month=-1&year=-1&style_id=-1&order=3&st=1&sort=0&page=$page&season_type=1&pagesize=$itemsPerPage&type=1")
        //嘛，那堆参数就是一些筛选条件之类的，省事起见不动了
    }
}