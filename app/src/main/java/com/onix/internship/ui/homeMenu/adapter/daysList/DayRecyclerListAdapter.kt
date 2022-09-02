package com.onix.internship.ui.homeMenu.adapter.daysList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.onix.internship.R
import com.onix.internship.arch.adapter.BaseRecyclerListAdapter
import com.onix.internship.arch.adapter.BaseViewHolder
import com.onix.internship.databinding.DayItemBinding
import com.onix.internship.entity.local.WeatherDay

class DayRecyclerListAdapter(private val dayOnItemClickListener: DayOnItemClickListener) :
    BaseRecyclerListAdapter<WeatherDay>(RecyclerDiffCallback()) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<WeatherDay, out ViewDataBinding> {
        return from(parent, dayOnItemClickListener)
    }

    private fun from(parent: ViewGroup, dayOnItemClickListener: DayOnItemClickListener): DayViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.day_item, parent, false)
        val binding = DayItemBinding.bind(view)
        return DayViewHolder(binding, dayOnItemClickListener)
    }
}