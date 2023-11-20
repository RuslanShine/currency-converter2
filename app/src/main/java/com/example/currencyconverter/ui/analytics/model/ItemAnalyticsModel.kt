package com.example.currencyconverter.ui.Analytics.model

data class ItemAnalyticsModel(
    val id: Int,
    val nameCurrency: String,
    val codCurrency: String,
    val exchangeRate: Double,
    val nominal:Int,
    var resultExchangeRub: Double
)

