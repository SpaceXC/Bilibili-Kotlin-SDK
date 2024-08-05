package cn.spacexc.bilibilisdk.sdk.user.profile.remote.list

data class UserCard(
    val face: String,
    val face_nft: Int,
    val face_nft_new: Int,
    val mid: String,
    val name: String,
    val name_render: Any,
    val nameplate: Nameplate?,
    val official: Official,
    val pendant: Pendant?,
    val vip: Vip?
)