package com.onix.internship.data.mappers

import com.onix.internship.arch.mapper.Mapper
import com.onix.internship.entity.apiObjects.ApiMainWeatherData
import com.onix.internship.entity.local.MainWeatherData

class ApiMainWeatherDataMapper : Mapper<ApiMainWeatherData, MainWeatherData>() {
    override fun map(from: ApiMainWeatherData): MainWeatherData {
        return MainWeatherData(
            temp = (from.temp - 273.15).toInt(),
            feels_like = from.feels_like,
            temp_min = from.temp_min,
            temp_max = from.temp_max,
            pressure = from.pressure,
            sea_level = from.sea_level,
            grnd_level = from.grnd_level,
            humidity = from.humidity,
            temp_kf = from.temp_kf
        )
    }
}