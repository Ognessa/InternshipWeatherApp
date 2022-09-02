package com.onix.internship.ui.citiesMenu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.onix.internship.arch.BaseViewModel
import com.onix.internship.data.storage.LocationStorage
import com.onix.internship.entity.local.Data
import com.onix.internship.ui.citiesMenu.adapter.OnItemClickListener
import com.onix.internship.ui.homeMenu.HomeModel
import com.onix.internship.ui.tabMenu.TabModel

class CitiesViewModel(
    val storage: LocationStorage,
    private val tabModel: TabModel,
    private val homeModel: HomeModel
) : BaseViewModel(), OnItemClickListener {

    private val _locationList = MutableLiveData<List<Data>>()
    val locationList: LiveData<List<Data>> = _locationList

    private val _navigateToPrevious = MutableLiveData<Unit>()
    val navigateToPrevious: LiveData<Unit> = _navigateToPrevious

    fun addLocationToRecycler() {
        _locationList.value = storage.getLocationList()
    }

    fun navigateToAddLocationFragment() {
        tabModel.location.set("")
        tabModel.goToAddFragment.value = Unit
    }

    override fun setNewCityToTrack(item: Data) {
        homeModel.day = item
        changeCurrentItemSelection(item)
        _navigateToPrevious.value = Unit
    }

    private fun changeCurrentItemSelection(item: Data) {
        _locationList.value?.forEach {
            if (item.city.id == it.city.id) {
                storage.addLocation(it.copy(isChoice = true))
            } else {
                storage.addLocation(it.copy(isChoice = false))
            }
        }
    }
}