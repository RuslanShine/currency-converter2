package com.example.currencyconverter.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.convertmy.data.ValCurs
import com.example.currencyconverter.data.DataRepository
import com.example.currencyconverter.data.entity.Currencies
import com.example.currencyconverter.domain.usecase.RecalculatingValuesUseCase
import com.example.currencyconverter.domain.usecase.SetCharCodeValuesUseCase


import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import java.util.concurrent.Executors
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: DataRepository) : ViewModel() {

    private val _valuesData = MutableLiveData<List<Currencies>>()
    val valuesData get() = _valuesData

    private val recalculatingValuesUseCase = RecalculatingValuesUseCase(repository)
    private val setCharCodeValuesUseCase = SetCharCodeValuesUseCase(repository)


    init {
        loadPosts()
    }

    fun loadPosts() {
        viewModelScope.launch {
            try {
                repository.getCurrenciesFromApi(object : ApiCallback {
                    override fun onSuccess(сurrencies: List<Currencies>) {
                        _valuesData.postValue(сurrencies)
                    }

                    override fun onFailure() {
                        Executors.newSingleThreadExecutor().execute() {
                            _valuesData.postValue(repository.getAllFromDB())
                        }
                    }

                })
//                _valuesData.value = repository.getValues()
            } catch (e: Exception) {
                Log.e("HomeViewModel", e.message.toString())
                e.printStackTrace()
            }
        }
    }

    interface ApiCallback {
        fun onSuccess(сurrencies: List<Currencies>)
        fun onFailure()
    }

    fun recalculatingValues(result: String): Double {
        return recalculatingValuesUseCase.execute(result)
    }

    suspend fun searchFromVal(nameCurrencyFromVal: String) {
        recalculatingValuesUseCase.monitoringValueFromVal(nameCurrencyFromVal)
    }

    suspend fun searchToVal(nameCurrencyToVal: String) {
        recalculatingValuesUseCase.monitoringValueToVal(nameCurrencyToVal)
    }

    suspend fun searchValueFromVal(nameCurrencyScreen: String) {
        setCharCodeValuesUseCase.monitoringValueFromVal(nameCurrencyScreen)
    }

    fun setCurrencyNameFromVal(): String {
        return setCharCodeValuesUseCase.executeFromVal()
    }

    suspend fun searchValueToVal(nameCurrencyScreenToVal: String) {
        setCharCodeValuesUseCase.monitoringValueToVal(nameCurrencyScreenToVal)
    }

    fun setCurrencyNameToVal(): String {
        return setCharCodeValuesUseCase.executeToVal()
    }

}
