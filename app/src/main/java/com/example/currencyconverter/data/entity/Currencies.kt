package com.example.currencyconverter.data.entity

//import android.os.Parcelable
//import androidx.room.ColumnInfo
//import androidx.room.Entity
//import androidx.room.Ignore
//import androidx.room.Index
//import androidx.room.PrimaryKey
//import com.example.convertmy.data.Valute
//
//
//@Entity(tableName = "cached_currencies", indices = [Index(value = ["title"], unique = true)])
//data class Currencies(
//    @PrimaryKey(autoGenerate = true) val id: Int = 0,
//    @ColumnInfo(name = "date") val date: String,
//    @ColumnInfo(name = "previousDate") val previousDate: String,
//    @ColumnInfo(name = "previousURL") val previousURL: String,
//    @ColumnInfo(name = "timestamp") val timestamp: String,
//    @ColumnInfo(name = "valute_") val valute: Valute,
//    )



//@Entity(tableName = "cached_currencies", indices = [Index(value = ["title"], unique = true)])
//data class Currencies(
//    @PrimaryKey(autoGenerate = true) val id: Int = 0,
//    @Ignore val iD: String,
//    @ColumnInfo(name = "char_Code") val charCode: String,
//    @ColumnInfo(name = "name_") val name: String,
//    @ColumnInfo(name = "nominal_") val nominal: Int,
//    @ColumnInfo(name = "numCode_") val numCode: String,
//    @Ignore val previous: Double,
//    @ColumnInfo(name = "value_") val value: Double,
//)