package cn.spacexc.bilibilisdk.sdk.user.profile.remote.video


import com.google.gson.annotations.SerializedName

data class Data(
    val list: List,
    val page: Page,
    @SerializedName("episodic_button") val episodicButton: EpisodicButton,
    @SerializedName("is_risk") val isRisk: Boolean,
    @SerializedName("gaia_res_type") val gaiaResType: Int,
    @SerializedName("gaia_data") val gaiaData: Any?
)