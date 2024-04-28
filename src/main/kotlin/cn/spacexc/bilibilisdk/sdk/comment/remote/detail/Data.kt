package cn.spacexc.bilibilisdk.sdk.comment.remote.detail

import cn.spacexc.bilibilisdk.sdk.comment.remote.detail.item.CommentReplyItem


data class Data(
    val page: Page,
    val upper: Upper,
    val replies: List<CommentReplyItem>,
    val root: CommentReplyItem,
    val config: Config,
    val control: Control
)