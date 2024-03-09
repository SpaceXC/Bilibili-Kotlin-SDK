package cn.spacexc.bilibilisdk.sdk.user.follow.following

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.sdk.user.follow.following.remote.tags.FollowedUserTags
import cn.spacexc.bilibilisdk.sdk.user.follow.following.remote.user.FollowedUsersGroup
import cn.spacexc.bilibilisdk.utils.UserUtils

/**
 * Created by XC-Qan on 2023/6/23.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object FollowedUserInfo {
    suspend fun getFollowedUserTags(): NetworkResponse<FollowedUserTags> {
        return KtorNetworkUtils.get("https://api.bilibili.com/x/relation/tags")
    }

    suspend fun getFollowedUsersByTag(
        itemsPerPage: Int = 20,
        page: Int,
        tagId: Long
    ): NetworkResponse<FollowedUsersGroup> {
        return KtorNetworkUtils.get("https://api.bilibili.com/x/relation/tags?mid=${UserUtils.mid()}&tagid=$tagId&pn=$page&ps=$itemsPerPage")
    }
}
