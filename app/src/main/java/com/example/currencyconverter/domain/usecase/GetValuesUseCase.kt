package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.DataRepository
import com.example.currencyconverter.domain.repository.DataRepositoryImpl

class GetValuesUseCase(private val dataRepository:DataRepositoryImpl) {

    suspend fun execute(param: String): Double {
        val userParamConvert = param.toDouble()
        val data = dataRepository.getValues().valute.uSD.value
        return userParamConvert * data
    }
}