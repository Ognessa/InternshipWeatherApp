package com.onix.internship.entity.local

data class WeatherData(
    val date : String,
    val time : String,
    val main : MainWeatherData,
    val weather : List<WeatherList>,
    val clouds : CloudsData,
    val wind : WindData,
    val visibility : Int,
    val pop : Double,
    val sys : SysData,
    val dt_txt : String
)
