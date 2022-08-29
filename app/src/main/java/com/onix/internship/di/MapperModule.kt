package com.onix.internship.di

import com.onix.internship.data.mappers.*
import org.koin.dsl.module

val mapperModule = module {
    single { ApiCityDataMapper(get()) }
    single { ApiCloudsDataMapper() }
    single { ApiDataMapper(get(), get()) }
    single { ApiLocationDataMapper() }
    single { ApiMainWeatherDataMapper() }
    single { ApiSysDataMapper() }
    single { ApiWeatherDataMapper(get(), get(), get(), get(), get()) }
    single { ApiWeatherListMapper() }
    single { ApiWindDataMapper() }
}