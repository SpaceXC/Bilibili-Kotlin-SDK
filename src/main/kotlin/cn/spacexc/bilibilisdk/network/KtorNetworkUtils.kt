package cn.spacexc.bilibilisdk.network

import cn.spacexc.bilibilisdk.BilibiliSdkManager
import cn.spacexc.bilibilisdk.utils.EncryptUtils
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.cookies.HttpCookies
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.logging.SIMPLE
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.forms.submitForm
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.prepareGet
import io.ktor.client.statement.readBytes
import io.ktor.http.HttpStatusCode
import io.ktor.http.Parameters
import io.ktor.http.contentLength
import io.ktor.http.userAgent
import io.ktor.serialization.gson.gson
import io.ktor.utils.io.ByteReadChannel
import io.ktor.utils.io.core.isEmpty
import io.ktor.utils.io.core.readBytes
import kotlinx.coroutines.runBlocking
import java.io.File

/**
 * Created by XC-Qan on 2023/3/22.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

//TODO ensure main safe(20230711

const val USER_AGENT =
    "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36"
const val BASE_URL = "https://www.bilibili.com" //Referer必须符合^https?://(\S+).bilibili.com

const val APP_KEY = "1d8b6e7d45233436"
const val APP_SEC = "560c52ccd288fed045859ed18bffd973"
val configurations = mapOf(
    "appKey" to "1d8b6e7d45233436",
    "actionKey" to "appkey",
    "build" to "520001",
    "device" to "android",
    "mobi_app" to "android",
    "platform" to "android",
    "app_secret" to "560c52ccd288fed045859ed18bffd973"
)

internal object KtorNetworkUtils {
    private val client = HttpClient(CIO) {
        install(ContentNegotiation) {
            gson {
                serializeNulls()
                enableComplexMapKeySerialization()
            }
        }
        install(Logging) {
            logger = Logger.SIMPLE
            level = LogLevel.ALL
        }
        install(HttpCookies) {
            storage = BilibiliSdkManager.cookiesManager
        }
        expectSuccess = true
    }

    suspend inline fun <reified T> get(
        url: String,
        builder: HttpRequestBuilder.() -> Unit = {}
    ): NetworkResponse<T> {
        return try {
            val response = client.get(url) {
                userAgent(USER_AGENT)
                header("Referer", BASE_URL)
                builder()
            }
            return if (response.status == HttpStatusCode.OK) {
                val bodyInfo = response.body<BasicResponseDto>()
                val body = response.body<T>()
                if (bodyInfo.code != 0) {
                    NetworkResponse.Failed(code = bodyInfo.code, message = bodyInfo.message)
                } else {
                    NetworkResponse.Success(body)
                }
            } else {
                val body = response.body<BasicResponseDto>()
                NetworkResponse.Failed(code = body.code, message = body.message, null)
            }
        } catch (e: Exception) {
            e.printStackTrace()
            println("Error occurred: ${e.stackTraceToString()}")
            NetworkResponse.Failed(code = -1, message = e.message ?: "Unknown error", null)
        }
    }

    suspend fun getBytes(
        url: String,
        builder: HttpRequestBuilder.() -> Unit = {}
    ): ByteArray? {
        return try {
            val response = client.get(url) {
                userAgent(USER_AGENT)
                header("Referer", BASE_URL)
                builder()
            }
            return response.readBytes()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    suspend inline fun <reified T> getWithWebiSignature(
        host: String,
        origParams: String,
        webiSignatureKey: String? = null,
        builder: HttpRequestBuilder.() -> Unit = {}
    ): NetworkResponse<T> {
        //return try {
        val key =
            webiSignatureKey ?: BilibiliSdkManager.dataManager.getString("webi_signature_key", null)
        println("signKey: $key")
        val signedParams = if (!key.isNullOrEmpty()) {
            var params = origParams.split("&").sorted().joinToString(separator = "&")
            params += "&wts=${System.currentTimeMillis()}"
            val wrid = EncryptUtils.md5(params + key)
            params += "&w_rid=$wrid"
            params

        } else origParams
        return get(url = "$host?$signedParams", builder = builder)
    }

    suspend inline fun <reified T> getWithAppSign(
        host: String,
        origParams: String,
        builder: HttpRequestBuilder.() -> Unit = {}
    ): NetworkResponse<T> {
        var temp = origParams
        temp += "&appkey=$APP_KEY"
        temp = temp.split("&").sorted().joinToString(separator = "&")
        val sign = EncryptUtils.md5("$temp$APP_SEC")
        val param = "$temp&sign=$sign"
        return get(url = "$host?$param", builder = builder)
    }

    suspend inline fun <reified T> post(
        url: String,
        form: Map<String, String>,
        crossinline builder: HttpRequestBuilder.() -> Unit = {}
    ): NetworkResponse<T> {
        val params = Parameters.build {
            form.forEach {
                append(it.key, it.value)
            }
        }
        return try {
            val response = client.submitForm(formParameters = params, url = url) {
                userAgent(USER_AGENT)
                header("Referer", BASE_URL)
                builder()
            }
            return if (response.status == HttpStatusCode.OK) {
                val bodyInfo = response.body<BasicResponseDto>()
                val body = response.body<T>()
                if (bodyInfo.code != 0) {
                    NetworkResponse.Failed(code = bodyInfo.code, message = bodyInfo.message)
                } else {
                    NetworkResponse.Success(body)
                }
            } else {
                val body = response.body<BasicResponseDto>()
                NetworkResponse.Failed(code = body.code, message = body.message, null)
            }
        } catch (e: Exception) {
            e.printStackTrace()
            NetworkResponse.Failed(code = -1, message = e.message ?: "Unknown error", null)
        }
    }

    suspend fun downloadFile(
        url: String,
        file: File,
        onProgressUpdate: (Float) -> Unit,
        onDownloadFinished: (Boolean) -> Unit
    ) {
        runBlocking {
            client.prepareGet(url) {
                header("User-Agent", "Mozilla/5.0 BiliDroid/*.*.* (bbcallen@gmail.com)")
                header("Referer", "https://bilibili.com/")
            }.execute { httpResponse ->
                try {
                    val channel: ByteReadChannel = httpResponse.body()
                    while (!channel.isClosedForRead) {
                        val packet = channel.readRemaining(DEFAULT_BUFFER_SIZE.toLong())
                        while (!packet.isEmpty) {
                            val bytes = packet.readBytes()
                            file.appendBytes(bytes)
                            onProgressUpdate(
                                file.length().toFloat() / (httpResponse.contentLength()
                                    ?: 1).toInt()
                            )
                        }
                    }
                    onDownloadFinished(true)
                } catch (e: Exception) {
                    onDownloadFinished(false)
                }
            }
        }
    }
}