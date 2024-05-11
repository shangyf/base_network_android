package com.maple.network.response


/**
 * Tip:通用数据类
 * Create by SeVen on 2023/4/1 21:29
 */
data class BaseResponse<out T>(
    val result: T?,
    var code: Int = 200,//服务器状态码 这里0表示请求成功
    val message: String = "",//错误信息
    val success: Boolean
) {

    /**
     * 判定接口返回是否正常
     */
    fun isFailed(): Boolean {
        return code != 200 && code != 201
    }
}
