package cn.spacexc.bilibilisdk.sdk.video.action

import cn.spacexc.bilibilisdk.BilibiliSdkManager
import cn.spacexc.bilibilisdk.network.BasicResponseDto
import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.network.NetworkResponse
import cn.spacexc.bilibilisdk.sdk.video.action.result.LikeResult
import cn.spacexc.bilibilisdk.utils.UserUtils

/**
 * Created by XC-Qan on 2023/6/10.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object VideoAction {
    /**
     * @param isLiked 是否***已经***赞过
     */
    suspend fun likeVideo(
        videoIdType: String,
        videoId: String?,
        isLiked: Boolean
    ): NetworkResponse<LikeResult> {
        val operation = when (isLiked) {
            true -> 2       //如果已经赞过，则此次操作取消点赞
            false -> 1      //如果没有赞过，则此次操作为点赞
        }
        val csrf = BilibiliSdkManager.cookiesManager.getCookieByName("bili_jct")
        val body = mapOf(
            videoIdType to (videoId ?: ""),
            "like" to operation.toString(),
            "csrf" to (csrf?.value ?: "")
        )

        return KtorNetworkUtils.post(
            url = "http://api.bilibili.com/x/web-interface/archive/like",
            form = body
        )
    }

    suspend fun addToWatchLater(
        videoIdType: String,
        videoId: String,
    ): NetworkResponse<BasicResponseDto> {
        return KtorNetworkUtils.post(
            url = "https://api.bilibili.com/x/v2/history/toview/add", form = mapOf(
                videoIdType to videoId,
                "csrf" to (UserUtils.csrf() ?: "")
            )
        )
    }

    /**
     * @param videoId 只支持av号
     */
    suspend fun removeFromWatchLater(
        videoId: String
    ): NetworkResponse<BasicResponseDto> {
        return KtorNetworkUtils.post(
            url = "https://api.bilibili.com/x/v2/history/toview/del", form = mapOf(
                "aid" to videoId,
                "csrf" to (UserUtils.csrf() ?: "")
            )
        )
    }

    suspend fun updateHistory(
        aid: Long,
        cid: Long,
        progress: Int
    ) {
        if (UserUtils.csrf() != null) {
            val form = mapOf(
                "aid" to aid.toString(),
                "cid" to cid.toString(),
                "progress" to progress.toString(),
                "platform" to "android",
                "csrf" to (UserUtils.csrf() ?: "")
            )
            KtorNetworkUtils.post<String>(
                url = "https://api.bilibili.com/x/v2/history/report",
                form = form
            )
        }
    }
}