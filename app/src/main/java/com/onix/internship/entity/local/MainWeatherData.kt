package com.onix.internship.entity.local

data class MainWeatherData (
    val temp : String,
    val feels_like : String,
    val temp_min : String,
    val temp_max : String,
    val pressure : String,
    val sea_level : Int,
    val grnd_level : Int,
    val humidity : String,
    val temp_kf : Double
)