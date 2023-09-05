package com.example.currencyconverter.ui.theme.domain

import com.example.currencyconverter.ui.theme.data.Currency
import com.example.currencyconverter.ui.theme.data.DataRepository
import com.example.currencyconverter.ui.theme.data.ValCurs

class Interactor(val repo: DataRepository) {

    suspend fun getValues(): List<ValCurs> = repo.getValues()
}