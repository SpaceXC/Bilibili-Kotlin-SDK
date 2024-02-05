package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


import com.google.gson.annotations.SerializedName

data class UserHonourInfo(
    val mid: Long,
    val colour: Any?,
    val tags: List<Any>,
    @SerializedName("is_latest_100honour") val isLatest100honour: Int
)