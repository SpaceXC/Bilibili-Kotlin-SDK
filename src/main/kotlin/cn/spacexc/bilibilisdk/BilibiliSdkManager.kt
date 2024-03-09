package cn.spacexc.bilibilisdk

import cn.spacexc.bilibilisdk.data.CookiesManager
import cn.spacexc.bilibilisdk.data.DataManager
import cn.spacexc.bilibilisdk.data.KtorCookiesManager
import cn.spacexc.bilibilisdk.data.SimpleDataManager
import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Created by XC-Qan on 2023/5/25.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object BilibiliSdkManager {
    var dataManager: DataManager = SimpleDataManager()
    lateinit var cookiesManager: CookiesManager

    fun initSdk(
        dataManager: DataManager = SimpleDataManager(),
        cookiesManager: CookiesManager = KtorCookiesManager(dataManager)
    ) {
        println("Bilibili SDK for kotlin by XC")
        this.dataManager = dataManager
        this.cookiesManager = cookiesManager
        println("DataManager: ${dataManager.javaClass}")
        println("Init cookies......")
        CoroutineScope(Dispatchers.IO).launch {
            KtorNetworkUtils.get<String>("https://www.bilibili.com")
        }
    }
}

fun main() {
    runBlocking {
        BilibiliSdkManager.initSdk()
    }
}