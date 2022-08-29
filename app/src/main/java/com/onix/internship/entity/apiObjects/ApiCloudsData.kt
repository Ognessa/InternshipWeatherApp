package com.onix.internship.entity.apiObjects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiCloudsData(
    @SerialName("all") val all : Int
)