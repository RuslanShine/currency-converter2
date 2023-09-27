package com.example.currencyconverter.di

import android.content.Context
import androidx.room.Room
import com.example.currencyconverter.data.DAO.CurrenciesDAO
import com.example.currencyconverter.data.DataRepository
import com.example.currencyconverter.data.db.CurrenciesDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    fun provideCurrenciesDao(@ApplicationContext context: Context): CurrenciesDatabase {
        return Room.databaseBuilder(
            context, CurrenciesDatabase::class.java,
            "currency_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideRepository(db: CurrenciesDatabase): CurrenciesDAO{
        return db.currenciesDao()
    }


//    @Provides
//    @Singleton
//    fun provideRepository(db: CurrenciesDatabase) = db.currenciesDao()
//
//    @Provides
//    @Singleton
//    fun provideCurrenciesDao(@ApplicationContext context: Context) =
//        Room.databaseBuilder(
//            context,
//            CurrenciesDatabase::class.java,
//            "currency_db"
//        ).build()
//
//    @Provides
//    @Singleton
//    fun provideRepository(db: CurrenciesDatabase) = db.currenciesDao()

//    @Provides
//    @Singleton
//    fun provideRepository(currenciesDao: CurrenciesDAO) = DataRepository(currenciesDao)
}

