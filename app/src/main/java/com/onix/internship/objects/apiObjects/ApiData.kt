package com.onix.internship.objects.apiObjects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiData(
    @SerialName("cod") val cod : String,
    @SerialName("message") val message : Int,
    @SerialName("cnt") val cnt : Int,
    @SerialName("list") val list : List<ApiWeatherData>,
    @SerialName("city") val city : ApiCityData,
)