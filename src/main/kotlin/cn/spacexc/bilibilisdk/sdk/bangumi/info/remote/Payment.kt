package cn.spacexc.bilibilisdk.sdk.bangumi.info.remote

data class Payment(
    val discount: Int,
    val pay_type: PayType,
    val price: String,
    val promotion: String,
    val tip: String,
    val view_start_time: Int,
    val vip_discount: Int,
    val vip_first_promotion: String,
    val vip_price: String,
    val vip_promotion: String
)