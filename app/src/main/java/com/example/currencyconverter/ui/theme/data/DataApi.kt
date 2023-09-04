package com.example.currencyconverter.ui.theme.data

import retrofit2.http.GET
import retrofit2.http.Headers

interface DataApi {
    @GET("/scripts/XML_daily.asp/")
    @Headers("Accept: application/xml")
    suspend fun getValues(): List<Currency>
}