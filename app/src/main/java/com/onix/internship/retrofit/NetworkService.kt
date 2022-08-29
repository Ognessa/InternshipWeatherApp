package com.onix.internship.retrofit

import com.onix.internship.entity.apiObjects.ApiData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {
    @GET("/data/2.5/forecast?")
    suspend fun getById(@Query("id") id : Int, @Query("appid") apiKey : String) : Response<ApiData>

    @GET("/data/2.5/forecast?")
    suspend fun getByCityName(@Query("q") city : String, @Query("appid") apiKey : String) : Response<ApiData>
}