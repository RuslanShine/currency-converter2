package com.example.currencyconverter

import android.app.Application
import com.example.currencyconverter.domain.Interactor

class App: Application() {
    lateinit var repo: com.example.currencyconverter.data.DataRepository
    lateinit var interactor: Interactor

    override fun onCreate() {
        super.onCreate()
        ServiceLocator.initiation(this)
        instance = this
        repo = com.example.currencyconverter.data.DataRepository()
        interactor = Interactor(repo)
    }

    companion object {
        lateinit var instance: App
            private set
    }
}