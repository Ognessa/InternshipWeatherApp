package com.onix.internship.ui.citiesMenu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.onix.internship.arch.BaseViewModel
import com.onix.internship.data.storage.LocationStorage
import com.onix.internship.entity.local.Data
import com.onix.internship.ui.tabMenu.TabModel

class CitiesViewModel(
    private val storage: LocationStorage,
    private val model: TabModel
) : BaseViewModel() {

    private val _locationList = MutableLiveData<List<Data>>()
    val locationList: LiveData<List<Data>> = _locationList

    fun setLocation() {
        _locationList.value = storage.getLocationList()
    }

    fun goToAddLocationFragment() {
        model.goToAddFragment.value = Unit
    }
}