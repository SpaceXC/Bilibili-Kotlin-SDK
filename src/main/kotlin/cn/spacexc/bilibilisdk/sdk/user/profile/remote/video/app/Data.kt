package cn.spacexc.bilibilisdk.sdk.user.profile.remote.video.app


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("episodic_button") val episodicButton: EpisodicButton,
    val order: List<Order>,
    val count: Int,
    val item: List<Item>
)