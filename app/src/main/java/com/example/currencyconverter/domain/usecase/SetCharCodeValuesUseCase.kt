package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.entity.Currencies
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class SetCharCodeValuesUseCase(private val valuesData: Flow<List<Currencies>>) {
    private lateinit var scope: CoroutineScope
    private var nameCurrency = "VAL"
    private var nameCurrencyToVal = "VAL"

    fun executeFromVal(): String {
        return nameCurrency
    }

    fun executeToVal(): String {
        return nameCurrencyToVal
    }

    suspend fun monitoringValueFromVal(nameCurrencyScreen: String) {
        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                valuesData.collect { db ->
                    when (nameCurrencyScreen) {
                        db.find { it.charCode =="AED"}?.name ->nameCurrency = db.find { it.charCode =="AED"}?.charCode!!
                        db.find { it.charCode =="AMD"}?.name ->nameCurrency = db.find { it.charCode =="AMD"}?.charCode!!
                        db.find { it.charCode =="AUD"}?.name ->nameCurrency = db.find { it.charCode =="AUD"}?.charCode!!
                        db.find { it.charCode =="AZN"}?.name ->nameCurrency = db.find { it.charCode =="AZN"}?.charCode!!
                        db.find { it.charCode =="BGN"}?.name ->nameCurrency = db.find { it.charCode =="BGN"}?.charCode!!
                        db.find { it.charCode =="BRL"}?.name ->nameCurrency = db.find { it.charCode =="BRL"}?.charCode!!
                        db.find { it.charCode =="BYN"}?.name ->nameCurrency = db.find { it.charCode =="BYN"}?.charCode!!
                        db.find { it.charCode =="CAD"}?.name ->nameCurrency = db.find { it.charCode =="CAD"}?.charCode!!
                        db.find { it.charCode =="CHF"}?.name ->nameCurrency = db.find { it.charCode =="CHF"}?.charCode!!
                        db.find { it.charCode =="CNY"}?.name ->nameCurrency = db.find { it.charCode =="CNY"}?.charCode!!
                        db.find { it.charCode =="CZK"}?.name ->nameCurrency = db.find { it.charCode =="CZK"}?.charCode!!
                        db.find { it.charCode =="DKK"}?.name ->nameCurrency = db.find { it.charCode =="DKK"}?.charCode!!
                        db.find { it.charCode =="EGP"}?.name ->nameCurrency = db.find { it.charCode =="EGP"}?.charCode!!
                        db.find { it.charCode =="EUR"}?.name ->nameCurrency = db.find { it.charCode =="EUR"}?.charCode!!
                        db.find { it.charCode =="GEL"}?.name ->nameCurrency = db.find { it.charCode =="GEL"}?.charCode!!
                        db.find { it.charCode =="HKD"}?.name ->nameCurrency = db.find { it.charCode =="HKD"}?.charCode!!
                        db.find { it.charCode =="HUF"}?.name ->nameCurrency = db.find { it.charCode =="HUF"}?.charCode!!
                        db.find { it.charCode =="IDR"}?.name ->nameCurrency = db.find { it.charCode =="IDR"}?.charCode!!
                        db.find { it.charCode =="INR"}?.name ->nameCurrency = db.find { it.charCode =="INR"}?.charCode!!
                        db.find { it.charCode =="JPY"}?.name ->nameCurrency = db.find { it.charCode =="JPY"}?.charCode!!
                        db.find { it.charCode =="KGS"}?.name ->nameCurrency = db.find { it.charCode =="KGS"}?.charCode!!
                        db.find { it.charCode =="KRW"}?.name ->nameCurrency = db.find { it.charCode =="KRW"}?.charCode!!
                        db.find { it.charCode =="KZT"}?.name ->nameCurrency = db.find { it.charCode =="KZT"}?.charCode!!
                        db.find { it.charCode =="MDL"}?.name ->nameCurrency = db.find { it.charCode =="MDL"}?.charCode!!
                        db.find { it.charCode =="NOK"}?.name ->nameCurrency = db.find { it.charCode =="NOK"}?.charCode!!
                        db.find { it.charCode =="NZD"}?.name ->nameCurrency = db.find { it.charCode =="NZD"}?.charCode!!
                        db.find { it.charCode =="PLN"}?.name ->nameCurrency = db.find { it.charCode =="PLN"}?.charCode!!
                        db.find { it.charCode =="QAR"}?.name ->nameCurrency = db.find { it.charCode =="QAR"}?.charCode!!
                        db.find { it.charCode =="RON"}?.name ->nameCurrency = db.find { it.charCode =="RON"}?.charCode!!
                        db.find { it.charCode =="RSD"}?.name ->nameCurrency = db.find { it.charCode =="RSD"}?.charCode!!
                        db.find { it.charCode =="SEK"}?.name ->nameCurrency = db.find { it.charCode =="SEK"}?.charCode!!
                        db.find { it.charCode =="SGD"}?.name ->nameCurrency = db.find { it.charCode =="SGD"}?.charCode!!
                        db.find { it.charCode =="THB"}?.name ->nameCurrency = db.find { it.charCode =="THB"}?.charCode!!
                        db.find { it.charCode =="TJS"}?.name ->nameCurrency = db.find { it.charCode =="TJS"}?.charCode!!
                        db.find { it.charCode =="TMT"}?.name ->nameCurrency = db.find { it.charCode =="TMT"}?.charCode!!
                        db.find { it.charCode =="TRY"}?.name ->nameCurrency = db.find { it.charCode =="TRY"}?.charCode!!
                        db.find { it.charCode =="UAH"}?.name ->nameCurrency = db.find { it.charCode =="UAH"}?.charCode!!
                        db.find { it.charCode =="USD"}?.name ->nameCurrency = db.find { it.charCode =="USD"}?.charCode!!
                        db.find { it.charCode =="UZS"}?.name ->nameCurrency = db.find { it.charCode =="UZS"}?.charCode!!
                        db.find { it.charCode =="VND"}?.name ->nameCurrency = db.find { it.charCode =="VND"}?.charCode!!
                        db.find { it.charCode =="ZAR"}?.name ->nameCurrency = db.find { it.charCode =="ZAR"}?.charCode!!
                    }
                }
            }
        }
    }

    suspend fun monitoringValueToVal(nameCurrencyScreenToVal: String) {
        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                valuesData.collect { db ->
                    when (nameCurrencyScreenToVal) {
                        db.find { it.charCode =="AED"}?.name ->nameCurrencyToVal = db.find { it.charCode =="AED"}?.charCode!!
                        db.find { it.charCode =="AMD"}?.name ->nameCurrencyToVal = db.find { it.charCode =="AMD"}?.charCode!!
                        db.find { it.charCode =="AUD"}?.name ->nameCurrencyToVal = db.find { it.charCode =="AUD"}?.charCode!!
                        db.find { it.charCode =="AZN"}?.name ->nameCurrencyToVal = db.find { it.charCode =="AZN"}?.charCode!!
                        db.find { it.charCode =="BGN"}?.name ->nameCurrencyToVal = db.find { it.charCode =="BGN"}?.charCode!!
                        db.find { it.charCode =="BRL"}?.name ->nameCurrencyToVal = db.find { it.charCode =="BRL"}?.charCode!!
                        db.find { it.charCode =="BYN"}?.name ->nameCurrencyToVal = db.find { it.charCode =="BYN"}?.charCode!!
                        db.find { it.charCode =="CAD"}?.name ->nameCurrencyToVal = db.find { it.charCode =="CAD"}?.charCode!!
                        db.find { it.charCode =="CHF"}?.name ->nameCurrencyToVal = db.find { it.charCode =="CHF"}?.charCode!!
                        db.find { it.charCode =="CNY"}?.name ->nameCurrencyToVal = db.find { it.charCode =="CNY"}?.charCode!!
                        db.find { it.charCode =="CZK"}?.name ->nameCurrencyToVal = db.find { it.charCode =="CZK"}?.charCode!!
                        db.find { it.charCode =="DKK"}?.name ->nameCurrencyToVal = db.find { it.charCode =="DKK"}?.charCode!!
                        db.find { it.charCode =="EGP"}?.name ->nameCurrencyToVal = db.find { it.charCode =="EGP"}?.charCode!!
                        db.find { it.charCode =="EUR"}?.name ->nameCurrencyToVal = db.find { it.charCode =="EUR"}?.charCode!!
                        db.find { it.charCode =="GEL"}?.name ->nameCurrencyToVal = db.find { it.charCode =="GEL"}?.charCode!!
                        db.find { it.charCode =="HKD"}?.name ->nameCurrencyToVal = db.find { it.charCode =="HKD"}?.charCode!!
                        db.find { it.charCode =="HUF"}?.name ->nameCurrencyToVal = db.find { it.charCode =="HUF"}?.charCode!!
                        db.find { it.charCode =="IDR"}?.name ->nameCurrencyToVal = db.find { it.charCode =="IDR"}?.charCode!!
                        db.find { it.charCode =="INR"}?.name ->nameCurrencyToVal = db.find { it.charCode =="INR"}?.charCode!!
                        db.find { it.charCode =="JPY"}?.name ->nameCurrencyToVal = db.find { it.charCode =="JPY"}?.charCode!!
                        db.find { it.charCode =="KGS"}?.name ->nameCurrencyToVal = db.find { it.charCode =="KGS"}?.charCode!!
                        db.find { it.charCode =="KRW"}?.name ->nameCurrencyToVal = db.find { it.charCode =="KRW"}?.charCode!!
                        db.find { it.charCode =="KZT"}?.name ->nameCurrencyToVal = db.find { it.charCode =="KZT"}?.charCode!!
                        db.find { it.charCode =="MDL"}?.name ->nameCurrencyToVal = db.find { it.charCode =="MDL"}?.charCode!!
                        db.find { it.charCode =="NOK"}?.name ->nameCurrencyToVal = db.find { it.charCode =="NOK"}?.charCode!!
                        db.find { it.charCode =="NZD"}?.name ->nameCurrencyToVal = db.find { it.charCode =="NZD"}?.charCode!!
                        db.find { it.charCode =="PLN"}?.name ->nameCurrencyToVal = db.find { it.charCode =="PLN"}?.charCode!!
                        db.find { it.charCode =="QAR"}?.name ->nameCurrencyToVal = db.find { it.charCode =="QAR"}?.charCode!!
                        db.find { it.charCode =="RON"}?.name ->nameCurrencyToVal = db.find { it.charCode =="RON"}?.charCode!!
                        db.find { it.charCode =="RSD"}?.name ->nameCurrencyToVal = db.find { it.charCode =="RSD"}?.charCode!!
                        db.find { it.charCode =="SEK"}?.name ->nameCurrencyToVal = db.find { it.charCode =="SEK"}?.charCode!!
                        db.find { it.charCode =="SGD"}?.name ->nameCurrencyToVal = db.find { it.charCode =="SGD"}?.charCode!!
                        db.find { it.charCode =="THB"}?.name ->nameCurrencyToVal = db.find { it.charCode =="THB"}?.charCode!!
                        db.find { it.charCode =="TJS"}?.name ->nameCurrencyToVal = db.find { it.charCode =="TJS"}?.charCode!!
                        db.find { it.charCode =="TMT"}?.name ->nameCurrencyToVal = db.find { it.charCode =="TMT"}?.charCode!!
                        db.find { it.charCode =="TRY"}?.name ->nameCurrencyToVal = db.find { it.charCode =="TRY"}?.charCode!!
                        db.find { it.charCode =="UAH"}?.name ->nameCurrencyToVal = db.find { it.charCode =="UAH"}?.charCode!!
                        db.find { it.charCode =="USD"}?.name ->nameCurrencyToVal = db.find { it.charCode =="USD"}?.charCode!!
                        db.find { it.charCode =="UZS"}?.name ->nameCurrencyToVal = db.find { it.charCode =="UZS"}?.charCode!!
                        db.find { it.charCode =="VND"}?.name ->nameCurrencyToVal = db.find { it.charCode =="VND"}?.charCode!!
                        db.find { it.charCode =="ZAR"}?.name ->nameCurrencyToVal = db.find { it.charCode =="ZAR"}?.charCode!!
                    }
                }
            }
        }
    }
}