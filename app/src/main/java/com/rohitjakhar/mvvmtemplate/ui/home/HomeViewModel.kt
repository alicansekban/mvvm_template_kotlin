package com.rohitjakhar.mvvmtemplate.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.murgupluoglu.request.RESPONSE
import com.murgupluoglu.request.request
import com.rohitjakhar.mvvmtemplate.data.remote.webservice.WebService
import com.rohitjakhar.mvvmtemplate.util.SingleLiveEvent
import com.wing.app.base.BasePagingResponse
import com.wing.app.base.BaseResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
   private val webService: WebService

) : ViewModel() {
    val dataResponse: SingleLiveEvent<RESPONSE<BaseResponse<Any>>> =
        SingleLiveEvent()
    fun getData() {
        dataResponse.request({webService.getData()})
    }
}
