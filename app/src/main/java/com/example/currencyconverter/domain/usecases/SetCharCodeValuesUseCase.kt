package com.example.currencyconverter.domain.usecases

import com.example.currencyconverter.data.entity.Currencies
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class SetCharCodeValuesUseCase(private val valuesData: Flow<List<Currencies>>) {
    private lateinit var scope: CoroutineScope
    private var nameCurrency = "VAL"
    private var nameCurrencyToVal = "VAL"

    fun executeFromVal(): String {
        return nameCurrency
    }

    fun executeToVal(): String {
        return nameCurrencyToVal
    }

    suspend fun monitoringValueFromVal(nameCurrencyScreen: Any) {
        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                valuesData.collect { db ->
                   nameCurrency = db.find { it.name == nameCurrencyScreen }?.charCode!!
                }
            }
        }
    }

    suspend fun monitoringValueToVal(nameCurrencyScreenToVal: Any) {
        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                valuesData.collect { db ->
                    nameCurrencyToVal = db.find { it.name == nameCurrencyScreenToVal }?.charCode!!
                }
            }
        }
    }
}