package com.onix.internship.data.mappers

import com.onix.internship.arch.mapper.Mapper
import com.onix.internship.objects.apiObjects.ApiCloudsData
import com.onix.internship.objects.local.CloudsData

class ApiCloudsDataMapper : Mapper<ApiCloudsData, CloudsData>() {
    override fun map(from: ApiCloudsData): CloudsData {
        return CloudsData(
            all = from.all
        )
    }
}