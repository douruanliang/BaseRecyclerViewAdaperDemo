package com.dourl.baserecyclerviewadapterdemo.adapter

import android.view.View
import com.dourl.baserecyclerviewadapter.BaseAdapter
import com.dourl.baserecyclerviewadapter.BaseViewHolder
import com.dourl.baserecyclerviewadapter.SectionRow
import com.dourl.baserecyclerviewadapterdemo.R
import com.dourl.baserecyclerviewadapterdemo.model.SampleItem
import com.dourl.baserecyclerviewadapterdemo.viewholder.SampleViewHolder

class SampleAdapter(private val delegate: SampleViewHolder.Delegate) : BaseAdapter() {

    private val section_item = 0

    init {
        addSection(ArrayList<SampleItem>())
    }

    fun addItems(sampleItems: List<SampleItem>) {
        addItemListOnSection(section_item, sampleItems)
        notifyDataSetChanged()
    }

    override fun layout(sectionRow: SectionRow): Int {
        return R.layout.item_sample
    }

    override fun viewHolder(viewType: Int, view: View): BaseViewHolder {
        return SampleViewHolder(view, delegate)
    }



}