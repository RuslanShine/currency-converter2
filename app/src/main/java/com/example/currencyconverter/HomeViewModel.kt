package com.example.currencyconverter

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencyconverter.ui.theme.data.Currency
import com.example.currencyconverter.ui.theme.data.ValCurs
import com.example.currencyconverter.ui.theme.domain.Interactor
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

//    val valuesData = MutableLiveData<List<ValCurs>>()
    private val _valuesData = MutableLiveData<List<ValCurs>>()
    val valuesData get() = _valuesData

//    private val _posts = MutableLiveData<List<Currency>>()
//    val valuesData: LiveData<List<ValCurs>> get() = _valuesData

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
}
