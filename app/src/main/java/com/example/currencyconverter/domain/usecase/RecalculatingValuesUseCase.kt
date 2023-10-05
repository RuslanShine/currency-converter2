package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.data.entity.Currencies
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class RecalculatingValuesUseCase(private val valuesData: Flow<Currencies>) {
    private lateinit var scope: CoroutineScope
    private var fromVal: Double = 0.0
    private var toVal: Double = 0.0

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
                        db.aED.name -> toVal = db.aED.value
                        db.aMD.name -> toVal = db.aMD.value
                        db.aUD.name -> toVal = db.aUD.value
                        db.aZN.name -> toVal = db.aZN.value
                        db.bGN.name -> toVal = db.bGN.value
                        db.bRL.name -> toVal = db.bRL.value
                        db.bYN.name -> toVal = db.bYN.value
                        db.cAD.name -> toVal = db.cAD.value
                        db.cHF.name -> toVal = db.cHF.value
                        db.cNY.name -> toVal = db.cNY.value
                        db.cZK.name -> toVal = db.cZK.value
                        db.dKK.name -> toVal = db.dKK.value
                        db.eGP.name -> toVal = db.eGP.value
                        db.eUR.name -> toVal = db.eUR.value
                        db.gBP.name -> toVal = db.gBP.value
                        db.gEL.name -> toVal = db.gEL.value
                        db.hKD.name -> toVal = db.hKD.value
                        db.hUF.name -> toVal = db.hUF.value
                        db.iDR.name -> toVal = db.iDR.value
                        db.iNR.name -> toVal = db.iNR.value
                        db.jPY.name -> toVal = db.jPY.value
                        db.kGS.name -> toVal = db.kGS.value
                        db.kRW.name -> toVal = db.kRW.value
                        db.kZT.name -> toVal = db.kZT.value
                        db.mDL.name -> toVal = db.mDL.value
                        db.nOK.name -> toVal = db.nOK.value
                        db.nZD.name -> toVal = db.nZD.value
                        db.pLN.name -> toVal = db.pLN.value
                        db.qAR.name -> toVal = db.qAR.value
                        db.rON.name -> toVal = db.rON.value
                        db.rSD.name -> toVal = db.rSD.value
                        db.sEK.name -> toVal = db.sEK.value
                        db.sGD.name -> toVal = db.sGD.value
                        db.tHB.name -> toVal = db.tHB.value
                        db.tJS.name -> toVal = db.tJS.value
                        db.tMT.name -> toVal = db.tMT.value
                        db.tRY.name -> toVal = db.tRY.value
                        db.uAH.name -> toVal = db.uAH.value
                        db.uSD.name -> toVal = db.uSD.value
                        db.uZS.name -> toVal = db.uZS.value
                        db.vND.name -> toVal = db.vND.value
                        db.xDR.name -> toVal = db.xDR.value
                        db.zAR.name -> toVal = db.zAR.value
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
                        db.aED.name -> fromVal = db.aED.value
                        db.aMD.name -> fromVal = db.aMD.value
                        db.aUD.name -> fromVal = db.aUD.value
                        db.aZN.name -> fromVal = db.aZN.value
                        db.bGN.name -> fromVal = db.bGN.value
                        db.bRL.name -> fromVal = db.bRL.value
                        db.bYN.name -> fromVal = db.bYN.value
                        db.cAD.name -> fromVal = db.cAD.value
                        db.cHF.name -> fromVal = db.cHF.value
                        db.cNY.name -> fromVal = db.cNY.value
                        db.cZK.name -> fromVal = db.cZK.value
                        db.dKK.name -> fromVal = db.dKK.value
                        db.eGP.name -> fromVal = db.eGP.value
                        db.eUR.name -> fromVal = db.eUR.value
                        db.gBP.name -> fromVal = db.gBP.value
                        db.gEL.name -> fromVal = db.gEL.value
                        db.hKD.name -> fromVal = db.hKD.value
                        db.hUF.name -> fromVal = db.hUF.value
                        db.iDR.name -> fromVal = db.iDR.value
                        db.iNR.name -> fromVal = db.iNR.value
                        db.jPY.name -> fromVal = db.jPY.value
                        db.kGS.name -> fromVal = db.kGS.value
                        db.kRW.name -> fromVal = db.kRW.value
                        db.kZT.name -> fromVal = db.kZT.value
                        db.mDL.name -> fromVal = db.mDL.value
                        db.nOK.name -> fromVal = db.nOK.value
                        db.nZD.name -> fromVal = db.nZD.value
                        db.pLN.name -> fromVal = db.pLN.value
                        db.qAR.name -> fromVal = db.qAR.value
                        db.rON.name -> fromVal = db.rON.value
                        db.rSD.name -> fromVal = db.rSD.value
                        db.sEK.name -> fromVal = db.sEK.value
                        db.sGD.name -> fromVal = db.sGD.value
                        db.tHB.name -> fromVal = db.tHB.value
                        db.tJS.name -> fromVal = db.tJS.value
                        db.tMT.name -> fromVal = db.tMT.value
                        db.tRY.name -> fromVal = db.tRY.value
                        db.uAH.name -> fromVal = db.uAH.value
                        db.uSD.name -> fromVal = db.uSD.value
                        db.uZS.name -> fromVal = db.uZS.value
                        db.vND.name -> fromVal = db.vND.value
                        db.xDR.name -> fromVal = db.xDR.value
                        db.zAR.name -> fromVal = db.zAR.value
                    }
                }
            }
        }
    }
}

