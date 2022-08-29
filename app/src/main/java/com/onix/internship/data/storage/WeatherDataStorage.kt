package com.onix.internship.data.storage

import com.onix.internship.entity.TestDataClass

class WeatherDataStorage {
    private val locationList = mutableListOf<TestDataClass>()

    fun getLocationList(): List<TestDataClass> {
        return locationList
    }

    fun setLocationList(daysList: List<TestDataClass>) {
        locationList.addAll(daysList)
    }

    fun clearLocationList() {
        locationList.clear()
    }

    fun deleteLocation(day: TestDataClass) {
        locationList.remove(day)
    }
}