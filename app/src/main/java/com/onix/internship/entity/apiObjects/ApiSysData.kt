package com.onix.internship.entity.apiObjects

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiSysData(
    @SerialName("pod") val pod : String
)