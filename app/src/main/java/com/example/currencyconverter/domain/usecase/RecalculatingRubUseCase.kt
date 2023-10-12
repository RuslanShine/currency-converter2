package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.entity.Currencies
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlin.properties.Delegates

class RecalculatingRubUseCase(private val valuesData: Flow<Currencies>) {
    private lateinit var scope: CoroutineScope

    private var resultAED by Delegates.notNull<Double>()
    private var resultAMD by Delegates.notNull<Double>()
    private var resultAUD by Delegates.notNull<Double>()
    private var resultAZN by Delegates.notNull<Double>()
    private var resultBGN by Delegates.notNull<Double>()
    private var resultBRL by Delegates.notNull<Double>()
    private var resultBYN by Delegates.notNull<Double>()
    private var resultCAD by Delegates.notNull<Double>()
    private var resultCHF by Delegates.notNull<Double>()
    private var resultCNY by Delegates.notNull<Double>()
    private var resultCZK by Delegates.notNull<Double>()
    private var resultDKK by Delegates.notNull<Double>()
    private var resultEGP by Delegates.notNull<Double>()
    private var resultEUR by Delegates.notNull<Double>()
    private var resultGEL by Delegates.notNull<Double>()
    private var resultHKD by Delegates.notNull<Double>()
    private var resultHUF by Delegates.notNull<Double>()
    private var resultIDR by Delegates.notNull<Double>()
    private var resultINR by Delegates.notNull<Double>()
    private var resultJPY by Delegates.notNull<Double>()
    private var resultKGS by Delegates.notNull<Double>()
    private var resultKRW by Delegates.notNull<Double>()
    private var resultKZT by Delegates.notNull<Double>()
    private var resultMDL by Delegates.notNull<Double>()
    private var resultNOK by Delegates.notNull<Double>()
    private var resultNZD by Delegates.notNull<Double>()
    private var resultPLN by Delegates.notNull<Double>()
    private var resultQAR by Delegates.notNull<Double>()
    private var resultRON by Delegates.notNull<Double>()
    private var resultRSD by Delegates.notNull<Double>()
    private var resultSEK by Delegates.notNull<Double>()
    private var resultSGD by Delegates.notNull<Double>()
    private var resultTHB by Delegates.notNull<Double>()
    private var resultTJS by Delegates.notNull<Double>()
    private var resultTMT by Delegates.notNull<Double>()
    private var resultTRY by Delegates.notNull<Double>()
    private var resultUAH by Delegates.notNull<Double>()
    private var resultUSD by Delegates.notNull<Double>()
    private var resultUZS by Delegates.notNull<Double>()
    private var resultVND by Delegates.notNull<Double>()
    private var resultZAR by Delegates.notNull<Double>()

