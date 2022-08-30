package com.onix.internship.ui.addCity

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.onix.internship.arch.BaseViewModel
import com.onix.internship.arch.mapper.onFailure
import com.onix.internship.arch.mapper.onSuccess
import com.onix.internship.data.mappers.ApiDataMapper
import com.onix.internship.data.storage.LocationStorage
import com.onix.internship.retrofit.Network
import com.onix.internship.ui.homeMenu.HomeModel
import com.onix.internship.ui.tabMenu.TabModel
import kotlinx.coroutines.launch

class AddCityViewModel(
    private val network: Network,
    private val mapper: ApiDataMapper,
    private val homeModel: HomeModel,
    val model: TabModel,
    private val storage: LocationStorage
) : BaseViewModel() {

    private val _goBack = MutableLiveData<Unit>()
    val goBack: LiveData<Unit> = _goBack

    fun backToCityList() {
        getCityWeather(model.location.get() ?: "New York")
    }

    private fun getCityWeather(cityName: String) {
        viewModelScope.launch {
            network.searchByCityName(cityName, API_KEY)
                .onSuccess {
                    storage.addLocation(mapper.map(it))
                    _goBack.postValue(Unit)
                }
                .onFailure {
                    Log.d("DEBUG2", "Fail")
                }
            setCurrentDay()
        }
    }

    private fun setCurrentDay() {
        val city = storage.getLocationList()
        homeModel.city.set(city.first().city.name +", "+city.first().city.country)
        homeModel.temp.set(city.first().list[0].main.temp.toString())
        homeModel.hum.set(city.first().list[0].main.humidity.toString())
        homeModel.windSpeed.set(city.first().list[0].wind.speed.toString())
    }

    companion object {
        const val API_KEY = "41b8fc75c71bfb766e8d0f145f3ef7d4"
    }
}