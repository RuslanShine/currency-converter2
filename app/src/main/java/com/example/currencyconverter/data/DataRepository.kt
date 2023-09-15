package com.example.currencyconverter.data

import com.example.convertmy.data.ValCurs
import com.example.currencyconverter.ServiceLocator
import com.example.currencyconverter.domain.repository.DataRepositoryImpl

class DataRepository: DataRepositoryImpl {
    private val dataApi: com.example.currencyconverter.data.DataApi = ServiceLocator.dataApi

    override suspend fun getValues(): ValCurs {
        return dataApi.getValues()
    }
}