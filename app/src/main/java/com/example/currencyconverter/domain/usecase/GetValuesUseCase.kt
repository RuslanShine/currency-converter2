package com.example.currencyconverter.domain.usecase

import com.example.currencyconverter.domain.repository.DataRepositoryImpl

class GetValuesUseCase(private val dataRepository: DataRepositoryImpl) {
    var point: Double = 0.0

    suspend fun execute(param: String): Double {
        val userParamConvert = param.toDouble()
        return userParamConvert * point
    }


    suspend fun getMyValute(myValute: String) {
        when (myValute) {
            dataRepository.getValues().valute.aED.name-> point = dataRepository.getValues().valute.aED.value
            dataRepository.getValues().valute.aMD.name-> point = dataRepository.getValues().valute.aMD.value
            dataRepository.getValues().valute.aUD.name-> point = dataRepository.getValues().valute.aUD.value
            dataRepository.getValues().valute.aZN.name-> point = dataRepository.getValues().valute.aZN.value
            dataRepository.getValues().valute.bGN.name-> point = dataRepository.getValues().valute.bGN.value
            dataRepository.getValues().valute.bRL.name-> point = dataRepository.getValues().valute.bRL.value
            dataRepository.getValues().valute.bYN.name-> point = dataRepository.getValues().valute.bYN.value
            dataRepository.getValues().valute.cAD.name-> point = dataRepository.getValues().valute.cAD.value
            dataRepository.getValues().valute.cHF.name-> point = dataRepository.getValues().valute.cHF.value
            dataRepository.getValues().valute.cNY.name-> point = dataRepository.getValues().valute.cNY.value
            dataRepository.getValues().valute.cZK.name-> point = dataRepository.getValues().valute.cZK.value
            dataRepository.getValues().valute.dKK.name-> point = dataRepository.getValues().valute.dKK.value
            dataRepository.getValues().valute.eGP.name-> point = dataRepository.getValues().valute.eGP.value
            dataRepository.getValues().valute.eUR.name-> point = dataRepository.getValues().valute.eUR.value
            dataRepository.getValues().valute.gBP.name-> point = dataRepository.getValues().valute.gBP.value
            dataRepository.getValues().valute.gEL.name-> point = dataRepository.getValues().valute.gEL.value
            dataRepository.getValues().valute.hKD.name-> point = dataRepository.getValues().valute.hKD.value
            dataRepository.getValues().valute.hUF.name-> point = dataRepository.getValues().valute.hUF.value
            dataRepository.getValues().valute.iDR.name-> point = dataRepository.getValues().valute.iDR.value
            dataRepository.getValues().valute.iNR.name-> point = dataRepository.getValues().valute.iNR.value
            dataRepository.getValues().valute.jPY.name-> point = dataRepository.getValues().valute.jPY.value
            dataRepository.getValues().valute.kGS.name-> point = dataRepository.getValues().valute.kGS.value
            dataRepository.getValues().valute.kRW.name-> point = dataRepository.getValues().valute.kRW.value
            dataRepository.getValues().valute.kZT.name-> point = dataRepository.getValues().valute.kZT.value
            dataRepository.getValues().valute.mDL.name-> point = dataRepository.getValues().valute.mDL.value
            dataRepository.getValues().valute.nOK.name-> point = dataRepository.getValues().valute.nOK.value
            dataRepository.getValues().valute.nZD.name-> point = dataRepository.getValues().valute.nZD.value
            dataRepository.getValues().valute.pLN.name-> point = dataRepository.getValues().valute.pLN.value
            dataRepository.getValues().valute.qAR.name-> point = dataRepository.getValues().valute.qAR.value
            dataRepository.getValues().valute.rON.name-> point = dataRepository.getValues().valute.rON.value
            dataRepository.getValues().valute.rSD.name-> point = dataRepository.getValues().valute.rSD.value
            dataRepository.getValues().valute.sEK.name-> point = dataRepository.getValues().valute.sEK.value
            dataRepository.getValues().valute.sGD.name-> point = dataRepository.getValues().valute.sGD.value
            dataRepository.getValues().valute.tHB.name-> point = dataRepository.getValues().valute.tHB.value
            dataRepository.getValues().valute.tJS.name-> point = dataRepository.getValues().valute.tJS.value
            dataRepository.getValues().valute.tMT.name-> point = dataRepository.getValues().valute.tMT.value
            dataRepository.getValues().valute.tRY.name-> point = dataRepository.getValues().valute.tRY.value
            dataRepository.getValues().valute.uAH.name-> point = dataRepository.getValues().valute.uAH.value
            dataRepository.getValues().valute.uSD.name-> point = dataRepository.getValues().valute.uSD.value
            dataRepository.getValues().valute.uZS.name-> point = dataRepository.getValues().valute.uZS.value
            dataRepository.getValues().valute.vND.name-> point = dataRepository.getValues().valute.vND.value
            dataRepository.getValues().valute.xDR.name-> point = dataRepository.getValues().valute.xDR.value
            dataRepository.getValues().valute.zAR.name-> point = dataRepository.getValues().valute.zAR.value
        }
    }


}