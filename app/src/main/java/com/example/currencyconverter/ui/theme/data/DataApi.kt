package com.example.currencyconverter.ui.theme.data

import retrofit2.http.GET
import retrofit2.http.Headers

interface DataApi {
    @GET("/all/")
    @Headers("Accept: application/json")
    suspend fun getValues(): List<DataResponse>
}