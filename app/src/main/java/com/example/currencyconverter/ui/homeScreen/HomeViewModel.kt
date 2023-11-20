package com.example.currencyconverter.ui.homeScreen

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencyconverter.data.DataRepository
import com.example.currencyconverter.data.entity.Currencies
import com.example.currencyconverter.domain.usecases.RecalculatingValuesСhoiceUseCase
import com.example.currencyconverter.domain.usecases.SetCharCodeValuesUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject


class HomeViewModel @Inject constructor(val repository: DataRepository):ViewModel() {

    private val _valuesData: Flow<List<Currencies>>
    val valuesData get() = _valuesData



    init {

//        App.instance.appComponent.inject(this)
        loadPosts()
        _valuesData = repository.getCurrenciesFromDb()


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

    suspend fun searchFromValRecalculating(nameCurrencyFromVal: Any) {
        recalculatingValuesUseCase.monitoringValueFromVal(nameCurrencyFromVal)
    }

    suspend fun searchToValRecalculating(nameCurrencyToVal: Any) {
        recalculatingValuesUseCase.monitoringValueToVal(nameCurrencyToVal)
    }

    suspend fun searchValueFromVal(nameCurrencyScreen: Any) {
        setCharCodeValuesUseCase.monitoringValueFromVal(nameCurrencyScreen)
    }

    fun setCurrencyNameFromVal(): String {
        return setCharCodeValuesUseCase.executeFromVal()
    }

    suspend fun searchValueToVal(nameCurrencyScreenToVal: Any) {
        setCharCodeValuesUseCase.monitoringValueToVal(nameCurrencyScreenToVal)
    }

    fun setCurrencyNameToVal(): String {
        return setCharCodeValuesUseCase.executeToVal()
    }

}
