package cn.spacexc.bilibilisdk.sdk.video.info

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.network.configurations
import cn.spacexc.bilibilisdk.sdk.video.info.remote.info.app.AppVideoInfo
import cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.WebVideoInfo
import cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed.WebVideoDetailedInformation
import cn.spacexc.bilibilisdk.sdk.video.info.remote.online.OnlineCountInfo
import cn.spacexc.bilibilisdk.sdk.video.info.remote.playerinfo.PlayerInfo
import cn.spacexc.bilibilisdk.sdk.video.info.remote.playurl.VideoPlaybackUrl
import cn.spacexc.bilibilisdk.sdk.video.info.remote.playurl.lowresolution.VideoLowResolutionPlaybackUrl
import cn.spacexc.bilibilisdk.sdk.video.info.remote.playurl.tv.VideoPlaybackUrlForTV
import cn.spacexc.bilibilisdk.sdk.video.info.remote.related.RelatedVideos
import cn.spacexc.bilibilisdk.sdk.video.info.remote.state.CoinState
import cn.spacexc.bilibilisdk.sdk.video.info.remote.state.FavState
import cn.spacexc.bilibilisdk.sdk.video.info.remote.state.LikeState
import cn.spacexc.bilibilisdk.sdk.video.info.remote.subtitle.SubtitleFile
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.io.InputStream
import java.util.zip.Inflater

