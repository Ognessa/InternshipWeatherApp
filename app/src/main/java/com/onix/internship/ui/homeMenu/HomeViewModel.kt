package com.onix.internship.ui.homeMenu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.onix.internship.arch.BaseViewModel
import com.onix.internship.data.storage.LocationStorage
import com.onix.internship.entity.local.WeatherData
import com.onix.internship.ui.homeMenu.adapter.OnItemClickListener

class HomeViewModel(val storage: LocationStorage, private val homeModel: HomeModel) : BaseViewModel(),
    OnItemClickListener {

    private val _daysList = MutableLiveData<List<WeatherData>>()
    val daysList: LiveData<List<WeatherData>> = _daysList

    fun getListOfDay() {
        _daysList.value = homeModel.day.list
    }

    override fun showWeatherForTheDay(item: WeatherData) {

    }
}