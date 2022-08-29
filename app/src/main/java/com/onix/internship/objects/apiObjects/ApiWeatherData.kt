package com.onix.internship.objects.apiObjects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import okhttp3.internal.ignoreIoExceptions

@Serializable
data class ApiWeatherData(
    @SerialName("dt") val dt : Int,
    @SerialName("main") val main : ApiMainWeatherData,
    @SerialName("weather") val weather : List<ApiWeatherList>,
    @SerialName("clouds") val clouds : ApiCloudsData,
    @SerialName("wind") val wind : ApiWindData,
    @SerialName("visibility") val visibility : Int,
    @SerialName("pop") val pop : Double,
    @SerialName("sys") val sys : ApiSysData,
    @SerialName("dt_txt") val dt_txt : String
)
