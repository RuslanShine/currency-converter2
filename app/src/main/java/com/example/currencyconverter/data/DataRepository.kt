package com.example.currencyconverter.data

import com.example.convertmy.data.ValCurs
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataRepository @Inject constructor(private val dataApi: DataApi) {

    suspend fun getValues(): ValCurs {
        return dataApi.getValues()
    }
}