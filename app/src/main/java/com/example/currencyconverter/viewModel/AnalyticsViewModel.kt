package com.example.currencyconverter.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencyconverter.data.DataRepository
import com.example.currencyconverter.data.entity.Currencies
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


}