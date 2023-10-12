package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.entity.Currencies
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import kotlin.properties.Delegates

class SetCharCodeValuesUseCase(private val valuesData: Flow<Currencies>) {
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
                        db.aED.name -> nameCurrency = db.aED.charCode
                        db.aMD.name -> nameCurrency = db.aMD.charCode
                        db.aUD.name -> nameCurrency = db.aUD.charCode
                        db.aZN.name -> nameCurrency = db.aZN.charCode
                        db.bGN.name -> nameCurrency = db.bGN.charCode
                        db.bRL.name -> nameCurrency = db.bRL.charCode
                        db.bYN.name -> nameCurrency = db.bYN.charCode
                        db.cAD.name -> nameCurrency = db.cAD.charCode
                        db.cHF.name -> nameCurrency = db.cHF.charCode
                        db.cNY.name -> nameCurrency = db.cNY.charCode
                        db.cZK.name -> nameCurrency = db.cZK.charCode
                        db.dKK.name -> nameCurrency = db.dKK.charCode
                        db.eGP.name -> nameCurrency = db.eGP.charCode
                        db.eUR.name -> nameCurrency = db.eUR.charCode
                        db.gBP.name -> nameCurrency = db.gBP.charCode
                        db.gEL.name -> nameCurrency = db.gEL.charCode
                        db.hKD.name -> nameCurrency = db.hKD.charCode
                        db.hUF.name -> nameCurrency = db.hUF.charCode
                        db.iDR.name -> nameCurrency = db.iDR.charCode
                        db.iNR.name -> nameCurrency = db.iNR.charCode
                        db.jPY.name -> nameCurrency = db.jPY.charCode
                        db.kGS.name -> nameCurrency = db.kGS.charCode
                        db.kRW.name -> nameCurrency = db.kRW.charCode
                        db.kZT.name -> nameCurrency = db.kZT.charCode
                        db.mDL.name -> nameCurrency = db.mDL.charCode
                        db.nOK.name -> nameCurrency = db.nOK.charCode
                        db.nZD.name -> nameCurrency = db.nZD.charCode
                        db.pLN.name -> nameCurrency = db.pLN.charCode
                        db.qAR.name -> nameCurrency = db.qAR.charCode
                        db.rON.name -> nameCurrency = db.rON.charCode
                        db.rSD.name -> nameCurrency = db.rSD.charCode
                        db.sEK.name -> nameCurrency = db.sEK.charCode
                        db.sGD.name -> nameCurrency = db.sGD.charCode
                        db.tHB.name -> nameCurrency = db.tHB.charCode
                        db.tJS.name -> nameCurrency = db.tJS.charCode
                        db.tMT.name -> nameCurrency = db.tMT.charCode
                        db.tRY.name -> nameCurrency = db.tRY.charCode
                        db.uAH.name -> nameCurrency = db.uAH.charCode
                        db.uSD.name -> nameCurrency = db.uSD.charCode
                        db.uZS.name -> nameCurrency = db.uZS.charCode
                        db.vND.name -> nameCurrency = db.vND.charCode
                        db.xDR.name -> nameCurrency = db.xDR.charCode
                        db.zAR.name -> nameCurrency = db.zAR.charCode
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
                        db.aED.name -> nameCurrencyToVal = db.aED.charCode
                        db.aMD.name -> nameCurrencyToVal = db.aMD.charCode
                        db.aUD.name -> nameCurrencyToVal = db.aUD.charCode
                        db.aZN.name -> nameCurrencyToVal = db.aZN.charCode
                        db.bGN.name -> nameCurrencyToVal = db.bGN.charCode
                        db.bRL.name -> nameCurrencyToVal = db.bRL.charCode
                        db.bYN.name -> nameCurrencyToVal = db.bYN.charCode
                        db.cAD.name -> nameCurrencyToVal = db.cAD.charCode
                        db.cHF.name -> nameCurrencyToVal = db.cHF.charCode
                        db.cNY.name -> nameCurrencyToVal = db.cNY.charCode
                        db.cZK.name -> nameCurrencyToVal = db.cZK.charCode
                        db.dKK.name -> nameCurrencyToVal = db.dKK.charCode
                        db.eGP.name -> nameCurrencyToVal = db.eGP.charCode
                        db.eUR.name -> nameCurrencyToVal = db.eUR.charCode
                        db.gBP.name -> nameCurrencyToVal = db.gBP.charCode
                        db.gEL.name -> nameCurrencyToVal = db.gEL.charCode
                        db.hKD.name -> nameCurrencyToVal = db.hKD.charCode
                        db.hUF.name -> nameCurrencyToVal = db.hUF.charCode
                        db.iDR.name -> nameCurrencyToVal = db.iDR.charCode
                        db.iNR.name -> nameCurrencyToVal = db.iNR.charCode
                        db.jPY.name -> nameCurrencyToVal = db.jPY.charCode
                        db.kGS.name -> nameCurrencyToVal = db.kGS.charCode
                        db.kRW.name -> nameCurrencyToVal = db.kRW.charCode
                        db.kZT.name -> nameCurrencyToVal = db.kZT.charCode
                        db.mDL.name -> nameCurrencyToVal = db.mDL.charCode
                        db.nOK.name -> nameCurrencyToVal = db.nOK.charCode
                        db.nZD.name -> nameCurrencyToVal = db.nZD.charCode
                        db.pLN.name -> nameCurrencyToVal = db.pLN.charCode
                        db.qAR.name -> nameCurrencyToVal = db.qAR.charCode
                        db.rON.name -> nameCurrencyToVal = db.rON.charCode
                        db.rSD.name -> nameCurrencyToVal = db.rSD.charCode
                        db.sEK.name -> nameCurrencyToVal = db.sEK.charCode
                        db.sGD.name -> nameCurrencyToVal = db.sGD.charCode
                        db.tHB.name -> nameCurrencyToVal = db.tHB.charCode
                        db.tJS.name -> nameCurrencyToVal = db.tJS.charCode
                        db.tMT.name -> nameCurrencyToVal = db.tMT.charCode
                        db.tRY.name -> nameCurrencyToVal = db.tRY.charCode
                        db.uAH.name -> nameCurrencyToVal = db.uAH.charCode
                        db.uSD.name -> nameCurrencyToVal = db.uSD.charCode
                        db.uZS.name -> nameCurrencyToVal = db.uZS.charCode
                        db.vND.name -> nameCurrencyToVal = db.vND.charCode
                        db.xDR.name -> nameCurrencyToVal = db.xDR.charCode
                        db.zAR.name -> nameCurrencyToVal = db.zAR.charCode
                    }
                }
            }
        }
    }


}