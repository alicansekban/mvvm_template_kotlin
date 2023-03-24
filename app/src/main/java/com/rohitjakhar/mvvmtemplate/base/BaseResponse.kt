/*
 * Created by Furkan Coşkun on 18.05.2022 16:07
 * Copyright © 2022 Furkan Coşkun. All rights reserved.
 */
package com.wing.app.base

data class BaseResponse<T>(
    val success: Boolean,
    val message: String,
    val error: Error,
    val entity: T,
)

data class Error(val code: Int, val debugMessage: String, val message: String)