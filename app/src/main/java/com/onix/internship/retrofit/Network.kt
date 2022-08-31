package com.onix.internship.retrofit

import com.onix.internship.arch.mapper.Either
import com.onix.internship.entity.apiObjects.ApiData
import retrofit2.Response
import java.net.UnknownHostException

class Network(
    private val networkService: NetworkService
) {

    suspend fun searchByCityName(city: String, apiKey: String): Either<NetworkExceptions, ApiData> {
        return call { networkService.getByCityName(city, apiKey) }
    }

    suspend fun searchById(id: Int, apiKey: String): Either<NetworkExceptions, ApiData> {
        return call { networkService.getById(id, apiKey) }
    }

    private suspend inline fun <T : Any> call(
        crossinline call: suspend () -> Response<T>
    ): Either<NetworkExceptions, T> {
        return try {
            val response = call.invoke()
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) {
                    Either.Right(body)
                } else {
                    Either.Left(NetworkExceptions.REQUEST_ERROR)
                }
            } else {
                Either.Left(NetworkExceptions.REQUEST_ERROR)
            }

        } catch (e: Throwable) {
            e.printStackTrace()
            println(e.message)
            Either.Left(handleException(e))
        }
    }

    fun handleException(e : Throwable) : NetworkExceptions{
        return when(e){
            is UnknownHostException -> NetworkExceptions.UNKNOWN_HOST
            else -> NetworkExceptions.UNKNOWN_ERROR
        }
    }

}