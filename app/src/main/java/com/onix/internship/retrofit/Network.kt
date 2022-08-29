package com.onix.internship.retrofit

import com.onix.internship.arch.mapper.Either
import com.onix.internship.objects.apiObjects.ApiData

class Network(private val networkService: NetworkService) {

    suspend fun searchByCityName(city : String, apiKey : String): Either<ApiData> {
        return try {
            val response = networkService.getByCityName(city, apiKey)
            val body = response.body()

            if (!response.isSuccessful || body == null) {
                Either.failure(Throwable("Request error"))
            } else {
                Either.success(body)
            }
        } catch (e: Error) {
            Either.failure(e)
        }
    }

    suspend fun searchById( id : Int, apiKey : String): Either<ApiData> {
        return try {
            val response = networkService.getById(id, apiKey)
            val body = response.body()

            if (!response.isSuccessful || body == null) {
                Either.failure(Throwable("Request error"))
            } else {
                Either.success(body)
            }
        } catch (e: Error) {
            Either.failure(e)
        }
    }

}