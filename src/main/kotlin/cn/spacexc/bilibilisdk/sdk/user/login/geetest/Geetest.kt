package cn.spacexc.bilibilisdk.sdk.user.login.geetest

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.sdk.user.login.geetest.domain.GeetestChallenge

/**
 * Created by XC-Qan on 2023/11/2.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object Geetest {
    suspend fun getChallenge() =
        KtorNetworkUtils.get<GeetestChallenge>("https://passport.bilibili.com/x/passport-login/captcha?source=main_web")
}