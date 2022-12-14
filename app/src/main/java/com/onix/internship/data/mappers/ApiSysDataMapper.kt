package com.onix.internship.data.mappers

import com.onix.internship.arch.mapper.Mapper
import com.onix.internship.entity.apiObjects.ApiSysData
import com.onix.internship.entity.local.SysData

class ApiSysDataMapper : Mapper<ApiSysData, SysData>() {
    override fun map(from: ApiSysData): SysData {
        return SysData(
            pod = from.pod
        )
    }
}