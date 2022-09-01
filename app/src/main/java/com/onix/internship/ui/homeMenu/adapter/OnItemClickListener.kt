package com.onix.internship.ui.homeMenu.adapter

import com.onix.internship.entity.local.WeatherData

interface OnItemClickListener {
    fun showWeatherForTheDay(item: WeatherData)
}