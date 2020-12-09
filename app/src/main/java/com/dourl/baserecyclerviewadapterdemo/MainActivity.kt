package com.dourl.baserecyclerviewadapterdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.dourl.baserecyclerviewadapterdemo.adapter.SampleAdapter
import com.dourl.baserecyclerviewadapterdemo.model.SampleItem
import com.dourl.baserecyclerviewadapterdemo.viewholder.SampleViewHolder
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity(),SampleViewHolder.Delegate {

    val adapter by lazy { SampleAdapter(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sample0_recyclerView.adapter = adapter
        sample0_recyclerView.layoutManager = LinearLayoutManager(this)

        mockItems()
    }

    private fun mockItems() {
        adapter.addItems(MockSamples.mockSampleItems(this, 15))
    }

    override fun onItemClick(item: SampleItem) {
        toast(item.name)
    }
}