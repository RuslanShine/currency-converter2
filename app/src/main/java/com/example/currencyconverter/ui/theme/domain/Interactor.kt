package com.example.currencyconverter.ui.theme.domain

import com.example.currencyconverter.ui.theme.data.DataRepository
import com.example.currencyconverter.ui.theme.data.DataResponse

class Interactor(val repo: DataRepository) {

    suspend fun getValues(): List<DataResponse> = repo.getValues()
}