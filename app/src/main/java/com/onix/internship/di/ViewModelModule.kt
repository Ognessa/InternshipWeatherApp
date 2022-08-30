package com.onix.internship.di

import com.onix.internship.ui.addCity.AddCityViewModel
import com.onix.internship.ui.citiesMenu.CitiesViewModel
import com.onix.internship.ui.cityMoreInfo.CityInfoViewModel
import com.onix.internship.ui.homeMenu.HomeViewModel
import com.onix.internship.ui.main.MainViewModel
import com.onix.internship.ui.settingsMenu.SettingsViewModel
import com.onix.internship.ui.tabMenu.TabMenuViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { TabMenuViewModel(get()) }
    viewModel { AddCityViewModel(get(), get(), get(), get(), get()) }
    viewModel { CityInfoViewModel() }

    viewModel { CitiesViewModel(get(), get()) }
    viewModel { HomeViewModel(get(), get()) }
    viewModel { SettingsViewModel() }

    viewModel { MainViewModel() }
}