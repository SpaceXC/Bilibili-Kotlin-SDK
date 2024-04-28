package cn.spacexc.bilibilisdk.sdk.comment

import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.sdk.comment.remote.detail.CommentRepliesDetail

object CommentInfo {
    suspend fun getCommentRepliesDetail(
        rootId: Long,
        type: Int = 1,
        videoAid: Long,
        itemsPerPage: Int = 20,
        page: Int = 1
    ) = KtorNetworkUtils.getWithWebiSignature<CommentRepliesDetail>(
        host = "https://api.bilibili.com/x/v2/reply/reply",
        origParams = "oid=$videoAid&type=$type&root=$rootId&ps=$itemsPerPage&pn=$page&gaia_source=main_web&web_location=333.788"
    )
}