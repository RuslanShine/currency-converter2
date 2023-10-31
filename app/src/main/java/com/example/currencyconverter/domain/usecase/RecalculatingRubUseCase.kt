package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.ItemAnalyticsModel
import com.example.currencyconverter.data.entity.Currencies
import com.example.currencyconverter.domain.usecase.ParametersСurrency.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlin.properties.Delegates

class RecalculatingRubUseCase(private val valuesData: Flow<List<Currencies>>) {
    private lateinit var scope: CoroutineScope




    private val resulTest = mutableListOf<Double>()

//    private var resultAED by Delegates.notNull<Double>()
//    private var resultAMD by Delegates.notNull<Double>()
//    private var resultAUD by Delegates.notNull<Double>()
//    private var resultAZN by Delegates.notNull<Double>()
//    private var resultBGN by Delegates.notNull<Double>()
//    private var resultBRL by Delegates.notNull<Double>()
//    private var resultBYN by Delegates.notNull<Double>()
//    private var resultCAD by Delegates.notNull<Double>()
//    private var resultCHF by Delegates.notNull<Double>()
//    private var resultCNY by Delegates.notNull<Double>()
//    private var resultCZK by Delegates.notNull<Double>()
//    private var resultDKK by Delegates.notNull<Double>()
//    private var resultEGP by Delegates.notNull<Double>()
//    private var resultEUR by Delegates.notNull<Double>()
//    private var resultGEL by Delegates.notNull<Double>()
//    private var resultHKD by Delegates.notNull<Double>()
//    private var resultHUF by Delegates.notNull<Double>()
//    private var resultIDR by Delegates.notNull<Double>()
//    private var resultINR by Delegates.notNull<Double>()
//    private var resultJPY by Delegates.notNull<Double>()
//    private var resultKGS by Delegates.notNull<Double>()
//    private var resultKRW by Delegates.notNull<Double>()
//    private var resultKZT by Delegates.notNull<Double>()
//    private var resultMDL by Delegates.notNull<Double>()
//    private var resultNOK by Delegates.notNull<Double>()
//    private var resultNZD by Delegates.notNull<Double>()
//    private var resultPLN by Delegates.notNull<Double>()
//    private var resultQAR by Delegates.notNull<Double>()
//    private var resultRON by Delegates.notNull<Double>()
//    private var resultRSD by Delegates.notNull<Double>()
//    private var resultSEK by Delegates.notNull<Double>()
//    private var resultSGD by Delegates.notNull<Double>()
//    private var resultTHB by Delegates.notNull<Double>()
//    private var resultTJS by Delegates.notNull<Double>()
//    private var resultTMT by Delegates.notNull<Double>()
//    private var resultTRY by Delegates.notNull<Double>()
//    private var resultUAH by Delegates.notNull<Double>()
//    private var resultUSD by Delegates.notNull<Double>()
//    private var resultUZS by Delegates.notNull<Double>()
//    private var resultVND by Delegates.notNull<Double>()
//    private var resultZAR by Delegates.notNull<Double>()

//    fun rubleСonversion(db: List<Currencies>, userParamsConvert: Double): Double {
//        return userParamsConvert / db.find { it.name == nameCurrency }?.value!! * db.find { it.name == nameCurrency }?.nominal!!
//    }

