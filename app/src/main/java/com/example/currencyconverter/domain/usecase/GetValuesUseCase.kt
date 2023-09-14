package com.example.currencyconverter.domain.usecase

import androidx.lifecycle.MutableLiveData
import com.example.convertmy.data.ValCurs

class GetValuesUseCase(valuesData: MutableLiveData<ValCurs>) {

    private val d = valuesData.value?.valute?.dKK?.value
    private val s = 10.0

    fun execute(param: String): Double {
        param.toFloat()
        return d?.times(s) ?: 0.0
    }
}