package com.onix.internship.entity.local

import androidx.databinding.ObservableBoolean

class WeatherDay(
    val date : String,
    val hoursList : List<WeatherData>,
    val isSelected: ObservableBoolean = ObservableBoolean(false)
)