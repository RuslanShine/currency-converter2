package com.example.currencyconverter

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.convertmy.data.ValCurs
import com.example.currencyconverter.ui.theme.domain.Interactor
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {


    private val _valuesData = MutableLiveData<ValCurs>()
    val valuesData get() = _valuesData

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
