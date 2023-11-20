package com.example.currencyconverter.domain.usecases

import com.example.currencyconverter.data.entity.Currencies
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlin.properties.Delegates

class RecalculatingValuesСhoiceUseCase(private val valuesData: Flow<List<Currencies>>) {
    private lateinit var scope: CoroutineScope
    private var fromCurrencyValue by Delegates.notNull<Double>()
    private var toCurrencyValue by Delegates.notNull<Double>()

    fun execute(userInputValue: String): Double {
        val userParamConvert = userInputValue.toDouble()
        val resultConvert = fromCurrencyValue / toCurrencyValue * userParamConvert
        return resultConvert
    }

     fun monitoringValueToVal(nameCurrencyToVal: Any) {
        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                valuesData.collect { database ->
                    toCurrencyValue = database.find { it.name == nameCurrencyToVal }?.value!! / database.find { it.name == nameCurrencyToVal }?.nominal!!
                }
            }
        }
    }

    fun monitoringValueFromVal(nameCurrencyFromVal: Any) {
        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                valuesData.collect { database ->
                    fromCurrencyValue = database.find { it.name == nameCurrencyFromVal }?.value!! / database.find { it.name == nameCurrencyFromVal }?.nominal!!
                }
            }
        }
    }
}

