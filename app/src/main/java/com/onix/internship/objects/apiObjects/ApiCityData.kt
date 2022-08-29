package com.onix.internship.objects.apiObjects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiCityData (
    @SerialName("id") val id : Int,
    @SerialName("name") val name : String,
    @SerialName("coord") val coord : ApiLocationData,
    @SerialName("country") val country : String,
    @SerialName("population") val population : Int,
    @SerialName("timezone") val timezone : Int,
    @SerialName("sunrise") val sunrise : Int,
    @SerialName("sunset") val sunset : Int
)