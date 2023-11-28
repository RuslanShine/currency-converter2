package com.example.currencyconverter.ui.homeScreen

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.currencyconverter.R
import com.example.currencyconverter.data.DataRepository
import com.example.currencyconverter.data.entity.Currencies
import com.example.currencyconverter.domain.enums.EnumСurrency
import com.example.currencyconverter.domain.usecases.RecalculatingValuesСhoiceUseCase
import com.example.currencyconverter.domain.usecases.SetCharCodeValuesUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider


class HomeViewModel @Inject constructor(val repository: DataRepository):ViewModel() {

    private val _valuesData: Flow<List<Currencies>>
    val valuesData get() = _valuesData

    init {
        _valuesData = repository.getCurrenciesFromDb()
        loadPosts()
    }

    private val recalculatingValuesUseCase = RecalculatingValuesСhoiceUseCase(valuesData)
    private val setCharCodeValuesUseCase = SetCharCodeValuesUseCase(valuesData)

    fun loadPosts() {
        viewModelScope.launch {
            try {
                repository.getCurrenciesFromApi()
            } catch (e: Exception) {
                Log.e("HomeViewModel", e.message.toString())
                e.printStackTrace()
            }
        }
    }

    fun recalculatingValues(result: String): Double {
        return recalculatingValuesUseCase.execute(result)
    }

     fun searchFromValRecalculating(nameCurrencyFromVal: Any) {
        recalculatingValuesUseCase.monitoringValueFromVal(nameCurrencyFromVal)
    }

     fun searchToValRecalculating(nameCurrencyToVal: Any) {
        recalculatingValuesUseCase.monitoringValueToVal(nameCurrencyToVal)
    }

     fun searchValueFromVal(nameCurrencyScreen: Any) {
        setCharCodeValuesUseCase.monitoringValueFromVal(nameCurrencyScreen)
    }

    fun setCurrencyNameFromVal(): String {
        return setCharCodeValuesUseCase.executeFromVal()
    }

    fun searchValueToVal(nameCurrencyScreenToVal: Any) {
        setCharCodeValuesUseCase.monitoringValueToVal(nameCurrencyScreenToVal)
    }

    fun setCurrencyNameToVal(): String {
        return setCharCodeValuesUseCase.executeToVal()
    }

//    class Factory @Inject constructor(myViewModelProvider: Provider<HomeViewModel>) : ViewModelProvider.Factory {
//        private val providers = mapOf<Class<*>, Provider<out ViewModel>>(
//            HomeViewModel::class.java to myViewModelProvider
//        )
//
//        override fun <T : ViewModel> create(modelClass: Class<T>): T {
//            return providers[modelClass]!!.get() as T
//        }
//    }


}
