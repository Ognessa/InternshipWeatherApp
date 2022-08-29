package com.onix.internship.di

import com.onix.internship.data.storage.LocationStorage
import com.onix.internship.ui.homeMenu.HomeModel
import com.onix.internship.ui.tabMenu.TabModel
import org.koin.dsl.module

val repositoryModule = module {
    single { LocationStorage() }
    single { TabModel() }
    single { HomeModel() }
}