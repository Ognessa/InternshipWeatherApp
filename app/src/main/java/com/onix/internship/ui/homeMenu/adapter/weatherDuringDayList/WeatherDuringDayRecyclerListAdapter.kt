package com.onix.internship.ui.homeMenu.adapter.weatherDuringDayList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.onix.internship.R
import com.onix.internship.arch.adapter.BaseRecyclerListAdapter
import com.onix.internship.arch.adapter.BaseViewHolder
import com.onix.internship.databinding.WeatherDuringDayItemBinding
import com.onix.internship.entity.local.WeatherData

class WeatherDuringDayRecyclerListAdapter :
    BaseRecyclerListAdapter<WeatherData>(RecyclerDiffCallback()) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<WeatherData, out ViewDataBinding> {
        return from(parent)
    }

    private fun from(parent: ViewGroup): WeatherDuringDayViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.weather_during_day_item, parent, false)
        val binding = WeatherDuringDayItemBinding.bind(view)
        return WeatherDuringDayViewHolder(binding)
    }
}