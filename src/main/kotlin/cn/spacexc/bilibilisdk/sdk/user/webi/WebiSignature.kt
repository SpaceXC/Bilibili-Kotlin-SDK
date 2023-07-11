package cn.spacexc.bilibilisdk.sdk.user.webi

import cn.spacexc.bilibilisdk.BilibiliSdkManager
import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.sdk.user.webi.remote.WebiSignatureKey

/**
 * Created by XC-Qan on 2023/6/11.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

val WEBI_SIGNATURE_KEY_ENCODING_MIXIN_TABLE = listOf(
    46, 47, 18, 2, 53, 8, 23, 32, 15, 50, 10, 31, 58, 3, 45, 35, 27, 43, 5, 49,
    33, 9, 42, 19, 29, 28, 14, 39, 12, 38, 41, 13, 37, 48, 7, 16, 24, 55, 40,
    61, 26, 17, 0, 1, 60, 51, 30, 4, 22, 25, 54, 21, 56, 59, 6, 63, 57, 62, 11,
    36, 20, 34, 44, 52
)

object WebiSignature {
    suspend fun getWebiSignature(): NetworkResponse<String> {
        val response = KtorNetworkUtils.get<WebiSignatureKey>("https://api.bilibili.com/nav")
        return if(response.code != 0) NetworkResponse.Failed(response.code, "Failed to obtain webi signature key") else {
            if (response.data?.code == 0) {
                response.data.data.let { result ->
                    val imgUrlKey =
                        result.wbi_img.img_url.split("/").last().split(".").first()
                    val subUrlKey =
                        result.wbi_img.sub_url.split("/").last().split(".").first()
                    val origKey = imgUrlKey + subUrlKey
                    val mixedKey = buildString {
                        WEBI_SIGNATURE_KEY_ENCODING_MIXIN_TABLE.forEach {
                            append(origKey[it])
                        }
                    }
                    BilibiliSdkManager.dataManager.saveString("webi_signature_key", mixedKey.substring(0..31))
                    NetworkResponse.Success(data = mixedKey)
                }
            } else {
                NetworkResponse.Failed(-1, "Failed to obtain webi signature key")
            }
        }
    }
}