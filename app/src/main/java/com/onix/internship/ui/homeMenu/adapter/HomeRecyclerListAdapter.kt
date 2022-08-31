package com.onix.internship.ui.homeMenu.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.onix.internship.R
import com.onix.internship.arch.adapter.BaseRecyclerListAdapter
import com.onix.internship.arch.adapter.BaseViewHolder
import com.onix.internship.databinding.DayItemBinding
import com.onix.internship.entity.local.WeatherData

class HomeRecyclerListAdapter(private val onItemClickListener: OnItemClickListener) :
    BaseRecyclerListAdapter<WeatherData>(RecyclerDiffCallback()) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<WeatherData, out ViewDataBinding> {
        return from(parent, onItemClickListener)
    }

    private fun from(parent: ViewGroup, onItemClickListener: OnItemClickListener): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.day_item, parent, false)
        val binding = DayItemBinding.bind(view)
        return ViewHolder(binding, onItemClickListener)
    }
}