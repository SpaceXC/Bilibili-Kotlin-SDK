package cn.spacexc.bilibilisdk.sdk.comment.remote.detail


import com.google.gson.annotations.SerializedName

data class Control(
    @SerializedName("input_disable") val inputDisable: Boolean,
    @SerializedName("root_input_text") val rootInputText: String,
    @SerializedName("child_input_text") val childInputText: String,
    @SerializedName("giveup_input_text") val giveupInputText: String,
    @SerializedName("screenshot_icon_state") val screenshotIconState: Int,
    @SerializedName("upload_picture_icon_state") val uploadPictureIconState: Int,
    @SerializedName("answer_guide_text") val answerGuideText: String,
    @SerializedName("answer_guide_icon_url") val answerGuideIconUrl: String,
    @SerializedName("answer_guide_ios_url") val answerGuideIosUrl: String,
    @SerializedName("answer_guide_android_url") val answerGuideAndroidUrl: String,
    @SerializedName("bg_text") val bgText: String,
    @SerializedName("empty_page") val emptyPage: Any?,
    @SerializedName("show_type") val showType: Int,
    @SerializedName("show_text") val showText: String,
    @SerializedName("web_selection") val webSelection: Boolean,
    @SerializedName("disable_jump_emote") val disableJumpEmote: Boolean,
    @SerializedName("enable_charged") val enableCharged: Boolean,
    @SerializedName("enable_cm_biz_helper") val enableCmBizHelper: Boolean,
    @SerializedName("preload_resources") val preloadResources: Any?
)