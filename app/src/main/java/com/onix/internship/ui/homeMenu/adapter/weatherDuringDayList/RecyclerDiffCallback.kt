package com.onix.internship.ui.homeMenu.adapter.weatherDuringDayList

import androidx.recyclerview.widget.DiffUtil
import com.onix.internship.entity.local.WeatherData

class RecyclerDiffCallback : DiffUtil.ItemCallback<WeatherData>() {
    override fun areItemsTheSame(oldItem: WeatherData, newItem: WeatherData): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: WeatherData, newItem: WeatherData): Boolean {
        return oldItem.date == newItem.date
    }
}