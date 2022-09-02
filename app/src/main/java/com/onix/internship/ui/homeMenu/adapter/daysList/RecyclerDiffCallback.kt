package com.onix.internship.ui.homeMenu.adapter.daysList

import androidx.recyclerview.widget.DiffUtil
import com.onix.internship.entity.local.WeatherDay

class RecyclerDiffCallback : DiffUtil.ItemCallback<WeatherDay>() {
    override fun areItemsTheSame(oldItem: WeatherDay, newItem: WeatherDay): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: WeatherDay, newItem: WeatherDay): Boolean {
        return oldItem.date == newItem.date
    }
}