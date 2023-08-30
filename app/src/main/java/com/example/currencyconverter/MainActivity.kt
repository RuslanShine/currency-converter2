package com.example.currencyconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.example.currencyconverter.ui.theme.MainScreen
import com.example.currencyconverter.ui.theme.domain.MainViewModel

class MainActivity : ComponentActivity() {

//    private val viewModel by lazy {
//        ViewModelProvider.NewInstanceFactory().create(
//            MainViewModel::class.java
//        )
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()

        }


    }

}
