package cn.spacexc.bilibilisdk.sdk.user.favorite.action

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.sdk.user.favorite.action.remote.commit.FavoriteResult
import cn.spacexc.bilibilisdk.utils.UserUtils

/**
 * Created by XC-Qan on 2023/8/18.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object FavoriteActions {
    suspend fun commitFavorite(
        videoAid: Long,
        idsToAdd: List<Long>,
        idsToDelete: List<Long>
    ): NetworkResponse<FavoriteResult> {
        val formBody = buildMap {
            put("rid", videoAid.toString())
            put("csrf", UserUtils.csrf().toString())
            put("type", "2")    //应该是视频类型喵
            if (idsToAdd.isNotEmpty()) {
                put("add_media_ids", idsToAdd.joinToString(separator = ","))
            }
            if (idsToDelete.isNotEmpty()) {
                put("del_media_ids", idsToDelete.joinToString(separator = ","))
            }
        }
        return KtorNetworkUtils.post(
            url = "http://api.bilibili.com/x/v3/fav/resource/deal",
            form = formBody
        )
    }
}