    fun execute(param: String) {
        val userParamsConvert = param.toDouble()
        scope = CoroutineScope(Dispatchers.IO).also { scope ->
            scope.launch {
                valuesData.collect { db ->
                    resultAED = userParamsConvert / db.aED.value * db.aED.nominal
                    resultAMD = userParamsConvert / db.aMD.value * db.aMD.nominal
                    resultAUD = userParamsConvert / db.aUD.value * db.aUD.nominal
                    resultAZN = userParamsConvert / db.aZN.value * db.aZN.nominal
                    resultBGN = userParamsConvert / db.bGN.value * db.bGN.nominal
                    resultBRL = userParamsConvert / db.bRL.value * db.bRL.nominal
                    resultBYN = userParamsConvert / db.bYN.value * db.bYN.nominal
                    resultCAD = userParamsConvert / db.cAD.value * db.cAD.nominal
                    resultCHF = userParamsConvert / db.cHF.value * db.cHF.nominal
                    resultCNY = userParamsConvert / db.cNY.value * db.cNY.nominal
                    resultCZK = userParamsConvert / db.cZK.value * db.cZK.nominal
                    resultDKK = userParamsConvert / db.dKK.value * db.dKK.nominal
                    resultEGP = userParamsConvert / db.eGP.value * db.eGP.nominal
                    resultEUR = userParamsConvert / db.eUR.value * db.eUR.nominal
                    resultGEL = userParamsConvert / db.gEL.value * db.gEL.nominal
                    resultHKD = userParamsConvert / db.hKD.value * db.hKD.nominal
                    resultHUF = userParamsConvert / db.hUF.value * db.hUF.nominal
                    resultIDR = userParamsConvert / db.iDR.value * db.iDR.nominal
                    resultINR = userParamsConvert / db.iNR.value * db.iNR.nominal
                    resultJPY = userParamsConvert / db.jPY.value * db.jPY.nominal
                    resultKGS = userParamsConvert / db.kGS.value * db.kGS.nominal
                    resultKRW = userParamsConvert / db.kRW.value * db.kRW.nominal
                    resultKZT = userParamsConvert / db.kZT.value * db.kZT.nominal
                    resultMDL = userParamsConvert / db.mDL.value * db.mDL.nominal
                    resultNOK = userParamsConvert / db.nOK.value * db.nOK.nominal
                    resultNZD = userParamsConvert / db.nZD.value * db.nZD.nominal
                    resultPLN = userParamsConvert / db.pLN.value * db.pLN.nominal
                    resultQAR = userParamsConvert / db.qAR.value * db.qAR.nominal
                    resultRON = userParamsConvert / db.rON.value * db.rON.nominal
                    resultRSD = userParamsConvert / db.rSD.value * db.rSD.nominal
                    resultSEK = userParamsConvert / db.sEK.value * db.sEK.nominal
                    resultSGD = userParamsConvert / db.sGD.value * db.sGD.nominal
                    resultTHB = userParamsConvert / db.tHB.value * db.tHB.nominal
                    resultTJS = userParamsConvert / db.tJS.value * db.tJS.nominal
                    resultTMT = userParamsConvert / db.tMT.value * db.tMT.nominal
                    resultTRY = userParamsConvert / db.tRY.value * db.tRY.nominal
                    resultUAH = userParamsConvert / db.uAH.value * db.uAH.nominal
                    resultUSD = userParamsConvert / db.uSD.value * db.uSD.nominal
                    resultUZS = userParamsConvert / db.uZS.value * db.uZS.nominal
                    resultVND = userParamsConvert / db.vND.value * db.vND.nominal
                    resultZAR = userParamsConvert / db.zAR.value * db.zAR.nominal

                }
            }
        }
    }

    fun getResultAed(): Double {
        return resultAED
    }

    fun getResultAmd(): Double {
        return resultAMD
    }

    fun getResultAud(): Double {
        return resultAUD
    }

    fun getResultAzn(): Double {
        return resultAZN
    }

    fun getResultBgn(): Double {
        return resultBGN
    }

    fun getResultBrl(): Double {
        return resultBRL
    }

    fun getResultByn(): Double {
        return resultBYN
    }

    fun getResultCad(): Double {
        return resultCAD
    }

    fun getResultChf(): Double {
        return resultCHF
    }

    fun getResultCny(): Double {
        return resultCNY
    }

    fun getResultCzk(): Double {
        return resultCZK
    }

    fun getResultDkk(): Double {
        return resultDKK
    }

    fun getResultEgp(): Double {
        return resultEGP
    }

    fun getResultEur(): Double {
        return resultEUR
    }

    fun getResultGel(): Double {
        return resultGEL
    }

    fun getResultHkd(): Double {
        return resultHKD
    }

    fun getResultHuf(): Double {
        return resultHUF
    }

    fun getResultIdr(): Double {
        return resultIDR
    }

    fun getResultInr(): Double {
        return resultINR
    }

    fun getResultJpy(): Double {
        return resultJPY
    }

    fun getResultKgs(): Double {
        return resultKGS
    }

    fun getResultKrw(): Double {
        return resultKRW
    }

    fun getResultKzt(): Double {
        return resultKZT
    }

    fun getResultMdl(): Double {
        return resultMDL
    }

    fun getResultNok(): Double {
        return resultNOK
    }

    fun getResultNzd(): Double {
        return resultNZD
    }

    fun getResultPln(): Double {
        return resultPLN
    }

    fun getResultQar(): Double {
        return resultQAR
    }

    fun getResultRon(): Double {
        return resultRON
    }

    fun getResultRsd(): Double {
        return resultRSD
    }

    fun getResultSek(): Double {
        return resultSEK
    }

    fun getResultSgd(): Double {
        return resultSGD
    }

    fun getResultThb(): Double {
        return resultTHB
    }

    fun getResultTjs(): Double {
        return resultTJS
    }

    fun getResultTmt(): Double {
        return resultTMT
    }

    fun getResultTry(): Double {
        return resultTRY
    }

    fun getResultUah(): Double {
        return resultUAH
    }

    fun getResultUsd(): Double {
        return resultUSD
    }

    fun getResultUzs(): Double {
        return resultUZS
    }

    fun getResultVnd(): Double {
        return resultVND
    }

    fun getResultZar(): Double {
        return resultZAR
    }

}