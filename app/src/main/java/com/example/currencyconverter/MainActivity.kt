package com.example.currencyconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.currencyconverter.ui.theme.MainScreen
import com.example.currencyconverter.ui.theme.domain.MainViewModel

class MainActivity : ComponentActivity() {

//    private val viewModel by lazy {
//        ViewModelProvider.NewInstanceFactory().create(
//            MainViewModel::class.java
//        )
//    }

//    @Inject
//    lateinit var viewModelFactory: MainViewModel.Factory
//
//    private val viewModel: MainViewModel by loadPosts() {
//        viewModelFactory.create( )
//    }

    private val viewModel by viewModels<MainViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(viewModel)

        }


    }

}
