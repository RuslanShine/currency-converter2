package com.example.currencyconverter.domain.repository

import com.example.convertmy.data.ValCurs
import com.example.currencyconverter.ServiceLocator

interface DataRepositoryImpl {

    suspend fun getValues(): ValCurs

}