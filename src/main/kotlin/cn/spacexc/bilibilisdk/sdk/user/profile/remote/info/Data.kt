package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info

data class Data(
    val birthday: Int,
    val coins: Double,
    val digital_id: String,
    val digital_type: Int,
    val email_status: Int,
    val face: String,
    val face_nft: Int,
    val face_nft_new: Int,
    val follower: Long,
    val following: Long,
    val honours: Honours,
    val identification: Int,
    val in_reg_audit: Int,
    val is_deleted: Int,
    val is_fake_account: Int,
    val is_rip_user: Boolean,
    val is_senior_member: Int,
    val is_tourist: Int,
    val jointime: Int,
    val level: Int,
    val level_exp: LevelExp,
    val mid: Long,
    val moral: Int,
    val name: String,
    val nameplate: Nameplate,
    val official: Official,
    val pendant: Pendant?,
    val pin_prompting: Int,
    val profession: Profession,
    val rank: Int,
    val sex: String,
    val sign: String,
    val silence: Int,
    val tel_status: Int,
    val vip: Vip?
)