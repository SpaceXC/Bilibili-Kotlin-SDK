package cn.spacexc.bilibilisdk.sdk.season

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.sdk.season.remote.list.SeasonVideoList

/**
 * Created by XC-Qan on 2023/11/5.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object SeasonInfo {
    suspend fun getVideosInSeasonById(
        mid: Long,
        seasonId: Long,
        page: Int,
        itemsPerPage: Int = 20
    ): NetworkResponse<SeasonVideoList> {
        return KtorNetworkUtils.get("https://api.bilibili.com/x/polymer/web-space/seasons_archives_list?mid=$mid&season_id=$seasonId&sort_reverse=false&page_num=$page&page_size=$itemsPerPage")
    }
}