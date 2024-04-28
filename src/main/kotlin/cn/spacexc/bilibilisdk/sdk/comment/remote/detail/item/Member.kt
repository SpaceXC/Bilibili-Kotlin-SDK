package cn.spacexc.bilibilisdk.sdk.comment.remote.detail.item


import com.google.gson.annotations.SerializedName

data class Member(
    val mid: String,
    val uname: String,
    val sex: String,
    val sign: String,
    val avatar: String,
    val rank: String,
    @SerializedName("face_nft_new") val faceNftNew: Int,
    @SerializedName("is_senior_member") val isSeniorMember: Int,
    val senior: Senior,
    @SerializedName("level_info") val levelInfo: LevelInfo,
    val pendant: Pendant,
    val nameplate: Nameplate,
    @SerializedName("official_verify") val officialVerify: OfficialVerify,
    val vip: Vip
)