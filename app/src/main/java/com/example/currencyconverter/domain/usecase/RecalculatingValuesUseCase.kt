package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.entity.Currencies
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlin.properties.Delegates

class RecalculatingValuesUseCase(private val valuesData: Flow<List<Currencies>>) {
    private lateinit var scope: CoroutineScope
    private var fromVal by Delegates.notNull<Double>()
    private var toVal by Delegates.notNull<Double>()

    fun execute(param: String): Double {
        val userParamConvert = param.toDouble()
        val resultConvert = fromVal / toVal * userParamConvert
        return resultConvert
    }

    suspend fun monitoringValueToVal(nameCurrencyToVal: String) {
        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                valuesData.collect { db ->
                    when (nameCurrencyToVal) {

                        db.find { it.charCode =="AED" }?.name -> toVal = db.find { it.charCode =="AED" }?.value!!/ db.find { it.charCode =="AED" }?.nominal!!
                        db.find { it.charCode =="AMD" }?.name -> toVal = db.find { it.charCode =="AMD" }?.value!!/ db.find { it.charCode =="AMD" }?.nominal!!
                        db.find { it.charCode =="AUD" }?.name -> toVal = db.find { it.charCode =="AUD" }?.value!!/ db.find { it.charCode =="AUD" }?.nominal!!
                        db.find { it.charCode =="AZN" }?.name -> toVal = db.find { it.charCode =="AZN" }?.value!!/ db.find { it.charCode =="AZN" }?.nominal!!
                        db.find { it.charCode =="BGN" }?.name -> toVal = db.find { it.charCode =="BGN" }?.value!!/ db.find { it.charCode =="BGN" }?.nominal!!
                        db.find { it.charCode =="BRL" }?.name -> toVal = db.find { it.charCode =="BRL" }?.value!!/ db.find { it.charCode =="BRL" }?.nominal!!
                        db.find { it.charCode =="BYN" }?.name -> toVal = db.find { it.charCode =="BYN" }?.value!!/ db.find { it.charCode =="BYN" }?.nominal!!
                        db.find { it.charCode =="CAD" }?.name -> toVal = db.find { it.charCode =="CAD" }?.value!!/ db.find { it.charCode =="CAD" }?.nominal!!
                        db.find { it.charCode =="CHF" }?.name -> toVal = db.find { it.charCode =="CHF" }?.value!!/ db.find { it.charCode =="CHF" }?.nominal!!
                        db.find { it.charCode =="CNY" }?.name -> toVal = db.find { it.charCode =="CNY" }?.value!!/ db.find { it.charCode =="CNY" }?.nominal!!
                        db.find { it.charCode =="CZK" }?.name -> toVal = db.find { it.charCode =="CZK" }?.value!!/ db.find { it.charCode =="CZK" }?.nominal!!
                        db.find { it.charCode =="DKK" }?.name -> toVal = db.find { it.charCode =="DKK" }?.value!!/ db.find { it.charCode =="DKK" }?.nominal!!
                        db.find { it.charCode =="EGP" }?.name -> toVal = db.find { it.charCode =="EGP" }?.value!!/ db.find { it.charCode =="EGP" }?.nominal!!
                        db.find { it.charCode =="EUR" }?.name -> toVal = db.find { it.charCode =="EUR" }?.value!!/ db.find { it.charCode =="EUR" }?.nominal!!
                        db.find { it.charCode =="GEL" }?.name -> toVal = db.find { it.charCode =="GEL" }?.value!!/ db.find { it.charCode =="GEL" }?.nominal!!
                        db.find { it.charCode =="HKD" }?.name -> toVal = db.find { it.charCode =="HKD" }?.value!!/ db.find { it.charCode =="HKD" }?.nominal!!
                        db.find { it.charCode =="HUF" }?.name -> toVal = db.find { it.charCode =="HUF" }?.value!!/ db.find { it.charCode =="HUF" }?.nominal!!
                        db.find { it.charCode =="IDR" }?.name -> toVal = db.find { it.charCode =="IDR" }?.value!!/ db.find { it.charCode =="IDR" }?.nominal!!
                        db.find { it.charCode =="INR" }?.name -> toVal = db.find { it.charCode =="INR" }?.value!!/ db.find { it.charCode =="INR" }?.nominal!!
                        db.find { it.charCode =="JPY" }?.name -> toVal = db.find { it.charCode =="JPY" }?.value!!/ db.find { it.charCode =="JPY" }?.nominal!!
                        db.find { it.charCode =="KGS" }?.name -> toVal = db.find { it.charCode =="KGS" }?.value!!/ db.find { it.charCode =="KGS" }?.nominal!!
                        db.find { it.charCode =="KRW" }?.name -> toVal = db.find { it.charCode =="KRW" }?.value!!/ db.find { it.charCode =="KRW" }?.nominal!!
                        db.find { it.charCode =="KZT" }?.name -> toVal = db.find { it.charCode =="KZT" }?.value!!/ db.find { it.charCode =="KZT" }?.nominal!!
                        db.find { it.charCode =="MDL" }?.name -> toVal = db.find { it.charCode =="MDL" }?.value!!/ db.find { it.charCode =="MDL" }?.nominal!!
                        db.find { it.charCode =="NOK" }?.name -> toVal = db.find { it.charCode =="NOK" }?.value!!/ db.find { it.charCode =="NOK" }?.nominal!!
                        db.find { it.charCode =="NZD" }?.name -> toVal = db.find { it.charCode =="NZD" }?.value!!/ db.find { it.charCode =="NZD" }?.nominal!!
                        db.find { it.charCode =="PLN" }?.name -> toVal = db.find { it.charCode =="PLN" }?.value!!/ db.find { it.charCode =="PLN" }?.nominal!!
                        db.find { it.charCode =="QAR" }?.name -> toVal = db.find { it.charCode =="QAR" }?.value!!/ db.find { it.charCode =="QAR" }?.nominal!!
                        db.find { it.charCode =="RON" }?.name -> toVal = db.find { it.charCode =="RON" }?.value!!/ db.find { it.charCode =="RON" }?.nominal!!
                        db.find { it.charCode =="RSD" }?.name -> toVal = db.find { it.charCode =="RSD" }?.value!!/ db.find { it.charCode =="RSD" }?.nominal!!
                        db.find { it.charCode =="SEK" }?.name -> toVal = db.find { it.charCode =="SEK" }?.value!!/ db.find { it.charCode =="SEK" }?.nominal!!
                        db.find { it.charCode =="SGD" }?.name -> toVal = db.find { it.charCode =="SGD" }?.value!!/ db.find { it.charCode =="SGD" }?.nominal!!
                        db.find { it.charCode =="THB" }?.name -> toVal = db.find { it.charCode =="THB" }?.value!!/ db.find { it.charCode =="THB" }?.nominal!!
                        db.find { it.charCode =="TJS" }?.name -> toVal = db.find { it.charCode =="TJS" }?.value!!/ db.find { it.charCode =="TJS" }?.nominal!!
                        db.find { it.charCode =="TMT" }?.name -> toVal = db.find { it.charCode =="TMT" }?.value!!/ db.find { it.charCode =="TMT" }?.nominal!!
                        db.find { it.charCode =="TRY" }?.name -> toVal = db.find { it.charCode =="TRY" }?.value!!/ db.find { it.charCode =="TRY" }?.nominal!!
                        db.find { it.charCode =="UAH" }?.name -> toVal = db.find { it.charCode =="UAH" }?.value!!/ db.find { it.charCode =="UAH" }?.nominal!!
                        db.find { it.charCode =="USD" }?.name -> toVal = db.find { it.charCode =="USD" }?.value!!/ db.find { it.charCode =="USD" }?.nominal!!
                        db.find { it.charCode =="UZS" }?.name -> toVal = db.find { it.charCode =="UZS" }?.value!!/ db.find { it.charCode =="UZS" }?.nominal!!
                        db.find { it.charCode =="VND" }?.name -> toVal = db.find { it.charCode =="VND" }?.value!!/ db.find { it.charCode =="VND" }?.nominal!!
                        db.find { it.charCode =="ZAR" }?.name -> toVal = db.find { it.charCode =="ZAR" }?.value!!/ db.find { it.charCode =="ZAR" }?.nominal!!

                    }
                }
            }
        }
    }

    suspend fun monitoringValueFromVal(nameCurrencyFromVal: String) {
        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                valuesData.collect { db ->
                    when (nameCurrencyFromVal) {
                        db.find { it.charCode =="AED" }?.name -> fromVal = db.find { it.charCode =="AED" }?.value!!/ db.find { it.charCode =="AED" }?.nominal!!
                        db.find { it.charCode =="AMD" }?.name -> fromVal = db.find { it.charCode =="AMD" }?.value!!/ db.find { it.charCode =="AMD" }?.nominal!!
                        db.find { it.charCode =="AUD" }?.name -> fromVal = db.find { it.charCode =="AUD" }?.value!!/ db.find { it.charCode =="AUD" }?.nominal!!
                        db.find { it.charCode =="AZN" }?.name -> fromVal = db.find { it.charCode =="AZN" }?.value!!/ db.find { it.charCode =="AZN" }?.nominal!!
                        db.find { it.charCode =="BGN" }?.name -> fromVal = db.find { it.charCode =="BGN" }?.value!!/ db.find { it.charCode =="BGN" }?.nominal!!
                        db.find { it.charCode =="BRL" }?.name -> fromVal = db.find { it.charCode =="BRL" }?.value!!/ db.find { it.charCode =="BRL" }?.nominal!!
                        db.find { it.charCode =="BYN" }?.name -> fromVal = db.find { it.charCode =="BYN" }?.value!!/ db.find { it.charCode =="BYN" }?.nominal!!
                        db.find { it.charCode =="CAD" }?.name -> fromVal = db.find { it.charCode =="CAD" }?.value!!/ db.find { it.charCode =="CAD" }?.nominal!!
                        db.find { it.charCode =="CHF" }?.name -> fromVal = db.find { it.charCode =="CHF" }?.value!!/ db.find { it.charCode =="CHF" }?.nominal!!
                        db.find { it.charCode =="CNY" }?.name -> fromVal = db.find { it.charCode =="CNY" }?.value!!/ db.find { it.charCode =="CNY" }?.nominal!!
                        db.find { it.charCode =="CZK" }?.name -> fromVal = db.find { it.charCode =="CZK" }?.value!!/ db.find { it.charCode =="CZK" }?.nominal!!
                        db.find { it.charCode =="DKK" }?.name -> fromVal = db.find { it.charCode =="DKK" }?.value!!/ db.find { it.charCode =="DKK" }?.nominal!!
                        db.find { it.charCode =="EGP" }?.name -> fromVal = db.find { it.charCode =="EGP" }?.value!!/ db.find { it.charCode =="EGP" }?.nominal!!
                        db.find { it.charCode =="EUR" }?.name -> fromVal = db.find { it.charCode =="EUR" }?.value!!/ db.find { it.charCode =="EUR" }?.nominal!!
                        db.find { it.charCode =="GEL" }?.name -> fromVal = db.find { it.charCode =="GEL" }?.value!!/ db.find { it.charCode =="GEL" }?.nominal!!
                        db.find { it.charCode =="HKD" }?.name -> fromVal = db.find { it.charCode =="HKD" }?.value!!/ db.find { it.charCode =="HKD" }?.nominal!!
                        db.find { it.charCode =="HUF" }?.name -> fromVal = db.find { it.charCode =="HUF" }?.value!!/ db.find { it.charCode =="HUF" }?.nominal!!
                        db.find { it.charCode =="IDR" }?.name -> fromVal = db.find { it.charCode =="IDR" }?.value!!/ db.find { it.charCode =="IDR" }?.nominal!!
                        db.find { it.charCode =="INR" }?.name -> fromVal = db.find { it.charCode =="INR" }?.value!!/ db.find { it.charCode =="INR" }?.nominal!!
                        db.find { it.charCode =="JPY" }?.name -> fromVal = db.find { it.charCode =="JPY" }?.value!!/ db.find { it.charCode =="JPY" }?.nominal!!
                        db.find { it.charCode =="KGS" }?.name -> fromVal = db.find { it.charCode =="KGS" }?.value!!/ db.find { it.charCode =="KGS" }?.nominal!!
                        db.find { it.charCode =="KRW" }?.name -> fromVal = db.find { it.charCode =="KRW" }?.value!!/ db.find { it.charCode =="KRW" }?.nominal!!
                        db.find { it.charCode =="KZT" }?.name -> fromVal = db.find { it.charCode =="KZT" }?.value!!/ db.find { it.charCode =="KZT" }?.nominal!!
                        db.find { it.charCode =="MDL" }?.name -> fromVal = db.find { it.charCode =="MDL" }?.value!!/ db.find { it.charCode =="MDL" }?.nominal!!
                        db.find { it.charCode =="NOK" }?.name -> fromVal = db.find { it.charCode =="NOK" }?.value!!/ db.find { it.charCode =="NOK" }?.nominal!!
                        db.find { it.charCode =="NZD" }?.name -> fromVal = db.find { it.charCode =="NZD" }?.value!!/ db.find { it.charCode =="NZD" }?.nominal!!
                        db.find { it.charCode =="PLN" }?.name -> fromVal = db.find { it.charCode =="PLN" }?.value!!/ db.find { it.charCode =="PLN" }?.nominal!!
                        db.find { it.charCode =="QAR" }?.name -> fromVal = db.find { it.charCode =="QAR" }?.value!!/ db.find { it.charCode =="QAR" }?.nominal!!
                        db.find { it.charCode =="RON" }?.name -> fromVal = db.find { it.charCode =="RON" }?.value!!/ db.find { it.charCode =="RON" }?.nominal!!
                        db.find { it.charCode =="RSD" }?.name -> fromVal = db.find { it.charCode =="RSD" }?.value!!/ db.find { it.charCode =="RSD" }?.nominal!!
                        db.find { it.charCode =="SEK" }?.name -> fromVal = db.find { it.charCode =="SEK" }?.value!!/ db.find { it.charCode =="SEK" }?.nominal!!
                        db.find { it.charCode =="SGD" }?.name -> fromVal = db.find { it.charCode =="SGD" }?.value!!/ db.find { it.charCode =="SGD" }?.nominal!!
                        db.find { it.charCode =="THB" }?.name -> fromVal = db.find { it.charCode =="THB" }?.value!!/ db.find { it.charCode =="THB" }?.nominal!!
                        db.find { it.charCode =="TJS" }?.name -> fromVal = db.find { it.charCode =="TJS" }?.value!!/ db.find { it.charCode =="TJS" }?.nominal!!
                        db.find { it.charCode =="TMT" }?.name -> fromVal = db.find { it.charCode =="TMT" }?.value!!/ db.find { it.charCode =="TMT" }?.nominal!!
                        db.find { it.charCode =="TRY" }?.name -> fromVal = db.find { it.charCode =="TRY" }?.value!!/ db.find { it.charCode =="TRY" }?.nominal!!
                        db.find { it.charCode =="UAH" }?.name -> fromVal = db.find { it.charCode =="UAH" }?.value!!/ db.find { it.charCode =="UAH" }?.nominal!!
                        db.find { it.charCode =="USD" }?.name -> fromVal = db.find { it.charCode =="USD" }?.value!!/ db.find { it.charCode =="USD" }?.nominal!!
                        db.find { it.charCode =="UZS" }?.name -> fromVal = db.find { it.charCode =="UZS" }?.value!!/ db.find { it.charCode =="UZS" }?.nominal!!
                        db.find { it.charCode =="VND" }?.name -> fromVal = db.find { it.charCode =="VND" }?.value!!/ db.find { it.charCode =="VND" }?.nominal!!
                        db.find { it.charCode =="ZAR" }?.name -> fromVal = db.find { it.charCode =="ZAR" }?.value!!/ db.find { it.charCode =="ZAR" }?.nominal!!
                    }
                }
            }
        }
    }
}

