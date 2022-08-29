package com.onix.internship.objects.local

data class WeatherData(
    val dt : Int,
    val main : MainWeatherData,
    val weather : List<WeatherList>,
    val clouds : CloudsData,
    val wind : WindData,
    val visibility : Int,
    val pop : Double,
    val sys : SysData,
    val dt_txt : String
)