/**
 * Created by XC-Qan on 2023/6/10.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object VideoInfo {
    suspend fun getVideoInfoByIdWeb(
        videoIdType: String,
        videoId: String
    ): NetworkResponse<WebVideoInfo> {
        return KtorNetworkUtils.get("https://api.bilibili.com/x/web-interface/view?$videoIdType=$videoId")
    }

    suspend fun getVideoDetailedInfoByIdWeb(
        videoIdType: String,
        videoId: String
    ): NetworkResponse<WebVideoDetailedInformation> {
        return KtorNetworkUtils.get("https://api.bilibili.com/x/web-interface/view/detail?$videoIdType=$videoId")
    }

    suspend fun getVideoInfoByIdApp(
        videoIdType: String,
        videoId: String
    ): NetworkResponse<AppVideoInfo> {
        return KtorNetworkUtils.getWithAppSign(
            host = "https://app.bilibili.com/x/v2/view",
            origParams = "build=${configurations["build"]}&$videoIdType=$videoId&mobi_app=${configurations["mobi_app"]}&plat=0&platform=${configurations["platform"]}&ts=${(System.currentTimeMillis() / 1000).toInt()}"
        )
    }

    suspend fun isLiked(
        videoIdType: String,
        videoId: String?
    ): Boolean {
        val response =
            KtorNetworkUtils.get<LikeState>("https://api.bilibili.com/x/web-interface/archive/has/like?$videoIdType=$videoId")
        return if (response.code != 0) false else response.data?.data == 1
    }

    suspend fun isCoined(
        videoIdType: String,
        videoId: String?
    ): Boolean {
        val response =
            KtorNetworkUtils.get<CoinState>("https://api.bilibili.com/x/web-interface/archive/coins?$videoIdType=$videoId")
        return if (response.code != 0) false else response.data?.data?.multiply != 0
    }

    /**
     * @param videoId 可以是aid或者bvid，无需传入id类型
     */
    suspend fun isFav(videoId: String?): Boolean {
        val response =
            KtorNetworkUtils.get<FavState>("https://api.bilibili.com/x/v2/fav/video/favoured?aid=$videoId")     //这接口就这么设计的我也不知道为啥bv和av都是aid（
        return if (response.code != 0) false else response.data?.data?.favoured == true //因为favoured是nullable所以加上==true以判断是否不是null或false
    }


    suspend fun getVideoPlaybackUrls(
        videoIdType: String = "bvid",
        videoId: String,
        videoCid: Long,
        webiSignatureKey: String? = null
    ): NetworkResponse<VideoPlaybackUrl> {
        println("signKeyPrev: $webiSignatureKey")
        return KtorNetworkUtils.getWithWebiSignature(
            host = "https://api.bilibili.com/x/player/wbi/playurl",
            origParams = "$videoIdType=$videoId&cid=$videoCid&qn=16&fnver=0&fnval=16&fourk=0",
            webiSignatureKey = webiSignatureKey
        )
    }

    suspend fun getLowResolutionVideoPlaybackUrl(
        videoIdType: String = "bvid",
        videoId: String,
        videoCid: Long,
    ): NetworkResponse<VideoLowResolutionPlaybackUrl> {
        return KtorNetworkUtils.get("https://api.bilibili.com/x/player/playurl?platform=html5&cid=$videoCid&$videoIdType=$videoId")
    }

    suspend fun getSubtitle(url: String): NetworkResponse<SubtitleFile> = KtorNetworkUtils.get(url)

    suspend fun getVideoDanmaku(cid: Long): InputStream? {
        val byteArray =
            KtorNetworkUtils.getBytes("https://api.bilibili.com/x/v1/dm/list.so?oid=$cid")
        return decompressDanmakuData(byteArray)?.inputStream()
    }

    suspend fun getOnlineCount(
        videoIdType: String,
        videoId: String,
        videoCid: Long
    ): NetworkResponse<OnlineCountInfo> {
        return KtorNetworkUtils.get("https://api.bilibili.com/x/player/online/total?$videoIdType=$videoId&cid=$videoCid")
    }

    suspend fun getRelatedVideosById(
        videoIdType: String,
        videoId: String
    ): NetworkResponse<RelatedVideos> =
        KtorNetworkUtils.get("https://api.bilibili.com/x/web-interface/archive/related?$videoIdType=$videoId")

    suspend fun getVideoPlayerInfo(
        videoIdType: String = "bvid",
        videoId: String,
        videoCid: Long,
        webiSignatureKey: String? = null
    ): NetworkResponse<PlayerInfo> {
        return KtorNetworkUtils.getWithWebiSignature(
            host = "https://api.bilibili.com/x/player/wbi/v2",
            origParams = "$videoIdType=$videoId&cid=$videoCid",
            webiSignatureKey = webiSignatureKey
        )
    }

    suspend fun getVideoPlayUrlForTv(
        videoCid: Long,
        isBangumi: Boolean
    ): NetworkResponse<VideoPlaybackUrlForTV> {
        val statistics =
            "%7B%22appId%22%3A1%2C%22version%22%3A%227.51.0%22%2C%22abtest%22%3A%22%22%2C%22platform%22%3A2%7D"
        return KtorNetworkUtils.getWithAppSign(
            host = "https://api.bilibili.com/x/tv/playurl",
            origParams =
            if (isBangumi) "build=75100100&c_locale=zh-Hans_CN&cid=$videoCid&mobi_app=iphone&platform=ios&playurl_type=2&qn=64&s_locale=zh-Hans_CH&statistics=$statistics&ts=${System.currentTimeMillis()}"
            else "build=75100100&c_locale=zh-Hans_CN&cid=$videoCid&mobi_app=iphone&platform=ios&playurl_type=1&qn=64&s_locale=zh-Hans_CH&statistics=$statistics&ts=${System.currentTimeMillis()}"
        )
    }

    /**
     *  解压弹幕数据
     *  From CSDN
     */
    private fun decompressDanmakuData(data: ByteArray?): ByteArray? {
        var output: ByteArray?
        val decompresser = Inflater(true)
        decompresser.reset()
        decompresser.setInput(data)
        val o = data?.size?.let { ByteArrayOutputStream(it) }
        try {
            val buf = ByteArray(1024)
            while (!decompresser.finished()) {
                val i = decompresser.inflate(buf)
                o?.write(buf, 0, i)
            }
            output = o?.toByteArray()
        } catch (e: Exception) {
            output = data
            e.printStackTrace()
        } finally {
            try {
                o?.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        decompresser.end()
        return output
    }
}