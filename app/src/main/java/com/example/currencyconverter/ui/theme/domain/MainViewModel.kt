package com.example.currencyconverter.ui.theme.domain

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencyconverter.App
import com.example.currencyconverter.ui.theme.data.ValCurs
import dagger.assisted.AssistedFactory
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {


    val valuesData = MutableLiveData<List<ValCurs>>()

    private var interactor: Interactor = App.instance.interactor

//    private val valueRepozit: DataResponse

    init {
        loadPosts()
    }

    private fun loadPosts() {
        viewModelScope.launch {
            try {
                valuesData.value = interactor.getValues()
            } catch (e: Exception) {
                Log.e("MainViewModel", e.message.toString())
                e.printStackTrace()
            }
        }
    }

//    @AssistedFactory
//    interface Factory {
//        fun create(): MainViewModel
//    }

//    companion object{
//        val Factory: ViewModelProvider.Factory = viewModelFactory {
//            initializer {
//                val application = (this[APPLICATION_KEY] as App)
//                val f  =application.interactor.repo
//                MainViewModel()
//            }
//        }
//    }
}