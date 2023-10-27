package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.entity.Currencies
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlin.properties.Delegates

class RecalculatingValuesUseCase(private val valuesData: Flow<List<Currencies>>) {
    private lateinit var scope: CoroutineScope
    private var fromVal by Delegates.notNull<Double>()
    private var toVal by Delegates.notNull<Double>()

    fun execute(param: String): Double {
        val userParamConvert = param.toDouble()
        val resultConvert = fromVal / toVal * userParamConvert
        return resultConvert
    }

    suspend fun monitoringValueToVal(nameCurrencyToVal: String) {
        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                valuesData.collect { db ->
                    toVal = db.find { it.name == nameCurrencyToVal }?.value!! / db.find { it.name == nameCurrencyToVal }?.nominal!!
                }
            }
        }
    }

    suspend fun monitoringValueFromVal(nameCurrencyFromVal: String) {
        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                valuesData.collect { db ->
                    fromVal = db.find { it.name == nameCurrencyFromVal }?.value!! / db.find { it.name == nameCurrencyFromVal }?.nominal!!
                }
            }
        }
    }
}

