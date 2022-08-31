package com.onix.internship.retrofit

import androidx.annotation.StringRes
import com.onix.internship.R

enum class NetworkExceptions(@StringRes val errorTextId : Int) {
    NO_INTERNET_CONNECTION(R.string.no_internet_connection),
    REQUEST_ERROR(R.string.request_error),
    UNKNOWN_HOST(R.string.unknown_host),
    UNKNOWN_ERROR(R.string.unknown_error);

    fun getValue(): Int {
        return errorTextId
    }
}