package com.dourl.baserecyclerviewadapterdemo.viewholder

import android.view.View
import com.dourl.baserecyclerviewadapter.BaseViewHolder
import com.dourl.baserecyclerviewadapterdemo.model.SampleItem
import kotlinx.android.synthetic.main.item_sample.view.*
import org.jetbrains.anko.image

class SampleViewHolder(
    private val view: View,
    private val delegate: Delegate
) : BaseViewHolder(view) {

    lateinit var sampleItem: SampleItem

    interface Delegate {
        fun onItemClick(item: SampleItem)
    }

    override fun bindData(data: Any) {
        if (data is SampleItem) {
            sampleItem = data
            drawItem()
        }
    }

    private fun drawItem() {
        itemView.run {
            sample0_avatar.image = sampleItem.image
            sample0_name.text = sampleItem.name
            sample0_content.text = sampleItem.content
        }
    }

    override fun onClick(v: View?) {
        delegate.onItemClick(this.sampleItem)
    }

    override fun onLongClick(v: View?): Boolean = false
}