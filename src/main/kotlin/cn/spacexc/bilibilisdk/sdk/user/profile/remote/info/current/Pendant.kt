package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.current

data class Pendant(
    val expire: Int,
    val image: String?,
    val image_enhance: String?,
    val image_enhance_frame: String?,
    val name: String,
    val pid: Long
)