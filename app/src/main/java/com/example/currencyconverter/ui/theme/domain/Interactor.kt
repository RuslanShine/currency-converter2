package com.example.currencyconverter.ui.theme.domain

import com.example.convertmy.data.ValCurs
import com.example.currencyconverter.ui.theme.data.DataRepository

class Interactor(val repo: DataRepository) {

    suspend fun getValues(): ValCurs = repo.getValues()
}