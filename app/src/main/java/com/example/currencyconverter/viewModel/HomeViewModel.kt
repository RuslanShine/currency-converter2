package com.example.currencyconverter.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.convertmy.data.ValCurs
import com.example.currencyconverter.App
import com.example.currencyconverter.data.DataRepository
import com.example.currencyconverter.domain.Interactor
import com.example.currencyconverter.domain.usecase.GetValuesUseCase
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {


    private val _valuesData = MutableLiveData<ValCurs>()
    val valuesData get() = _valuesData

    private val dataRepository = DataRepository()
    private val getValuesUseCase = GetValuesUseCase(dataRepository)


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

    suspend fun recalculatingValues(result: String): Double {
        return getValuesUseCase.execute(result)
    }

    suspend fun recalculatingValuesMyValute(myValute: String) {
        return getValuesUseCase.getMyValute(myValute)

    }




}
