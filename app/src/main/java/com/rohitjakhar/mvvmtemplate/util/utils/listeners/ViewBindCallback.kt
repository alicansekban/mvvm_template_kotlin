package com.wing.app.utils.listeners

interface ViewBindCallback<Model> {
    fun itemBind(item: Model?, position: Int)
}