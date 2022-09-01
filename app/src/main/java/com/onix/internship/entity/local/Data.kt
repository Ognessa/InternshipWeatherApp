package com.onix.internship.entity.local

data class Data(
    val cod: String,
    val message: Int,
    val cnt: Int,
    val list: List<WeatherDay>,
    val city: CityData,
    val isChoice: Boolean = false
)