package com.example.currencyconverter.data.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.currencyconverter.data.entity.Currencies
import kotlinx.coroutines.flow.Flow

@Dao
interface CurrenciesDAO {
    @Query("SELECT * FROM cached_currencies")
    fun getCachedCurrencies(): Flow <List<Currencies>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun insertAll(list: List<Currencies>)
}