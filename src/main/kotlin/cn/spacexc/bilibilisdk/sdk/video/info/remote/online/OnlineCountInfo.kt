package cn.spacexc.bilibilisdk.sdk.video.info.remote.online

/**
 * Created by XC-Qan on 2023/7/6.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

data class OnlineCountInfo(
    val code: Int,
    val `data`: OnlineInfoData?,
    val message: String,
    val ttl: Int
)

data class OnlineInfoData(
    val abtest: Abtest,
    val count: String,
    val show_switch: ShowSwitch,
    val total: String?
)
data class Abtest(
    val group: String
)

data class ShowSwitch(
    val count: Boolean,
    val total: Boolean
)
