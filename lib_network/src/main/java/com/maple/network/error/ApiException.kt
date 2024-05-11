package com.maple.network.error

import java.io.IOException

/**
 * Tip:服务器非200状态，对应的异常
 * Create by SeVen on 2023/4/23 20:10
 */
open class ApiException : Exception {
    var errCode: Int
    var errMsg: String

    constructor(error: ERROR, e: Throwable? = null) : super(e) {
        errCode = error.code
        errMsg = error.errMsg
    }

    constructor(code: Int, msg: String, e: Throwable? = null) : super(e) {
        this.errCode = code
        this.errMsg = msg
    }
}

/**
 * 无网络连接异常
 */
class NoNetWorkException(error: ERROR, e: Throwable? = null) : IOException(e) {
    private var errCode: Int
    private var errMsg: String

    init {
        errCode = error.code
        errMsg = error.errMsg
    }
}
