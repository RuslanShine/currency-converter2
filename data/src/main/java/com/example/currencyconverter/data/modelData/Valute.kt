package com.example.convertmy.data


import com.example.currencyconverter.data.modelData.UniversalCurrency
import com.google.gson.annotations.SerializedName



data class Valute(
    @SerializedName("AED")
    val aED: UniversalCurrency,
    @SerializedName("AMD")
    val aMD: UniversalCurrency,
    @SerializedName("AUD")
    val aUD: UniversalCurrency,
    @SerializedName("AZN")
    val aZN: UniversalCurrency,
    @SerializedName("BGN")
    val bGN: UniversalCurrency,
    @SerializedName("BRL")
    val bRL: UniversalCurrency,
    @SerializedName("BYN")
    val bYN: UniversalCurrency,
    @SerializedName("CAD")
    val cAD: UniversalCurrency,
    @SerializedName("CHF")
    val cHF: UniversalCurrency,
    @SerializedName("CNY")
    val cNY: UniversalCurrency,
    @SerializedName("CZK")
    val cZK: UniversalCurrency,
    @SerializedName("DKK")
    val dKK: UniversalCurrency,
    @SerializedName("EGP")
    val eGP: UniversalCurrency,
    @SerializedName("EUR")
    val eUR: UniversalCurrency,
    @SerializedName("GBP")
    val gBP: UniversalCurrency,
    @SerializedName("GEL")
    val gEL: UniversalCurrency,
    @SerializedName("HKD")
    val hKD: UniversalCurrency,
    @SerializedName("HUF")
    val hUF: UniversalCurrency,
    @SerializedName("IDR")
    val iDR: UniversalCurrency,
    @SerializedName("INR")
    val iNR: UniversalCurrency,
    @SerializedName("JPY")
    val jPY: UniversalCurrency,
    @SerializedName("KGS")
    val kGS: UniversalCurrency,
    @SerializedName("KRW")
    val kRW: UniversalCurrency,
    @SerializedName("KZT")
    val kZT: UniversalCurrency,
    @SerializedName("MDL")
    val mDL: UniversalCurrency,
    @SerializedName("NOK")
    val nOK: UniversalCurrency,
    @SerializedName("NZD")
    val nZD: UniversalCurrency,
    @SerializedName("PLN")
    val pLN: UniversalCurrency,
    @SerializedName("QAR")
    val qAR: UniversalCurrency,
    @SerializedName("RON")
    val rON: UniversalCurrency,
    @SerializedName("RSD")
    val rSD: UniversalCurrency,
    @SerializedName("SEK")
    val sEK: UniversalCurrency,
    @SerializedName("SGD")
    val sGD: UniversalCurrency,
    @SerializedName("THB")
    val tHB: UniversalCurrency,
    @SerializedName("TJS")
    val tJS: UniversalCurrency,
    @SerializedName("TMT")
    val tMT: UniversalCurrency,
    @SerializedName("TRY")
    val tRY: UniversalCurrency,
    @SerializedName("UAH")
    val uAH: UniversalCurrency,
    @SerializedName("USD")
    val uSD: UniversalCurrency,
    @SerializedName("UZS")
    val uZS: UniversalCurrency,
    @SerializedName("VND")
    val vND: UniversalCurrency,
    @SerializedName("XDR")
    val xDR: UniversalCurrency,
    @SerializedName("ZAR")
    val zAR: UniversalCurrency
)