package com.dourl.baserecyclerviewadapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView


/**
 * abstract class for structuring the base view holder class
 */
abstract class BaseViewHolder(private val view: View) : RecyclerView.ViewHolder(view),
    View.OnClickListener, View.OnLongClickListener {

    init {
        view.setOnClickListener(this)
        view.setOnLongClickListener(this)
    }

    abstract fun bindData(data: Any)

    fun view(): View {
        return view
    }

    fun context(): Context {
        return view.context
    }
}