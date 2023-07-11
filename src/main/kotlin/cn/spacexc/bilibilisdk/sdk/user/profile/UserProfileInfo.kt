package cn.spacexc.bilibilisdk.sdk.user.profile

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.CurrentUserInfo

/**
 * Created by XC-Qan on 2023/5/26.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object UserProfileInfo {
    suspend fun getCurrentUserInfo(): NetworkResponse<CurrentUserInfo> {
        return KtorNetworkUtils.get("https://api.bilibili.com/x/space/myinfo")
    }
}