package com.example.currencyconverter.ui.theme.domain

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencyconverter.App
import com.example.currencyconverter.ui.theme.data.DataResponse
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {


    val posts = MutableLiveData<List<DataResponse>>()

    private var interactor: Interactor = App.instance.interactor

    init {
        loadPosts()
    }

    private fun loadPosts() {
        viewModelScope.launch {
            try {
                posts.value = interactor.getValues()
            } catch (e: Exception) {
                Log.e("MainViewModel", e.message.toString())
                e.printStackTrace()
            }
        }
    }
}