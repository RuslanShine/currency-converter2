package com.example.currencyconverter.ui.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencyconverter.data.DataRepository
import com.example.currencyconverter.data.entity.Currencies
import com.example.currencyconverter.domain.usecase.RecalculatingRubUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnalyticsViewModel@Inject constructor(private val repository: DataRepository) : ViewModel() {
    var valuesData: Flow<List<Currencies>>

    init {
        loadPosts()
        valuesData = repository.getAllFromDB()
    }

    private val recalculatingRubUseCase = RecalculatingRubUseCase(valuesData)

    fun loadPosts() {
        viewModelScope.launch {
            try {
                repository.getCurrenciesFromApi(object : HomeViewModel.ApiCallback {
                    override fun onSuccess(сurrencies: MutableList<Currencies>) {
//                        valuesData
                    }

                    override fun onFailure() {
//                         valuesData = repository.getAllFromDB()
                    }
                })
            } catch (e: Exception) {
                Log.e("AnalyticsViewModel", e.message.toString())
                e.printStackTrace()
            }
        }
    }

    interface ApiCallback {
        fun onSuccess(сurrencies: Currencies)
        fun onFailure()
    }

    fun inputValueRub(valueRUB:String){
        recalculatingRubUseCase.execute(valueRUB)
    }

    fun getValueAED(): Double {
        return recalculatingRubUseCase.getResultAed()
    }

    fun getValueAMD(): Double {
        return recalculatingRubUseCase.getResultAmd()
    }

    fun getValueAUD(): Double {
        return recalculatingRubUseCase.getResultAud()
    }

    fun getValueAZN(): Double {
        return recalculatingRubUseCase.getResultAzn()
    }

    fun getValueBGN(): Double {
        return recalculatingRubUseCase.getResultBgn()
    }

    fun getValueBRL(): Double {
        return recalculatingRubUseCase.getResultBrl()
    }

    fun getValueBYN(): Double {
        return recalculatingRubUseCase.getResultByn()
    }

    fun getValueCAD(): Double {
        return recalculatingRubUseCase.getResultCad()
    }

    fun getValueCHF(): Double {
        return recalculatingRubUseCase.getResultChf()
    }

    fun getValueCNY(): Double {
        return recalculatingRubUseCase.getResultCny()
    }

    fun getValueCZK(): Double {
        return recalculatingRubUseCase.getResultCzk()
    }

    fun getValueDKK(): Double {
        return recalculatingRubUseCase.getResultDkk()
    }

    fun getValueEGP(): Double {
        return recalculatingRubUseCase.getResultEgp()
    }

    fun getValueEUR(): Double {
        return recalculatingRubUseCase.getResultEur()
    }

    fun getValueGEL(): Double {
        return recalculatingRubUseCase.getResultGel()
    }

    fun getValueHKD(): Double {
        return recalculatingRubUseCase.getResultHkd()
    }

    fun getValueHUF(): Double {
        return recalculatingRubUseCase.getResultHuf()
    }

    fun getValueIDR(): Double {
        return recalculatingRubUseCase.getResultIdr()
    }

    fun getValueINR(): Double {
        return recalculatingRubUseCase.getResultInr()
    }

    fun getValueJPY(): Double {
        return recalculatingRubUseCase.getResultJpy()
    }

    fun getValueKGS(): Double {
        return recalculatingRubUseCase.getResultKgs()
    }

    fun getValueKRW(): Double {
        return recalculatingRubUseCase.getResultKrw()
    }

    fun getValueKZT(): Double {
        return recalculatingRubUseCase.getResultKzt()
    }

    fun getValueMDL(): Double {
        return recalculatingRubUseCase.getResultMdl()
    }

    fun getValueNOK(): Double {
        return recalculatingRubUseCase.getResultNok()
    }

    fun getValueNZD(): Double {
        return recalculatingRubUseCase.getResultNzd()
    }

    fun getValuePLN(): Double {
        return recalculatingRubUseCase.getResultPln()
    }

    fun getValueQAR(): Double {
        return recalculatingRubUseCase.getResultQar()
    }

    fun getValueRON(): Double {
        return recalculatingRubUseCase.getResultRon()
    }

    fun getValueRSD(): Double {
        return recalculatingRubUseCase.getResultRsd()
    }

    fun getValueSEK(): Double {
        return recalculatingRubUseCase.getResultSek()
    }

    fun getValueSGD(): Double {
        return recalculatingRubUseCase.getResultSgd()
    }

    fun getValueTHB(): Double {
        return recalculatingRubUseCase.getResultThb()
    }

    fun getValueTJS(): Double {
        return recalculatingRubUseCase.getResultTjs()
    }

    fun getValueTMT(): Double {
        return recalculatingRubUseCase.getResultTmt()
    }

    fun getValueTRY(): Double {
        return recalculatingRubUseCase.getResultTry()
    }

    fun getValueUAH(): Double {
        return recalculatingRubUseCase.getResultUah()
    }

    fun getValueUSD(): Double {
        return recalculatingRubUseCase.getResultUsd()
    }

    fun getValueUZS(): Double {
        return recalculatingRubUseCase.getResultUzs()
    }

    fun getValueVND(): Double {
        return recalculatingRubUseCase.getResultVnd()
    }

    fun getValueZAR(): Double {
        return recalculatingRubUseCase.getResultZar()
    }
}