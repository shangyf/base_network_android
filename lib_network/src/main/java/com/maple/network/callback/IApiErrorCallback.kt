package com.maple.network.callback

import com.maple.common.toast.TipsToast

/**
 * Tip:接口请求错误回调
 * Create by SeVen on 2023/4/23 19:10
 */
interface IApiErrorCallback {
    /**
     * 错误回调处理
     */
    fun onError(code: Int?, error: String?) {
        TipsToast.showTips(error)
    }

    /**
     * 登录失效处理
     */
    fun onLoginFail(code: Int?, error: String?) {
        TipsToast.showTips(error)
    }
}