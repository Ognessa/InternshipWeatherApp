package com.onix.internship.data.mappers

import com.onix.internship.arch.mapper.Mapper
import com.onix.internship.entity.apiObjects.ApiWeatherData
import com.onix.internship.entity.local.WeatherData

class ApiWeatherDataMapper(
    private val apiMainWeatherDataMapper : ApiMainWeatherDataMapper,
    private val apiWeatherListMapper : ApiWeatherListMapper,
    private val apiCloudsDataMapper : ApiCloudsDataMapper,
    private val apiWindDataMapper : ApiWindDataMapper,
    private val apiSysDataMapper : ApiSysDataMapper
) : Mapper<ApiWeatherData, WeatherData>() {
    override fun map(from: ApiWeatherData): WeatherData {
        return WeatherData(
            dt = from.dt,
            main = apiMainWeatherDataMapper.map(from.main),
            weather = from.weather.map { apiWeatherListMapper.map(it) },
            clouds = apiCloudsDataMapper.map(from.clouds),
            wind = apiWindDataMapper.map(from.wind),
            visibility = from.visibility,
            pop = from.pop,
            sys = apiSysDataMapper.map(from.sys),
            dt_txt = from.dt_txt
        )
    }
}