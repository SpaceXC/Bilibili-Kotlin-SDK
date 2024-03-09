package cn.spacexc.bilibilisdk.utils

import cn.spacexc.bilibilisdk.BilibiliSdkManager
import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.utils.remote.UserExitResult

/**
 * Created by XC-Qan on 2023/4/5.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object UserUtils {
    suspend fun isUserLoggedIn(): Boolean =
        !BilibiliSdkManager.cookiesManager.getCookieByName("SESSDATA")?.value.isNullOrEmpty()

    suspend fun mid(): Long? =
        BilibiliSdkManager.dataManager.getString("currentUid")
            ?.toLongOrNull()//.cookiesManager.getCookieByName("DedeUserID")?.value?.toLongOrNull()

    suspend fun setCurrentUid(uid: Long?) =
        BilibiliSdkManager.dataManager.saveString("currentUid", uid.toString())

    suspend fun addUser(mid: Long) {
        BilibiliSdkManager.dataManager.apply {
            val oldList: List<Long> =
                getString("addedUsers")?.split(",")?.map { it.toLong() } ?: emptyList()
            if (oldList.contains(mid)) return@apply
            saveString("addedUsers", (oldList + mid).joinToString(","))
        }
    }

    suspend fun getUsers(): List<Long> {
        val list = BilibiliSdkManager.dataManager.getString("addedUsers")?.split(",") ?: emptyList()
        return list.map { it.toLong() }
    }

    suspend fun csrf(): String? =
        BilibiliSdkManager.cookiesManager.getCookieByName("bili_jct")?.value

    suspend fun webiSign(): String? =
        BilibiliSdkManager.dataManager.getString("webi_signature_key", null)

    suspend fun getBuvid(): String? = BilibiliSdkManager.dataManager.getString("buvid")

    suspend fun logout(): Boolean {
        val form = mapOf(
            "biliCSRF" to (csrf() ?: "")
        )
        val response = KtorNetworkUtils.post<UserExitResult>(
            url = "https://passport.bilibili.com/login/exit/v2",
            form = form
        )
        //val succeed = response.code == 0
        //if(succeed) {
        BilibiliSdkManager.cookiesManager.deleteAllCookies()
        setCurrentUid(null)
        //}
        return true //succeed
    }
}