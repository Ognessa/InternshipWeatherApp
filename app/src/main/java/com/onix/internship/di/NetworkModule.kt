package com.onix.internship.di

import com.onix.internship.retrofit.*
import org.koin.dsl.module

val networkModule = module {
    single { Network(get()) }
    single { NetworkFactory(get()) }
    single { NetworkInterceptor() }
    single { get<NetworkFactory>().createService(NetworkService::class.java) }
}