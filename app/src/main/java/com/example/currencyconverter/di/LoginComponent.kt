package com.example.currencyconverter.di

import com.example.currencyconverter.MainActivity
import com.example.currencyconverter.ui.Analytics.AnalyticsFragment
import com.example.currencyconverter.ui.HomeScreen.HomeFragment
import dagger.Subcomponent

@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(loginActivity: MainActivity)
    fun inject(homeFragment: HomeFragment)
    fun inject(analyticsFragment: AnalyticsFragment)
}