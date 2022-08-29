package com.onix.internship.data.storage

import com.onix.internship.entity.local.Data

class LocationStorage {
    private val locationList = mutableMapOf<Int, Data>()

    fun getLocationList(): List<Data>{
        return locationList.values.toList()
    }

    fun addLocation(city: Data) {
        locationList[city.city.id] = city
    }

    fun deleteLocation(city: Data) {
        locationList.remove(city.city.id)
    }
}