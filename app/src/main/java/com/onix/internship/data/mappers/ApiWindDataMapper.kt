package com.onix.internship.data.mappers

import com.onix.internship.arch.mapper.Mapper
import com.onix.internship.entity.apiObjects.ApiWindData
import com.onix.internship.entity.local.WindData

class ApiWindDataMapper : Mapper<ApiWindData, WindData>() {
    override fun map(from: ApiWindData): WindData {
        return WindData(
            speed = from.speed.toString(),
            deg = from.deg,
            gust = from.gust
        )
    }
}