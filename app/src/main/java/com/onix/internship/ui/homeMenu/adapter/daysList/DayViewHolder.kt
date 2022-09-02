package com.onix.internship.ui.homeMenu.adapter.daysList

import com.onix.internship.arch.adapter.BaseViewHolder
import com.onix.internship.databinding.DayItemBinding
import com.onix.internship.entity.local.WeatherDay

class DayViewHolder(
    dayItemBinding: DayItemBinding,
    private val dayOnItemClickListener: DayOnItemClickListener
) :
    BaseViewHolder<WeatherDay, DayItemBinding>(dayItemBinding) {
    override fun bindView(position: Int) {
        binding.dayItem = item
        binding.mainItemContainer.setOnClickListener {
            dayOnItemClickListener.showWeatherForTheDay(item)
        }
    }
}