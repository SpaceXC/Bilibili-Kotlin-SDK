package cn.spacexc.bilibilisdk.sdk.user.card


import com.google.gson.annotations.SerializedName

data class Card(
    @SerializedName("approve")
    val approve: Boolean,
    @SerializedName("article")
    val article: Int,
    @SerializedName("attention")
    val attention: Int,
    @SerializedName("attentions")
    val attentions: List<Any>,
    @SerializedName("birthday")
    val birthday: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("DisplayRank")
    val displayRank: String,
    @SerializedName("face")
    val face: String,
    @SerializedName("face_nft")
    val faceNft: Int,
    @SerializedName("face_nft_type")
    val faceNftType: Int,
    @SerializedName("fans")
    val fans: Int,
    @SerializedName("friend")
    val friend: Int,
    @SerializedName("is_senior_member")
    val isSeniorMember: Int,
    @SerializedName("level_info")
    val levelInfo: LevelInfo,
    @SerializedName("mid")
    val mid: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("name_render")
    val nameRender: Any,
    @SerializedName("nameplate")
    val nameplate: Nameplate,
    @SerializedName("Official")
    val official: Official,
    @SerializedName("official_verify")
    val officialVerify: OfficialVerify,
    @SerializedName("pendant")
    val pendant: Pendant,
    @SerializedName("place")
    val place: String,
    @SerializedName("rank")
    val rank: String,
    @SerializedName("regtime")
    val regtime: Int,
    @SerializedName("sex")
    val sex: String,
    @SerializedName("sign")
    val sign: String,
    @SerializedName("spacesta")
    val spacesta: Int,
    @SerializedName("vip")
    val vip: Vip
)