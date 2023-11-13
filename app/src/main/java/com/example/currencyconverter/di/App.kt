package com.example.currencyconverter.di

import android.app.Application
import com.example.currencyconverter.data.di.DatabaseModule
import com.example.currencyconverter.data.di.RemoteModule


class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

//        appComponent = DaggerAppComponent.builder()
//            .remoteModule(RemoteModule())
//            .databaseModule(DatabaseModule())
//            .build()

        appComponent = DaggerAppComponent.create()

    }

    companion object {
        lateinit var instance: App
            private set
    }

}