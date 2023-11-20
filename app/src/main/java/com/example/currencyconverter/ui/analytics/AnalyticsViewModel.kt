package com.example.currencyconverter.ui.analytics

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencyconverter.data.DataRepository
import com.example.currencyconverter.data.entity.Currencies
import com.example.currencyconverter.domain.usecases.RecalculatingRubUseCase
import com.example.currencyconverter.ui.Analytics.model.ItemAnalyticsModel
import com.example.currencyconverter.ui.Analytics.model.UIState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class AnalyticsViewModel @Inject constructor(val repository: DataRepository): ViewModel() {

    private val _valuesData: Flow<List<Currencies>>
    val valuesData get() = _valuesData

    val uiState: StateFlow<UIState> get() = _uiState.asStateFlow()
    private val _uiState = MutableStateFlow(UIState(listOf()))

    init {
        _valuesData = repository.getCurrenciesFromDb()
        loadPosts()
    }

    private val recalculatingRubUseCase = RecalculatingRubUseCase(_uiState)

    fun loadPosts() {
        viewModelScope.launch {
            _valuesData.collect { it ->
                _uiState.value.listCardsCurrencies = it.map {
                    ItemAnalyticsModel(
                        id = it.id,
                        nameCurrency = it.name,
                        codCurrency = it.charCode,
                        exchangeRate = it.value,
                        nominal = it.nominal,
                        resultExchangeRub = 0.0
                    )
                }
            }

            try {
                repository.getCurrenciesFromApi()
            } catch (e: Exception) {
                Log.e("AnalyticsViewModel", e.message.toString())
                e.printStackTrace()
            }
        }
    }

    fun getInputValueRub(valueRUB: Double) {
        recalculatingRubUseCase.execute(valueRUB)
    }

    fun setValueListResult() {
        val resultExchange = recalculatingRubUseCase.setResultRub()
        _uiState.value = UIState(resultExchange)
    }
}