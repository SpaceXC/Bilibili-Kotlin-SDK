package cn.spacexc.bilibilisdk.sdk.comment.remote.detail


import com.google.gson.annotations.SerializedName

data class Config(
    val showtopic: Int,
    @SerializedName("show_up_flag") val showUpFlag: Boolean,
    @SerializedName("read_only") val readOnly: Boolean
)