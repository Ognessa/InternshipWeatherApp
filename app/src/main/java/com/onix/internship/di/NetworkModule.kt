package com.onix.internship.di

import com.onix.internship.retrofit.Network
import com.onix.internship.retrofit.NetworkFactory
import com.onix.internship.retrofit.NetworkService
import org.koin.dsl.module

val networkModule = module {
    single { Network(get()) }
    single { NetworkFactory() }
    single { get<NetworkFactory>().createService(NetworkService::class.java) }
}