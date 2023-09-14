package com.example.currencyconverter.data

import com.example.convertmy.data.ValCurs
import com.example.currencyconverter.ServiceLocator

class DataRepository {
    private val dataApi: com.example.currencyconverter.data.DataApi = ServiceLocator.dataApi

    suspend fun getValues(): ValCurs {
        return dataApi.getValues()
    }
}