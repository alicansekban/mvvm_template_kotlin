/*
 * Created by Furkan Coşkun on 17.05.2022 16:07
 * Copyright © 2022 Furkan Coşkun. All rights reserved.
 */
package com.wing.app.base

class BaseListener {
    interface PagingAdapterListener {
        fun itemClicked(inboxItem: Nothing)

        fun itemLongClicked(inboxItem: Nothing)
    }
}