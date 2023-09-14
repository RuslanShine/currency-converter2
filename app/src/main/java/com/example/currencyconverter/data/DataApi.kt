package com.example.currencyconverter.data

import com.example.convertmy.data.ValCurs
import retrofit2.http.GET


interface DataApi {
    @GET("/daily_json.js")
    suspend fun getValues(): ValCurs
}