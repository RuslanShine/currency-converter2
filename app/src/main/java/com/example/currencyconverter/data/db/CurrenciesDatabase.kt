package com.example.currencyconverter.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room

import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.currencyconverter.data.DAO.CurrenciesDAO
import com.example.currencyconverter.data.entity.Currencies

@Database(entities = [Currencies::class], version = 1, exportSchema = false)
abstract class CurrenciesDatabase : RoomDatabase() {
    abstract fun currenciesDao(): CurrenciesDAO

}