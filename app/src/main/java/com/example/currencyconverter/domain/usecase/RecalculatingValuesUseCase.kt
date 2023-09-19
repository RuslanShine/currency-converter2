package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.domain.repository.DataRepositoryImpl

//fun convert(from: String?, to: String?, v: Float): Float {
//    val fromVal: Float = repo.get(from)
//    val toVal: Float = repo.get(to)
//    return fromVal / toVal * v
//}

class RecalculatingValuesUseCase(private val dataRepository: DataRepositoryImpl) {
    private var fromVal: Double = 0.0
    private var toVal: Double = 0.0

     fun execute(param: String): Double {
        val userParamConvert = param.toDouble()
         val resultConvert = fromVal/toVal * userParamConvert
        return resultConvert
    }

    suspend fun monitoringValueToVal(nameCurrencyToVal: String){
        when(nameCurrencyToVal){
            dataRepository.getValues().valute.aED.name-> toVal  = dataRepository.getValues().valute.aED.value
            dataRepository.getValues().valute.aMD.name-> toVal  = dataRepository.getValues().valute.aMD.value
            dataRepository.getValues().valute.aUD.name-> toVal  = dataRepository.getValues().valute.aUD.value
            dataRepository.getValues().valute.aZN.name-> toVal  = dataRepository.getValues().valute.aZN.value
            dataRepository.getValues().valute.bGN.name-> toVal  = dataRepository.getValues().valute.bGN.value
            dataRepository.getValues().valute.bRL.name-> toVal  = dataRepository.getValues().valute.bRL.value
            dataRepository.getValues().valute.bYN.name-> toVal  = dataRepository.getValues().valute.bYN.value
            dataRepository.getValues().valute.cAD.name-> toVal  = dataRepository.getValues().valute.cAD.value
            dataRepository.getValues().valute.cHF.name-> toVal  = dataRepository.getValues().valute.cHF.value
            dataRepository.getValues().valute.cNY.name-> toVal  = dataRepository.getValues().valute.cNY.value
            dataRepository.getValues().valute.cZK.name-> toVal  = dataRepository.getValues().valute.cZK.value
            dataRepository.getValues().valute.dKK.name-> toVal  = dataRepository.getValues().valute.dKK.value
            dataRepository.getValues().valute.eGP.name-> toVal  = dataRepository.getValues().valute.eGP.value
            dataRepository.getValues().valute.eUR.name-> toVal  = dataRepository.getValues().valute.eUR.value
            dataRepository.getValues().valute.gBP.name-> toVal  = dataRepository.getValues().valute.gBP.value
            dataRepository.getValues().valute.gEL.name-> toVal  = dataRepository.getValues().valute.gEL.value
            dataRepository.getValues().valute.hKD.name-> toVal  = dataRepository.getValues().valute.hKD.value
            dataRepository.getValues().valute.hUF.name-> toVal  = dataRepository.getValues().valute.hUF.value
            dataRepository.getValues().valute.iDR.name-> toVal  = dataRepository.getValues().valute.iDR.value
            dataRepository.getValues().valute.iNR.name-> toVal  = dataRepository.getValues().valute.iNR.value
            dataRepository.getValues().valute.jPY.name-> toVal  = dataRepository.getValues().valute.jPY.value
            dataRepository.getValues().valute.kGS.name-> toVal  = dataRepository.getValues().valute.kGS.value
            dataRepository.getValues().valute.kRW.name-> toVal  = dataRepository.getValues().valute.kRW.value
            dataRepository.getValues().valute.kZT.name-> toVal  = dataRepository.getValues().valute.kZT.value
            dataRepository.getValues().valute.mDL.name-> toVal  = dataRepository.getValues().valute.mDL.value
            dataRepository.getValues().valute.nOK.name-> toVal  = dataRepository.getValues().valute.nOK.value
            dataRepository.getValues().valute.nZD.name-> toVal  = dataRepository.getValues().valute.nZD.value
            dataRepository.getValues().valute.pLN.name-> toVal  = dataRepository.getValues().valute.pLN.value
            dataRepository.getValues().valute.qAR.name-> toVal  = dataRepository.getValues().valute.qAR.value
            dataRepository.getValues().valute.rON.name-> toVal  = dataRepository.getValues().valute.rON.value
            dataRepository.getValues().valute.rSD.name-> toVal  = dataRepository.getValues().valute.rSD.value
            dataRepository.getValues().valute.sEK.name-> toVal  = dataRepository.getValues().valute.sEK.value
            dataRepository.getValues().valute.sGD.name-> toVal  = dataRepository.getValues().valute.sGD.value
            dataRepository.getValues().valute.tHB.name-> toVal  = dataRepository.getValues().valute.tHB.value
            dataRepository.getValues().valute.tJS.name-> toVal  = dataRepository.getValues().valute.tJS.value
            dataRepository.getValues().valute.tMT.name-> toVal  = dataRepository.getValues().valute.tMT.value
            dataRepository.getValues().valute.tRY.name-> toVal  = dataRepository.getValues().valute.tRY.value
            dataRepository.getValues().valute.uAH.name-> toVal  = dataRepository.getValues().valute.uAH.value
            dataRepository.getValues().valute.uSD.name-> toVal  = dataRepository.getValues().valute.uSD.value
            dataRepository.getValues().valute.uZS.name-> toVal  = dataRepository.getValues().valute.uZS.value
            dataRepository.getValues().valute.vND.name-> toVal  = dataRepository.getValues().valute.vND.value
            dataRepository.getValues().valute.xDR.name-> toVal  = dataRepository.getValues().valute.xDR.value
            dataRepository.getValues().valute.zAR.name-> toVal  = dataRepository.getValues().valute.zAR.value
        }
    }
    suspend fun monitoringValueFromVal(nameCurrencyFromVal: String) {
        when (nameCurrencyFromVal) {
            dataRepository.getValues().valute.aED.name-> fromVal = dataRepository.getValues().valute.aED.value
            dataRepository.getValues().valute.aMD.name-> fromVal = dataRepository.getValues().valute.aMD.value
            dataRepository.getValues().valute.aUD.name-> fromVal = dataRepository.getValues().valute.aUD.value
            dataRepository.getValues().valute.aZN.name-> fromVal = dataRepository.getValues().valute.aZN.value
            dataRepository.getValues().valute.bGN.name-> fromVal = dataRepository.getValues().valute.bGN.value
            dataRepository.getValues().valute.bRL.name-> fromVal = dataRepository.getValues().valute.bRL.value
            dataRepository.getValues().valute.bYN.name-> fromVal = dataRepository.getValues().valute.bYN.value
            dataRepository.getValues().valute.cAD.name-> fromVal = dataRepository.getValues().valute.cAD.value
            dataRepository.getValues().valute.cHF.name-> fromVal = dataRepository.getValues().valute.cHF.value
            dataRepository.getValues().valute.cNY.name-> fromVal = dataRepository.getValues().valute.cNY.value
            dataRepository.getValues().valute.cZK.name-> fromVal = dataRepository.getValues().valute.cZK.value
            dataRepository.getValues().valute.dKK.name-> fromVal = dataRepository.getValues().valute.dKK.value
            dataRepository.getValues().valute.eGP.name-> fromVal = dataRepository.getValues().valute.eGP.value
            dataRepository.getValues().valute.eUR.name-> fromVal = dataRepository.getValues().valute.eUR.value
            dataRepository.getValues().valute.gBP.name-> fromVal = dataRepository.getValues().valute.gBP.value
            dataRepository.getValues().valute.gEL.name-> fromVal = dataRepository.getValues().valute.gEL.value
            dataRepository.getValues().valute.hKD.name-> fromVal = dataRepository.getValues().valute.hKD.value
            dataRepository.getValues().valute.hUF.name-> fromVal = dataRepository.getValues().valute.hUF.value
            dataRepository.getValues().valute.iDR.name-> fromVal = dataRepository.getValues().valute.iDR.value
            dataRepository.getValues().valute.iNR.name-> fromVal = dataRepository.getValues().valute.iNR.value
            dataRepository.getValues().valute.jPY.name-> fromVal = dataRepository.getValues().valute.jPY.value
            dataRepository.getValues().valute.kGS.name-> fromVal = dataRepository.getValues().valute.kGS.value
            dataRepository.getValues().valute.kRW.name-> fromVal = dataRepository.getValues().valute.kRW.value
            dataRepository.getValues().valute.kZT.name-> fromVal = dataRepository.getValues().valute.kZT.value
            dataRepository.getValues().valute.mDL.name-> fromVal = dataRepository.getValues().valute.mDL.value
            dataRepository.getValues().valute.nOK.name-> fromVal = dataRepository.getValues().valute.nOK.value
            dataRepository.getValues().valute.nZD.name-> fromVal = dataRepository.getValues().valute.nZD.value
            dataRepository.getValues().valute.pLN.name-> fromVal = dataRepository.getValues().valute.pLN.value
            dataRepository.getValues().valute.qAR.name-> fromVal = dataRepository.getValues().valute.qAR.value
            dataRepository.getValues().valute.rON.name-> fromVal = dataRepository.getValues().valute.rON.value
            dataRepository.getValues().valute.rSD.name-> fromVal = dataRepository.getValues().valute.rSD.value
            dataRepository.getValues().valute.sEK.name-> fromVal = dataRepository.getValues().valute.sEK.value
            dataRepository.getValues().valute.sGD.name-> fromVal = dataRepository.getValues().valute.sGD.value
            dataRepository.getValues().valute.tHB.name-> fromVal = dataRepository.getValues().valute.tHB.value
            dataRepository.getValues().valute.tJS.name-> fromVal = dataRepository.getValues().valute.tJS.value
            dataRepository.getValues().valute.tMT.name-> fromVal = dataRepository.getValues().valute.tMT.value
            dataRepository.getValues().valute.tRY.name-> fromVal = dataRepository.getValues().valute.tRY.value
            dataRepository.getValues().valute.uAH.name-> fromVal = dataRepository.getValues().valute.uAH.value
            dataRepository.getValues().valute.uSD.name-> fromVal = dataRepository.getValues().valute.uSD.value
            dataRepository.getValues().valute.uZS.name-> fromVal = dataRepository.getValues().valute.uZS.value
            dataRepository.getValues().valute.vND.name-> fromVal = dataRepository.getValues().valute.vND.value
            dataRepository.getValues().valute.xDR.name-> fromVal = dataRepository.getValues().valute.xDR.value
            dataRepository.getValues().valute.zAR.name-> fromVal = dataRepository.getValues().valute.zAR.value
        }
    }


}