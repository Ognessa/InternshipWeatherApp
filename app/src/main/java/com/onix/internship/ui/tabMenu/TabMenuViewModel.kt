package com.onix.internship.ui.tabMenu

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.onix.internship.arch.BaseViewModel
import com.onix.internship.arch.mapper.onFailure
import com.onix.internship.arch.mapper.onSuccess
import com.onix.internship.data.mappers.ApiDataMapper
import com.onix.internship.retrofit.Network
import kotlinx.coroutines.launch

const val API_KEY = "41b8fc75c71bfb766e8d0f145f3ef7d4"

class TabMenuViewModel(
    private val network: Network,
    private val mapper : ApiDataMapper
) : BaseViewModel(){

    init {
        getCityWeather("Novovolynsk")
    }

    private fun getCityWeather(cityName : String){
        viewModelScope.launch {
            network.searchByCityName(cityName, API_KEY)
                .onSuccess {
                    Log.d("DEBUG", mapper.map(it).toString())
                }
                .onFailure {
                    Log.d("DEBUG", "Fail")
                }
        }
    }
}