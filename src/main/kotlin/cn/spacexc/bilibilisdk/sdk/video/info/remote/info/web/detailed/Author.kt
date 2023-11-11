package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class Author(
    val birthday: Int,
    val face: String,
    @SerializedName("in_reg_audit")
    val inRegAudit: Int,
    @SerializedName("is_deleted")
    val isDeleted: Int,
    @SerializedName("is_fake_account")
    val isFakeAccount: Int,
    @SerializedName("is_senior_member")
    val isSeniorMember: Int,
    val mid: Long,
    val name: String,
    val rank: Int,
    val sex: String,
    val sign: String
)