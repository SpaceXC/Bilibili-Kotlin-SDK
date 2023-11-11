package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("Card")
    val card: Card,
    val elec: Any,
    val emergency: Emergency,
    val guide: Any,
    @SerializedName("hot_share")
    val hotShare: HotShare,
    @SerializedName("is_old_user")
    val isOldUser: Boolean,
    @SerializedName("query_tags")
    val queryTags: Any,
    val recommend: Any,
    @SerializedName("Related")
    val related: List<Related>,
    @SerializedName("Reply")
    val reply: Reply,
    @SerializedName("Spec")
    val spec: Any,
    @SerializedName("Tags")
    val tags: List<Tag>,
    @SerializedName("View")
    val view: View,
    @SerializedName("view_addit")
    val viewAddit: Any
)