    fun execute(param: String) {
        val userParamsConvert = param.toDouble()
        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                valuesData.collect { db ->
                    resulTest.add(AED.rubleСonversion(db, userParamsConvert))
                    resulTest.add(AMD.rubleСonversion(db, userParamsConvert))
                    resulTest.add(AUD.rubleСonversion(db, userParamsConvert))
//                    rezulTEst.clear()

//                    resultAED = AED.rubleСonversion(db, userParamsConvert)
//                    resultAMD = AMD.rubleСonversion(db, userParamsConvert)
//                    resultAUD = AUD.rubleСonversion(db, userParamsConvert)
//                    resultAZN = AZN.rubleСonversion(db, userParamsConvert)
//                    resultBGN = BGN.rubleСonversion(db, userParamsConvert)
//                    resultBRL = BRL.rubleСonversion(db, userParamsConvert)
//                    resultBYN = BYN.rubleСonversion(db, userParamsConvert)
//                    resultCAD = CAD.rubleСonversion(db, userParamsConvert)
//                    resultCHF = CHF.rubleСonversion(db, userParamsConvert)
//                    resultCNY = CNY.rubleСonversion(db, userParamsConvert)
//                    resultCZK = CZK.rubleСonversion(db, userParamsConvert)
//                    resultDKK = DKK.rubleСonversion(db, userParamsConvert)
//                    resultEGP = EGP.rubleСonversion(db, userParamsConvert)
//                    resultEUR = EUR.rubleСonversion(db, userParamsConvert)
//                    resultGEL = GEL.rubleСonversion(db, userParamsConvert)
//                    resultHKD = HKD.rubleСonversion(db, userParamsConvert)
//                    resultHUF = HUF.rubleСonversion(db, userParamsConvert)
//                    resultIDR = IDR.rubleСonversion(db, userParamsConvert)
//                    resultINR = INR.rubleСonversion(db, userParamsConvert)
//                    resultJPY = JPY.rubleСonversion(db, userParamsConvert)
//                    resultKGS = KGS.rubleСonversion(db, userParamsConvert)
//                    resultKRW = KRW.rubleСonversion(db, userParamsConvert)
//                    resultKZT = KZT.rubleСonversion(db, userParamsConvert)
//                    resultMDL = MDL.rubleСonversion(db, userParamsConvert)
//                    resultNOK = NOK.rubleСonversion(db, userParamsConvert)
//                    resultNZD = NZD.rubleСonversion(db, userParamsConvert)
//                    resultPLN = PLN.rubleСonversion(db, userParamsConvert)
//                    resultQAR = QAR.rubleСonversion(db, userParamsConvert)
//                    resultRON = RON.rubleСonversion(db, userParamsConvert)
//                    resultRSD = RSD.rubleСonversion(db, userParamsConvert)
//                    resultSEK = SEK.rubleСonversion(db, userParamsConvert)
//                    resultSGD = SGD.rubleСonversion(db, userParamsConvert)
//                    resultTHB = THB.rubleСonversion(db, userParamsConvert)
//                    resultTJS = TJS.rubleСonversion(db, userParamsConvert)
//                    resultTMT = TMT.rubleСonversion(db, userParamsConvert)
//                    resultTRY = TRY.rubleСonversion(db, userParamsConvert)
//                    resultUAH = UAH.rubleСonversion(db, userParamsConvert)
//                    resultUSD = USD.rubleСonversion(db, userParamsConvert)
//                    resultUZS = UZS.rubleСonversion(db, userParamsConvert)
//                    resultVND = VND.rubleСonversion(db, userParamsConvert)
//                    resultZAR = ZAR.rubleСonversion(db, userParamsConvert)
                }
            }
        }
    }

fun testRes():List<Double>{
    return resulTest
}

//    fun getResultAed(): Double {
//        return resultAED
//    }

//    fun getResultAmd(): Double {
//        return resultAMD
//    }
//
//    fun getResultAud(): Double {
//        return resultAUD
//    }
//
//    fun getResultAzn(): Double {
//        return resultAZN
//    }
//
//    fun getResultBgn(): Double {
//        return resultBGN
//    }
//
//    fun getResultBrl(): Double {
//        return resultBRL
//    }
//
//    fun getResultByn(): Double {
//        return resultBYN
//    }
//
//    fun getResultCad(): Double {
//        return resultCAD
//    }
//
//    fun getResultChf(): Double {
//        return resultCHF
//    }
//
//    fun getResultCny(): Double {
//        return resultCNY
//    }
//
//    fun getResultCzk(): Double {
//        return resultCZK
//    }
//
//    fun getResultDkk(): Double {
//        return resultDKK
//    }
//
//    fun getResultEgp(): Double {
//        return resultEGP
//    }
//
//    fun getResultEur(): Double {
//        return resultEUR
//    }
//
//    fun getResultGel(): Double {
//        return resultGEL
//    }
//
//    fun getResultHkd(): Double {
//        return resultHKD
//    }
//
//    fun getResultHuf(): Double {
//        return resultHUF
//    }
//
//    fun getResultIdr(): Double {
//        return resultIDR
//    }
//
//    fun getResultInr(): Double {
//        return resultINR
//    }
//
//    fun getResultJpy(): Double {
//        return resultJPY
//    }
//
//    fun getResultKgs(): Double {
//        return resultKGS
//    }
//
//    fun getResultKrw(): Double {
//        return resultKRW
//    }
//
//    fun getResultKzt(): Double {
//        return resultKZT
//    }
//
//    fun getResultMdl(): Double {
//        return resultMDL
//    }
//
//    fun getResultNok(): Double {
//        return resultNOK
//    }
//
//    fun getResultNzd(): Double {
//        return resultNZD
//    }
//
//    fun getResultPln(): Double {
//        return resultPLN
//    }
//
//    fun getResultQar(): Double {
//        return resultQAR
//    }
//
//    fun getResultRon(): Double {
//        return resultRON
//    }
//
//    fun getResultRsd(): Double {
//        return resultRSD
//    }
//
//    fun getResultSek(): Double {
//        return resultSEK
//    }
//
//    fun getResultSgd(): Double {
//        return resultSGD
//    }
//
//    fun getResultThb(): Double {
//        return resultTHB
//    }
//
//    fun getResultTjs(): Double {
//        return resultTJS
//    }
//
//    fun getResultTmt(): Double {
//        return resultTMT
//    }
//
//    fun getResultTry(): Double {
//        return resultTRY
//    }
//
//    fun getResultUah(): Double {
//        return resultUAH
//    }
//
//    fun getResultUsd(): Double {
//        return resultUSD
//    }
//
//    fun getResultUzs(): Double {
//        return resultUZS
//    }
//
//    fun getResultVnd(): Double {
//        return resultVND
//    }
//
//    fun getResultZar(): Double {
//        return resultZAR
//    }
}