package com.onix.internship.ui.homeMenu.adapter

import com.onix.internship.arch.adapter.BaseViewHolder
import com.onix.internship.databinding.DayItemBinding
import com.onix.internship.entity.local.WeatherData

class ViewHolder(
    dayItemBinding: DayItemBinding,
    private val onItemClickListener: OnItemClickListener
) :
    BaseViewHolder<WeatherData, DayItemBinding>(dayItemBinding) {
    override fun bindView(position: Int) {
        binding.dayItem = item
        binding.mainItemContainer.setOnClickListener {
            onItemClickListener.showWeatherForTheDay(item)
        }
    }
}