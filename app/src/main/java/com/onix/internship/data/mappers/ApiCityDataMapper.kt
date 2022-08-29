package com.onix.internship.data.mappers

import com.onix.internship.arch.mapper.Mapper
import com.onix.internship.objects.apiObjects.ApiCityData
import com.onix.internship.objects.local.CityData

class ApiCityDataMapper(
    private val apiLocationDataMapper : ApiLocationDataMapper
) : Mapper<ApiCityData, CityData>() {
    override fun map(from: ApiCityData): CityData {
        return CityData(
            id = from.id,
            name = from.name,
            coord = apiLocationDataMapper.map(from.coord),
            country = from.country,
            population = from.population,
            timezone = from.timezone,
            sunrise = from.sunrise,
            sunset = from.sunset
        )
    }

}