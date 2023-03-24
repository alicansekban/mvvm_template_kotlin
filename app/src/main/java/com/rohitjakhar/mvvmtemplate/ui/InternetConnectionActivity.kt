/*
 * Created by Furkan Coşkun on 17.05.2022 16:07
 * Copyright © 2022 Furkan Coşkun. All rights reserved.
 */
package com.rohitjakhar.mvvmtemplate.ui

import android.os.Bundle
import com.blankj.utilcode.util.SPUtils
import com.rohitjakhar.mvvmtemplate.R
import com.rohitjakhar.mvvmtemplate.databinding.ActivityInternetConnectionBinding
import com.rohitjakhar.mvvmtemplate.base.BaseActivity
import com.rohitjakhar.mvvmtemplate.util.utils.SPPARAM

class InternetConnectionActivity : BaseActivity<ActivityInternetConnectionBinding>() {

    override fun getLayoutId(): Int = R.layout.activity_internet_connection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internet_connection)
        isCheckInternetActive = false
        SPUtils.getInstance().put(SPPARAM.NETWORK_CONNECTION, true)
    }

    override fun onBackPressed() {
    }

}