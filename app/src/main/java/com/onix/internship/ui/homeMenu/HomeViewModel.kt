package com.onix.internship.ui.homeMenu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.onix.internship.arch.BaseViewModel
import com.onix.internship.data.storage.LocationStorage
import com.onix.internship.entity.local.WeatherData
import com.onix.internship.entity.local.WeatherDay
import com.onix.internship.ui.homeMenu.adapter.daysList.DayOnItemClickListener

class HomeViewModel(val storage: LocationStorage, private val homeModel: HomeModel) :
    BaseViewModel(),
    DayOnItemClickListener {

    private val _daysList = MutableLiveData<List<WeatherDay>>()
    val daysList: LiveData<List<WeatherDay>> = _daysList

    private val _weatherDuringDayList = MutableLiveData<List<WeatherData>>()
    val weatherDuringDayList: LiveData<List<WeatherData>> = _weatherDuringDayList

    fun getListOfDay() {
        _daysList.value = homeModel.day.list.sortedBy { it.date }
    }

    override fun showWeatherForTheDay(item: WeatherDay) {
        _daysList.value?.forEach {
            it.isSelected.set(false)
        }
        item.isSelected.set(true)
        _weatherDuringDayList.value = item.hoursList
    }
}