package cn.spacexc.bilibilisdk.data

import io.ktor.client.plugins.cookies.CookiesStorage
import io.ktor.http.Cookie

interface CookiesManager : CookiesStorage {
    suspend fun getCookieByName(name: String): Cookie?
    suspend fun deleteAllCookies()
}