package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.entity.Currencies
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlin.properties.Delegates

class RecalculatingRubUseCase(private val valuesData: Flow<Currencies>) {
    private lateinit var scope: CoroutineScope

    private var resultAED by Delegates.notNull<Double>()
    private var resultAMD by Delegates.notNull<Double>()
    private var resultAUD by Delegates.notNull<Double>()
    private var resultAZN by Delegates.notNull<Double>()
    private var resultBGN by Delegates.notNull<Double>()
    private var resultBRL by Delegates.notNull<Double>()
    private var resultBYN by Delegates.notNull<Double>()
    private var resultCAD by Delegates.notNull<Double>()
    private var resultCHF by Delegates.notNull<Double>()
    private var resultCNY by Delegates.notNull<Double>()

    fun execute(param: String) {
        val userParamsConvert = param.toDouble()
        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                valuesData.collect { db ->
                    resultAED = userParamsConvert / db.aED.value
                    resultAMD = userParamsConvert / db.aMD.value * db.aMD.nominal
                    resultAUD = userParamsConvert / db.aUD.value
                    resultAZN = userParamsConvert / db.aZN.value
                    resultBGN = userParamsConvert / db.bGN.value
                    resultBRL = userParamsConvert / db.bRL.value
                    resultBYN = userParamsConvert / db.bYN.value
                    resultCAD = userParamsConvert / db.cAD.value
                    resultCHF = userParamsConvert / db.cHF.value
                    resultCNY = userParamsConvert / db.cNY.value

                }
            }
        }
    }

    fun getResultAed(): Double {
        return resultAED
    }

    fun getResultAmd(): Double {
        return resultAMD
    }

    fun getResultAud(): Double {
        return resultAUD
    }

    fun getResultAzn(): Double {
        return resultAZN
    }

    fun getResultBgn(): Double {
        return resultBGN
    }

    fun getResultBrl(): Double {
        return resultBRL
    }

    fun getResultByn(): Double {
        return resultBYN
    }

    fun getResultCad(): Double {
        return resultCAD
    }

    fun getResultChf(): Double {
        return resultCHF
    }

    fun getResultCny(): Double {
        return resultCNY
    }

}