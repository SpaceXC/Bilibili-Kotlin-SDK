package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class CardX(
    val approve: Boolean,
    val article: Int,
    val attention: Int,
    val attentions: List<Any>,
    val birthday: String,
    val description: String,
    @SerializedName("DisplayRank")
    val displayRank: String,
    val face: String,
    @SerializedName("face_nft")
    val faceNft: Int,
    @SerializedName("face_nft_type")
    val faceNftType: Int,
    val fans: Int,
    val friend: Int,
    @SerializedName("is_senior_member")
    val isSeniorMember: Int,
    @SerializedName("level_info")
    val levelInfo: LevelInfo,
    val mid: Long,
    val name: String,
    val nameplate: Nameplate,
    @SerializedName("Official")
    val official: Official?,
    @SerializedName("official_verify")
    val officialVerify: OfficialVerify?,
    val pendant: Pendant?,
    val place: String,
    val rank: String,
    val regtime: Int,
    val sex: String,
    val sign: String,
    val spacesta: Int,
    val vip: Vip?
)