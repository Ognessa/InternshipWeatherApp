package com.onix.internship.data.mappers

import com.onix.internship.arch.mapper.Mapper
import com.onix.internship.entity.apiObjects.ApiWeatherList
import com.onix.internship.entity.local.WeatherList

class ApiWeatherListMapper : Mapper<ApiWeatherList, WeatherList>() {
    override fun map(from: ApiWeatherList): WeatherList {
        return WeatherList(
            id = from.id,
            main = from.main,
            description = from.description,
            icon = "http://openweathermap.org/img/wn/${from.icon}@2x.png"
        )
    }
}