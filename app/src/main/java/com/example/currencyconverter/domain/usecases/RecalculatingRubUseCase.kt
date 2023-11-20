package com.example.currencyconverter.domain.usecases


import com.example.currencyconverter.ui.Analytics.model.ItemAnalyticsModel
import com.example.currencyconverter.ui.Analytics.model.UIState
import kotlinx.coroutines.flow.MutableStateFlow

class RecalculatingRubUseCase(
    private val _uiState: MutableStateFlow<UIState>,
) {
    private lateinit var resultExchange: List<ItemAnalyticsModel>

    fun execute(userInputValue: Double) {
        val resultExchangeRub = _uiState.value.listCardsCurrencies.map {
            it.copy(resultExchangeRub = (userInputValue / it.exchangeRate * it.nominal))
        }
        resultExchange = resultExchangeRub
    }

    fun setResultRub(): List<ItemAnalyticsModel> {
        return resultExchange
    }
}