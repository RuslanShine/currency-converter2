package com.example.currencyconverter.di

import com.example.currencyconverter.data.DataRepository
import com.example.currencyconverter.data.di.DatabaseModule
import com.example.currencyconverter.data.di.RemoteModule
import com.example.currencyconverter.ui.Analytics.AnalyticsViewModel
import com.example.currencyconverter.ui.HomeScreen.HomeViewModel
import dagger.Component

@Component(
    modules = [
        DatabaseModule::class,
        RemoteModule::class
    ]
)
interface AppComponent {

    fun injectDataRepository(dataRepository: DataRepository)

    fun injectHomeViewModel(homeViewModel: HomeViewModel)
    fun injectAnalyticsViewModel(analyticsViewModel: AnalyticsViewModel)

}