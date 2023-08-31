package com.example.currencyconverter.ui.theme.data

import com.example.currencyconverter.ui.theme.ServiceLocator

class DataRepository {
    private val dataApi: DataApi = ServiceLocator.dataApi

    suspend fun getValues(): List<ValCurs> {
        return dataApi.getValues()
    }
}