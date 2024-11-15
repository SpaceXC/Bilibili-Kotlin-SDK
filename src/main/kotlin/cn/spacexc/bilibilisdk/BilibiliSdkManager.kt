package cn.spacexc.bilibilisdk

import cn.spacexc.bilibilisdk.data.CookiesManager
import cn.spacexc.bilibilisdk.data.DataManager
import cn.spacexc.bilibilisdk.data.KtorCookiesManager
import cn.spacexc.bilibilisdk.data.SimpleDataManager
import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.jsoup.Jsoup
import java.net.URLDecoder

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
            val response = KtorNetworkUtils.getString("https://space.bilibili.com/")
            response.data?.let {
                val document = Jsoup.parse(it)
                val renderData = document.head().getElementById("__RENDER_DATA__")
                renderData?.let {
                    val data = renderData.childNodes()[0]
                    println(data)
                    val json = URLDecoder.decode(data.toString(), "UTF-8")
                    println(json)
                    val accessId = Gson().fromJson(json, AccessId::class.java)
                    println("access id: ${accessId.access_id}")
                    dataManager.saveString("accessId", accessId.access_id)
                }
            }
        }
    }
}

data class AccessId(val access_id: String)

fun main() {
    runBlocking {
        BilibiliSdkManager.initSdk()
    }
}