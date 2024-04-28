package cn.spacexc.bilibilisdk.sdk.comment.remote.detail.item


import com.google.gson.annotations.SerializedName

data class Label(
    val path: String,
    val text: String,
    @SerializedName("label_theme") val labelTheme: String,
    @SerializedName("text_color") val textColor: String,
    @SerializedName("bg_style") val bgStyle: Int,
    @SerializedName("bg_color") val bgColor: String,
    @SerializedName("border_color") val borderColor: String,
    @SerializedName("use_img_label") val useImgLabel: Boolean,
    @SerializedName("img_label_uri_hans") val imgLabelUriHans: String,
    @SerializedName("img_label_uri_hant") val imgLabelUriHant: String,
    @SerializedName("img_label_uri_hans_static") val imgLabelUriHansStatic: String,
    @SerializedName("img_label_uri_hant_static") val imgLabelUriHantStatic: String
)