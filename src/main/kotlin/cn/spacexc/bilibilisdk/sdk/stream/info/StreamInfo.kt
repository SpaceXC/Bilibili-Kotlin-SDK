package cn.spacexc.bilibilisdk.sdk.stream.info

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.sdk.stream.info.remote.url.LiveStreamUrl

/**
 * Created by XC-Qan on 2023/10/12.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object StreamInfo {
    suspend fun getLiveStreamPlayUrlFromRoomId(roomId: Long): NetworkResponse<LiveStreamUrl> {
        return KtorNetworkUtils.get("https://api.live.bilibili.com/room/v1/Room/playUrl?cid=$roomId")
    }
}