package com.onix.internship.entity.local

data class MainWeatherData (
    val temp : Int,
    val feels_like : Double,
    val temp_min : Double,
    val temp_max : Double,
    val pressure : Int,
    val sea_level : Int,
    val grnd_level : Int,
    val humidity : Int,
    val temp_kf : Double
)