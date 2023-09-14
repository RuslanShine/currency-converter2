package com.example.currencyconverter.domain

import com.example.convertmy.data.ValCurs
import com.example.currencyconverter.data.DataRepository

class Interactor(val repo: com.example.currencyconverter.data.DataRepository) {

    suspend fun getValues(): ValCurs = repo.getValues()
}