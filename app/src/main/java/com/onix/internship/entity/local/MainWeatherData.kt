package com.onix.internship.entity.local

data class MainWeatherData (
    val temp : Int,
    val feels_like : Double,
    val temp_min : String,
    val temp_max : String,
    val pressure : Int,
    val sea_level : Int,
    val grnd_level : Int,
    val humidity : Int,
    val temp_kf : Double
)