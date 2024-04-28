package cn.spacexc.bilibilisdk.sdk.comment.remote.detail.item


import cn.spacexc.bilibilisdk.sdk.comment.remote.detail.label.CardLabel
import com.google.gson.annotations.SerializedName

data class CommentReplyItem(
    @SerializedName("card_label") val cardLabel: List<CardLabel>?,
    val rpid: Long,
    val oid: Long,
    val type: Int,
    val mid: Long,
    val root: Long,
    val parent: Long,
    val dialog: Long,
    val count: Int,
    val rcount: Int,
    val state: Int,
    val fansgrade: Int,
    val attr: Long,
    val ctime: Long,
    @SerializedName("mid_str") val midStr: String,
    @SerializedName("oid_str") val oidStr: String,
    @SerializedName("rpid_str") val rpidStr: String,
    @SerializedName("root_str") val rootStr: String,
    @SerializedName("parent_str") val parentStr: String,
    @SerializedName("dialog_str") val dialogStr: String,
    val like: Int,
    val action: Int,
    val member: Member,
    val content: Content,
    val replies: List<Any>,
    val assist: Int,
    @SerializedName("up_action") val upAction: UpAction,
    val invisible: Boolean,
    @SerializedName("reply_control") val replyControl: ReplyControl,
    val folder: Folder,
    @SerializedName("dynamic_id_str") val dynamicIdStr: String,
    @SerializedName("note_cvid_str") val noteCvidStr: String,
    @SerializedName("track_info") val trackInfo: String
)