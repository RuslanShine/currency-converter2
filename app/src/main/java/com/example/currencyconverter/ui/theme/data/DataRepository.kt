package com.example.currencyconverter.ui.theme.data

import com.example.convertmy.data.ValCurs
import com.example.currencyconverter.ui.theme.ServiceLocator

class DataRepository {
    private val dataApi: DataApi = ServiceLocator.dataApi

    suspend fun getValues(): ValCurs {
        return dataApi.getValues()
    }
}