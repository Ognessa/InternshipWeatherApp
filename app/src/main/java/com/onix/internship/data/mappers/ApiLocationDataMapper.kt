package com.onix.internship.data.mappers

import com.onix.internship.arch.mapper.Mapper
import com.onix.internship.objects.apiObjects.ApiLocationData
import com.onix.internship.objects.local.LocationData

class ApiLocationDataMapper : Mapper<ApiLocationData, LocationData>() {
    override fun map(from: ApiLocationData): LocationData {
        return LocationData(
            lat = from.lat,
            lon = from.lon
        )
    }
}