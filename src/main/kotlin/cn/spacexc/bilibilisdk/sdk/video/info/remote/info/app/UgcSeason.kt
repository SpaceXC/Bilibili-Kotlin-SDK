package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.app


import com.google.gson.annotations.SerializedName

data class UgcSeason(
    val attribute: Int,
    val cover: String,
    @SerializedName("enable_vt")
    val enableVt: Int,
    @SerializedName("ep_count")
    val epCount: Int,
    val id: Long,
    val intro: String,
    @SerializedName("is_pay_season")
    val isPaySeason: Boolean,
    val mid: Long,
    @SerializedName("season_type")
    val seasonType: Int,
    val sections: List<Section>,
    @SerializedName("sign_state")
    val signState: Int,
    val stat: StatXX,
    val title: String
)