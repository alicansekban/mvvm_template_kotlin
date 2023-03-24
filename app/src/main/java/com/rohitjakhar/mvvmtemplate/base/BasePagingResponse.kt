/*
 * Created by Furkan Coşkun on 17.05.2022 16:07
 * Copyright © 2022 Furkan Coşkun. All rights reserved.
 */
package com.wing.app.base

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class BasePagingResponse<T>(
    @Json(name = "items") val items: List<T> = arrayListOf()
)