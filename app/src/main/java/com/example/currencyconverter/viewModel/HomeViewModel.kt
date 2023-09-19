package com.example.currencyconverter.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.convertmy.data.ValCurs
import com.example.currencyconverter.App
import com.example.currencyconverter.data.DataRepository
import com.example.currencyconverter.domain.Interactor
import com.example.currencyconverter.domain.usecase.RecalculatingValuesUseCase
import com.example.currencyconverter.domain.usecase.SetCharCodeValuesUseCase
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val _valuesData = MutableLiveData<ValCurs>()
    val valuesData get() = _valuesData

    private val dataRepository = DataRepository()
    private val recalculatingValuesUseCase = RecalculatingValuesUseCase(dataRepository)
    private val setCharCodeValuesUseCase = SetCharCodeValuesUseCase(dataRepository)


    private var interactor: Interactor = App.instance.interactor

    init {
        loadPosts()

    }

    fun loadPosts() {
        viewModelScope.launch {
            try {
                _valuesData.value = interactor.getValues()
            } catch (e: Exception) {
                Log.e("HomeViewModel", e.message.toString())
                e.printStackTrace()
            }
        }
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
