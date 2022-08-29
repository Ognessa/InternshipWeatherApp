package com.onix.internship.objects.local

data class CityData (
    val id : Int,
    val name : String,
    val coord : LocationData,
    val country : String,
    val population : Int,
    val timezone : Int,
    val sunrise : Int,
    val sunset : Int
)