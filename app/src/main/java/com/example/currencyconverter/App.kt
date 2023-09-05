package com.example.currencyconverter

import android.app.Application
import com.example.currencyconverter.ui.theme.ServiceLocator
import com.example.currencyconverter.ui.theme.data.DataRepository
import com.example.currencyconverter.ui.theme.domain.Interactor

class App: Application() {
    lateinit var repo: DataRepository
    lateinit var interactor: Interactor

    override fun onCreate() {
        super.onCreate()
        ServiceLocator.initiation(this)
        instance = this
        repo = DataRepository()
        interactor = Interactor(repo)
    }

    companion object {
        lateinit var instance: App
            private set
    }
}