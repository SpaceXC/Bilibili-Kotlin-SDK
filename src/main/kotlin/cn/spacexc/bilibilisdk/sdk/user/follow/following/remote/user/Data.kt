package cn.spacexc.bilibilisdk.sdk.user.follow.following.remote.user

data class Data(
    val attribute: Int,
    val contract_info: ContractInfo,
    val face: String,
    val face_nft: Int,
    val live: Live,
    val mid: Long,
    val nft_icon: String,
    val official_verify: OfficialVerify,
    val rec_reason: String,
    val sign: String,
    val special: Int,
    val tag: Any,
    val track_id: String,
    val uname: String,
    val vip: Vip
)