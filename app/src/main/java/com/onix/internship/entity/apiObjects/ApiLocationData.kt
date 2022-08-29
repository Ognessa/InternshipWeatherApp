package com.onix.internship.entity.apiObjects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiLocationData(
    @SerialName("lat") val lat : Double,
    @SerialName("lon") val lon : Double
)