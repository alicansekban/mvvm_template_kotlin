package com.rohitjakhar.mvvmtemplate.data.remote.webservice

import com.rohitjakhar.mvvmtemplate.data.remote.dto.GetDataDto
import com.wing.app.base.BaseResponse
import retrofit2.Response
import retrofit2.http.GET

interface WebService {
    @GET("endpoint")
    suspend fun getData(): BaseResponse<Any>
}
