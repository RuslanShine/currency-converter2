package com.example.currencyconverter.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cached_currencies")
data class Currencies(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "charCode") val charCode: String,
    @ColumnInfo(name = "_iD") val iD: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "nominal") val nominal: Int,
    @ColumnInfo(name = "numCode") val numCode: String,
    @ColumnInfo(name = "previous") val previous: Double,
    @ColumnInfo(name = "value") val value: Double,
)