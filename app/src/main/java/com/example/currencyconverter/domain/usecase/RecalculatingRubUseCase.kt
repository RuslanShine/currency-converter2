package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.entity.Currencies
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class RecalculatingRubUseCase(private val valuesData: Flow<Currencies>) {
    private lateinit var scope: CoroutineScope

    private var resultAED: Double = 0.0
    private var resultAUD = 0.0




    fun execute(param: String) {
        val userParamsConvert = param.toDouble()
        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                valuesData.collect { db ->
                    resultAED = userParamsConvert / db.aED.value
//                    resultAUD = userParamsConvert / db.aUD.value


                }
            }
        }

    }

    fun getResult():Double{
        return resultAED + 1
//        return resultAUD
    }



}