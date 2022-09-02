package com.onix.internship.ui.homeMenu.adapter.daysList

import com.onix.internship.entity.local.WeatherDay

interface DayOnItemClickListener {
    fun showWeatherForTheDay(item: WeatherDay)
}