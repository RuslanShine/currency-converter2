package com.example.currencyconverter.data.DAO

import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
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



//@PrimaryKey(autoGenerate = true) val id: Int = 1,
//@ColumnInfo(name = "charCode") val charCode: String,
//@ColumnInfo(name = "iD") val iD: String,
//@ColumnInfo(name = "name") val name: String,
//@ColumnInfo(name = "nominal") val nominal: Int,
//@ColumnInfo(name = "numCode") val numCode: String,
//@ColumnInfo(name = "previous") val previous: Double,
//@ColumnInfo(name = "value") val value: Double