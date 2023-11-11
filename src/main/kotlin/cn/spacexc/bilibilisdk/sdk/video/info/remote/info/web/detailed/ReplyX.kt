package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class ReplyX(
    val action: Int,
    val assist: Int,
    val attr: Int,
    val content: Any,
    val count: Int,
    val ctime: Int,
    val dialog: Int,
    val fansgrade: Int,
    val like: Int,
    val mid: Long,
    val oid: Long,
    val parent: Int,
    val rcount: Int,
    val replies: Any,
    val root: Int,
    val rpid: Long,
    @SerializedName("show_follow")
    val showFollow: Boolean,
    val state: Int,
    val type: Int
)