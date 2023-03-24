/*
 * Created by Furkan Coşkun on 17.05.2022 16:07
 * Copyright © 2022 Furkan Coşkun. All rights reserved.
 */
package com.wing.app.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseHolder<M, DB : ViewDataBinding> constructor(private val viewDataBinding: DB) :
    RecyclerView.ViewHolder(viewDataBinding.root) {

    /**
     * Getter for [M] class
     */
    var item: M? = null

    /**
     * Variable id that goes to layout
     */
    abstract fun bindingVariable(): Int

    /**
     * Set data to layout
     * @param data -> Model object
     */
    fun doBindings(data: M) {
        viewDataBinding.setVariable(bindingVariable(), data)
        viewDataBinding.executePendingBindings()
        this.item = data
    }

    /**
     * Binds holder data
     */
    abstract fun bind()

    /**
     * Getter for Row Class item [M]
     */
    fun getRowItem(): M? {
        return item
    }

    fun getRowBinding(): DB? {
        return viewDataBinding
    }
}