package cn.spacexc.bilibilisdk.sdk.user.profile

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.current.CurrentUserInfo
import cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space.UserSpaceInfo
import cn.spacexc.bilibilisdk.sdk.user.profile.remote.stat.UserStat
import cn.spacexc.bilibilisdk.sdk.user.profile.remote.video.UserSpaceVideos
import cn.spacexc.bilibilisdk.sdk.user.profile.remote.video.app.AppUserSpaceVideos

/**
 * Created by XC-Qan on 2023/5/26.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

const val dmImgList =
    "[%7B%22x%22:2547,%22y%22:2476,%22z%22:0,%22timestamp%22:2258,%22k%22:121,%22type%22:0%7D,%7B%22x%22:1427,%22y%22:-35,%22z%22:109,%22timestamp%22:2359,%22k%22:125,%22type%22:0%7D,%7B%22x%22:1329,%22y%22:-175,%22z%22:45,%22timestamp%22:2461,%22k%22:91,%22type%22:0%7D,%7B%22x%22:1381,%22y%22:-365,%22z%22:110,%22timestamp%22:2562,%22k%22:91,%22type%22:0%7D,%7B%22x%22:1439,%22y%22:-322,%22z%22:213,%22timestamp%22:2663,%22k%22:105,%22type%22:0%7D,%7B%22x%22:1229,%22y%22:-533,%22z%22:6,%22timestamp%22:2764,%22k%22:69,%22type%22:0%7D,%7B%22x%22:1603,%22y%22:-159,%22z%22:380,%22timestamp%22:3264,%22k%22:77,%22type%22:1%7D]"
const val dmImgStr = "V2ViR0wgMS4wIChPcGVuR0wgRVMgMi4wIENocm9taXVtKQ"
const val dmImgCoverStr =
    "QU5HTEUgKEFwcGxlLCBBTkdMRSBNZXRhbCBSZW5kZXJlcjogQXBwbGUgTTEgUHJvLCBVbnNwZWNpZmllZCBWZXJzaW9uKUdvb2dsZSBJbmMuIChBcHBsZS"
const val dmImgInter =
    "%7B%22ds%22:[%7B%22t%22:1,%22c%22:%22bi1udW%22,%22p%22:[1094,46,938],%22s%22:[380,475,800]%7D],%22wh%22:[18,6,6],%22of%22:[104,208,104]%7D"
//理论上这一堆值都是要动态计算的但是貌似是和浏览器渲染相关的，但是是风控相关的所以貌似直接用固定的也没关系。这里直接随便找一个请求复制粘贴好了。


object UserProfileInfo {
    suspend fun getCurrentUserInfo(): NetworkResponse<CurrentUserInfo> {
        return KtorNetworkUtils.get("https://api.bilibili.com/x/space/myinfo")
    }

    suspend fun getUserInfoByMid(mid: Long): NetworkResponse<UserSpaceInfo> {
        return KtorNetworkUtils.getWithWebiSignature(
            host = "https://api.bilibili.com/x/space/wbi/acc/info",
            origParams = "mid=$mid&platform=web"
        )
    }

    suspend fun getUserStatByMid(mid: Long): NetworkResponse<UserStat> =
        KtorNetworkUtils.getWithWebiSignature(
            "https://api.bilibili.com/x/relation/stat",
            origParams = "vmid=$mid"
        )

    @Deprecated(
        message = "web端的好难搞哦",
        level = DeprecationLevel.ERROR,
        replaceWith = ReplaceWith(expression = "UserProfileInfo.getUserVideoList()")
    )
    suspend fun getUserVideoList(
        itemsPerPage: Int = 20,
        page: Int,
        keyword: String = "",
        mid: Long
    ): NetworkResponse<UserSpaceVideos> {
        return KtorNetworkUtils.getWithWebiSignature(
            host = "https://api.bilibili.com/x/space/wbi/arc/search",
            origParams = "mid=$mid" +
                    "&ps=$itemsPerPage" +
                    "&tid=0" +
                    "&pn=$page" +
                    "&keyword=$keyword" +
                    "&order=pubdate" +
                    "&platform=web" +
                    "&web_location=1550101" +
                    "&order_avoided=true" +
                    "&dm_img_list=$dmImgList" +
                    "&dm_img_str=$dmImgStr" +
                    "&dm_cover_img_str=$dmImgCoverStr" +
                    "&dm_img_inter=$dmImgInter"
        )
    }

    suspend fun getUserVideoListApp(
        itemsPerPage: Int = 20,
        page: Int,
        mid: Long
    ): NetworkResponse<AppUserSpaceVideos> {
        return KtorNetworkUtils.getWithAppSign(
            host = "https://app.bilibili.com/x/v2/space/archive",
            origParams = "actionKey=appkey&build=76600100&c_locale=zh-Hans_CN&player_net=1&pn=$page&ps=$itemsPerPage&s_locale=zh-Hans_CH&ts=${System.currentTimeMillis()}&vmid=$mid"
        )
    }
}