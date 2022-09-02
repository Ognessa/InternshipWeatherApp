package com.onix.internship.data.mappers

import com.onix.internship.arch.mapper.Mapper
import com.onix.internship.entity.apiObjects.ApiMainWeatherData
import com.onix.internship.entity.local.MainWeatherData

class ApiMainWeatherDataMapper : Mapper<ApiMainWeatherData, MainWeatherData>() {
    override fun map(from: ApiMainWeatherData): MainWeatherData {
        return MainWeatherData(
            temp = convertTemp(from.temp),
            feels_like = convertTemp(from.feels_like),
            temp_min = convertTemp(from.temp_min),
            temp_max = convertTemp(from.temp_max),
            pressure = from.pressure.toString(),
            sea_level = from.sea_level,
            grnd_level = from.grnd_level,
            humidity = from.humidity.toString(),
            temp_kf = from.temp_kf
        )
    }

    private fun convertTemp(temp: Double): String {
        val c = (temp - 273.15).toInt()
        return if (c > 0) {
            "+$c"
        } else {
            c.toString()
        }
    }
}