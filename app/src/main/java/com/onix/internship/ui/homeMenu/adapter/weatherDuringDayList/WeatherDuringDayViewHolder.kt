package com.onix.internship.ui.homeMenu.adapter.weatherDuringDayList

import com.onix.internship.arch.adapter.BaseViewHolder
import com.onix.internship.databinding.WeatherDuringDayItemBinding
import com.onix.internship.entity.local.WeatherData

class WeatherDuringDayViewHolder(
    weatherDuringDayItemBinding: WeatherDuringDayItemBinding
) :
    BaseViewHolder<WeatherData, WeatherDuringDayItemBinding>(weatherDuringDayItemBinding) {
    override fun bindView(position: Int) {
        binding.weatherDuringDay = item
    }
}