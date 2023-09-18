package com.example.currencyconverter.domain.usecase

import com.example.convertmy.data.ValCurs
import com.example.currencyconverter.domain.repository.DataRepositoryImpl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class RecalculatingValuesUseCase (private val dataRepository: DataRepositoryImpl){

        private var nameCurrency  = "xxx"

    fun execute():String{
        return nameCurrency
    }

    suspend fun monitoringValue(nameCurrencyScreen: String) {
        when(nameCurrencyScreen){
                dataRepository.getValues().valute.aED.name-> nameCurrency = dataRepository.getValues().valute.aED.charCode
                dataRepository.getValues().valute.aMD.name-> nameCurrency = dataRepository.getValues().valute.aMD.charCode
                dataRepository.getValues().valute.aUD.name-> nameCurrency = dataRepository.getValues().valute.aUD.charCode
                dataRepository.getValues().valute.aZN.name-> nameCurrency = dataRepository.getValues().valute.aZN.charCode
                dataRepository.getValues().valute.bGN.name-> nameCurrency = dataRepository.getValues().valute.bGN.charCode
                dataRepository.getValues().valute.bRL.name-> nameCurrency = dataRepository.getValues().valute.bRL.charCode
                dataRepository.getValues().valute.bYN.name-> nameCurrency = dataRepository.getValues().valute.bYN.charCode
                dataRepository.getValues().valute.cAD.name-> nameCurrency = dataRepository.getValues().valute.cAD.charCode
                dataRepository.getValues().valute.cHF.name-> nameCurrency = dataRepository.getValues().valute.cHF.charCode
                dataRepository.getValues().valute.cNY.name-> nameCurrency = dataRepository.getValues().valute.cNY.charCode
                dataRepository.getValues().valute.cZK.name-> nameCurrency = dataRepository.getValues().valute.cZK.charCode
                dataRepository.getValues().valute.dKK.name-> nameCurrency = dataRepository.getValues().valute.dKK.charCode
                dataRepository.getValues().valute.eGP.name-> nameCurrency = dataRepository.getValues().valute.eGP.charCode
                dataRepository.getValues().valute.eUR.name-> nameCurrency = dataRepository.getValues().valute.eUR.charCode
                dataRepository.getValues().valute.gBP.name-> nameCurrency = dataRepository.getValues().valute.gBP.charCode
                dataRepository.getValues().valute.gEL.name-> nameCurrency = dataRepository.getValues().valute.gEL.charCode
                dataRepository.getValues().valute.hKD.name-> nameCurrency = dataRepository.getValues().valute.hKD.charCode
                dataRepository.getValues().valute.hUF.name-> nameCurrency = dataRepository.getValues().valute.hUF.charCode
                dataRepository.getValues().valute.iDR.name-> nameCurrency = dataRepository.getValues().valute.iDR.charCode
                dataRepository.getValues().valute.iNR.name-> nameCurrency = dataRepository.getValues().valute.iNR.charCode
                dataRepository.getValues().valute.jPY.name-> nameCurrency = dataRepository.getValues().valute.jPY.charCode
                dataRepository.getValues().valute.kGS.name-> nameCurrency = dataRepository.getValues().valute.kGS.charCode
                dataRepository.getValues().valute.kRW.name-> nameCurrency = dataRepository.getValues().valute.kRW.charCode
                dataRepository.getValues().valute.kZT.name-> nameCurrency = dataRepository.getValues().valute.kZT.charCode
                dataRepository.getValues().valute.mDL.name-> nameCurrency = dataRepository.getValues().valute.mDL.charCode
                dataRepository.getValues().valute.nOK.name-> nameCurrency = dataRepository.getValues().valute.nOK.charCode
                dataRepository.getValues().valute.nZD.name-> nameCurrency = dataRepository.getValues().valute.nZD.charCode
                dataRepository.getValues().valute.pLN.name-> nameCurrency = dataRepository.getValues().valute.pLN.charCode
                dataRepository.getValues().valute.qAR.name-> nameCurrency = dataRepository.getValues().valute.qAR.charCode
                dataRepository.getValues().valute.rON.name-> nameCurrency = dataRepository.getValues().valute.rON.charCode
                dataRepository.getValues().valute.rSD.name-> nameCurrency = dataRepository.getValues().valute.rSD.charCode
                dataRepository.getValues().valute.sEK.name-> nameCurrency = dataRepository.getValues().valute.sEK.charCode
                dataRepository.getValues().valute.sGD.name-> nameCurrency = dataRepository.getValues().valute.sGD.charCode
                dataRepository.getValues().valute.tHB.name-> nameCurrency = dataRepository.getValues().valute.tHB.charCode
                dataRepository.getValues().valute.tJS.name-> nameCurrency = dataRepository.getValues().valute.tJS.charCode
                dataRepository.getValues().valute.tMT.name-> nameCurrency = dataRepository.getValues().valute.tMT.charCode
                dataRepository.getValues().valute.tRY.name-> nameCurrency = dataRepository.getValues().valute.tRY.charCode
                dataRepository.getValues().valute.uAH.name-> nameCurrency = dataRepository.getValues().valute.uAH.charCode
                dataRepository.getValues().valute.uSD.name-> nameCurrency = dataRepository.getValues().valute.uSD.charCode
                dataRepository.getValues().valute.uZS.name-> nameCurrency = dataRepository.getValues().valute.uZS.charCode
                dataRepository.getValues().valute.vND.name-> nameCurrency = dataRepository.getValues().valute.vND.charCode
                dataRepository.getValues().valute.xDR.name-> nameCurrency = dataRepository.getValues().valute.xDR.charCode
                dataRepository.getValues().valute.zAR.name-> nameCurrency = dataRepository.getValues().valute.zAR.charCode
        }
    }
}