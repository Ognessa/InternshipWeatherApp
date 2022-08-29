package com.onix.internship.data.mappers

import com.onix.internship.arch.mapper.Mapper
import com.onix.internship.objects.apiObjects.ApiData
import com.onix.internship.objects.local.Data

class ApiDataMapper(
    private val apiWeatherDataMapper : ApiWeatherDataMapper,
    private val apiCityDataMapper : ApiCityDataMapper
    ) : Mapper<ApiData, Data>() {
    override fun map(from: ApiData): Data {
        return Data(
            cod = from.cod,
            message = from.message,
            cnt = from.cnt,
            list = from.list.map { apiWeatherDataMapper.map(it) },
            city = apiCityDataMapper.map(from.city)
        )
    }
}