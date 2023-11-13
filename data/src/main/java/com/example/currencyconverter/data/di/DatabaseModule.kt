package com.example.currencyconverter.data.di

import android.content.Context
import androidx.room.Room
import com.example.currencyconverter.data.DAO.CurrenciesDAO
import com.example.currencyconverter.data.db.CurrenciesDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideCurrenciesDao(context: Context): CurrenciesDatabase {
        return Room.databaseBuilder(
            context, CurrenciesDatabase::class.java,
            "cached_currencies"
        ).build()
    }

    @Provides
    @Singleton
    fun provideRepository(db: CurrenciesDatabase): CurrenciesDAO{
        return db.currenciesDao()
    }
}

