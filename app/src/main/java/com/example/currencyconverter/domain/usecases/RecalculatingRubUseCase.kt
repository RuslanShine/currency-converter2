package com.example.currencyconverter.domain.usecases

import com.example.currencyconverter.ui.Analytics.model.ItemAnalyticsModel
import com.example.currencyconverter.ui.Analytics.model.UIState
import kotlinx.coroutines.flow.MutableStateFlow

class RecalculatingRubUseCase(
    private val _uiState: MutableStateFlow<UIState>,
) {
    private lateinit var result: List<ItemAnalyticsModel>

    fun execute(userParams: Double) {
        val resultRub = _uiState.value.listCard.map {
            it.copy(result = (userParams / it.exchangeRate * it.nominal))
        }
        result = resultRub
    }

    fun getResultRub(): List<ItemAnalyticsModel> {
        return result
    }
}