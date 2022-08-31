package com.onix.internship.ui.citiesMenu.adapter

import com.onix.internship.entity.local.Data

interface OnItemClickListener {
    fun setNewCityToTrack(item: Data)
}