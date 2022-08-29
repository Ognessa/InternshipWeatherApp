package com.onix.internship.ui.citiesMenu.adapter

import com.onix.internship.entity.TestDataClass

interface OnBirdClickListener {
    fun playPauseMusic(it: TestDataClass)

    fun showDetails(it: TestDataClass)
}