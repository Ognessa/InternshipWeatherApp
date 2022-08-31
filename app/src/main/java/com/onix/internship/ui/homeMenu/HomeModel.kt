package com.onix.internship.ui.homeMenu

import com.onix.internship.entity.local.CityData
import com.onix.internship.entity.local.Data
import com.onix.internship.entity.local.LocationData

data class HomeModel(
    var day: Data = Data(
        "",
        0,
        0,
        listOf(),
        CityData(0, "", LocationData(0.0, 0.0), "", 0, 0, 0, 0)
    )
)