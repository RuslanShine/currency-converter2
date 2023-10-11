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
    var valuesData: Flow<Currencies>

    init {
        loadPosts()
        valuesData = repository.getAllFromDB()
    }

    private val recalculatingRubUseCase = RecalculatingRubUseCase(valuesData)

    fun loadPosts() {
        viewModelScope.launch {
            try {
                repository.getCurrenciesFromApi(object : HomeViewModel.ApiCallback {
                    override fun onSuccess(сurrencies: Currencies) {
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




}