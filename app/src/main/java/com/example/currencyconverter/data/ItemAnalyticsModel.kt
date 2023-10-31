package com.example.currencyconverter.data

data class ItemAnalyticsModel(
    val id: Int,
    val nameCurrency: String?,
    val codCurrency: String?,
    val exchangeRate: Double?,
    var result: String?
)

