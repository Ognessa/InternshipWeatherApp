package com.onix.internship.ui.homeMenu

import androidx.databinding.ObservableField

data class HomeModel(
    val city: ObservableField<String> = ObservableField(),
    val temp: ObservableField<String> = ObservableField(),
    val hum: ObservableField<String> = ObservableField(),
    val windSpeed: ObservableField<String> = ObservableField()
)