package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.app


import com.google.gson.annotations.SerializedName

data class Arc(
    val aid: Long,
    val author: Author,
    val copyright: Int,
    val ctime: Int,
    val desc: String,
    @SerializedName("desc_v2")
    val descV2: Any,
    val dimension: DimensionX,
    val duration: Int,
    val `dynamic`: String,
    @SerializedName("enable_vt")
    val enableVt: Int,
    @SerializedName("is_blooper")
    val isBlooper: Boolean,
    @SerializedName("is_chargeable_season")
    val isChargeableSeason: Boolean,
    val pic: String,
    val pubdate: Int,
    val rights: RightsX,
    val stat: Stat,
    val state: Int,
    val title: String,
    @SerializedName("type_id")
    val typeid: Long,
    @SerializedName("type_name")
    val typeName: String,
    val videos: Int,
    @SerializedName("vt_display")
    val vtDisplay: String
)