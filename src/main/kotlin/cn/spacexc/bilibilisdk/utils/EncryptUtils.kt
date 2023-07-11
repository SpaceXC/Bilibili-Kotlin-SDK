package cn.spacexc.bilibilisdk.utils

import java.math.BigInteger
import java.security.KeyFactory
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.security.interfaces.RSAPublicKey
import java.security.spec.X509EncodedKeySpec
import javax.crypto.Cipher

/**
 * Some part of this file is copied from luern0313's repository WristBili
 *
 * Thanks a lot to him and his contributors
 */

/**
 * Created by XC-Qan on 2022/7/28.
 *
 * I'm very cute so please be nice to my code!
 *
 * 给！爷！写！注！释！
 *
 * 给！爷！写！注！释！
 *
 * 给！爷！写！注！释！
 */

object EncryptUtils {
    enum class AppSignType {
        TYPE_COMMON,
        TYPE_TV
    }

    private val appSecrets = mapOf(
        AppSignType.TYPE_COMMON to "560c52ccd288fed045859ed18bffd973",
        AppSignType.TYPE_TV to "59b43e04ad6965f34319062b478f83dd"
    )

    fun getAppSign(type: AppSignType, params: String): String {
        val content = "${params}${appSecrets[type]}"
        return md5(content)
    }

    fun md5(plainText: String): String {
        val secretBytes: ByteArray? = try {
            val md = MessageDigest.getInstance("MD5")
            md.update(plainText.toByteArray())
            md.digest()
        } catch (e: NoSuchAlgorithmException) {
            null
        }
        val md5code = StringBuilder(BigInteger(1, secretBytes).toString(16))
        for (i in 0 until 32 - md5code.length) {
            md5code.insert(0, "0")
        }
        return md5code.toString()
    }
}