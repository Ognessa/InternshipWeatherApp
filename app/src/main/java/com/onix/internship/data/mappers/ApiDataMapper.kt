package com.onix.internship.data.mappers

import android.util.Log
import com.onix.internship.arch.mapper.Mapper
import com.onix.internship.entity.apiObjects.ApiData
import com.onix.internship.entity.apiObjects.ApiWeatherData
import com.onix.internship.entity.local.Data
import com.onix.internship.entity.local.WeatherData

class ApiDataMapper(
    private val apiWeatherDataMapper: ApiWeatherDataMapper,
    private val apiCityDataMapper: ApiCityDataMapper
) : Mapper<ApiData, Data>() {
    override fun map(from: ApiData): Data {
        return Data(
            cod = from.cod,
            message = from.message,
            cnt = from.cnt,
            list = createMapOfDates(from.list),
            city = apiCityDataMapper.map(from.city)
        )
    }

    private fun createMapOfDates(list: List<ApiWeatherData>): HashMap<String, List<WeatherData>> {
        val weatherDataList = list.map { apiWeatherDataMapper.map(it) }
        val dataMap = hashMapOf<String, List<WeatherData>>()

        weatherDataList.forEach {
            Log.d("DEBUG", it.toString())
            val tempList = mutableListOf<WeatherData>()
            dataMap[it.date]?.let { it1 -> tempList.addAll(it1) }
            tempList.add(it)
            dataMap[it.date] = tempList
        }
        Log.d("DEBUG", dataMap.toString())

        return dataMap
    }
}