package com.onix.internship.entity.apiObjects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiWindData(
    @SerialName("speed") val speed : Double,
    @SerialName("deg") val deg : Int,
    @SerialName("gust") val gust : Double
)
