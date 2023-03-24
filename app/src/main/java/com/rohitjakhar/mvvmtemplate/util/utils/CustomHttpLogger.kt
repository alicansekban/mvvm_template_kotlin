/*
 * Created by Furkan Coşkun on 17.05.2022 16:07
 * Copyright © 2022 Furkan Coşkun. All rights reserved.
 */
package com.rohitjakhar.mvvmtemplate.util.utils

import android.util.Log
import okhttp3.logging.HttpLoggingInterceptor

class CustomHttpLogger : HttpLoggingInterceptor.Logger {
    override fun log(message: String) {
        Log.d("CustomHttpLogger", message)
    }
}