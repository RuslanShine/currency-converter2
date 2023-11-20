package com.example.currencyconverter.data

import com.example.convertmy.data.ValCurs
import com.example.currencyconverter.data.DAO.CurrenciesDAO
import com.example.currencyconverter.data.entity.Currencies
import com.example.currencyconverter.data.modelData.UniversalCurrency
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject


class DataRepository @Inject constructor(val dataApi: DataApi, val currenciesDao: CurrenciesDAO) {
    val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)

    suspend fun getValues(): ValCurs {
        return dataApi.getValues()
    }

    fun putCurrenciesToDb(currencies: List<Currencies>) {
        scope.launch { currenciesDao.insertAll(currencies) }
    }

    fun getCurrenciesFromDb(): Flow<List<Currencies>> {
        return currenciesDao.getCachedCurrencies()
    }

    private fun UniversalCurrency.mapToDb(): Currencies =
        Currencies(
            charCode = charCode,
            iD = iD,
            name = name,
            nominal = nominal,
            numCode = numCode,
            previous = previous,
            value = value
        )

    private fun UniversalCurrency.mapToDbs(): Currencies =
        Currencies(
            charCode = charCode,
            iD = iD,
            name = name,
            nominal = nominal,
            numCode = numCode,
            previous = previous,
            value = value
        )

    suspend fun getCurrenciesFromApi() {
        val api = dataApi.getValues()
        val database = mutableListOf<Currencies>()
        api.run {
            database.add(valute.aED.mapToDb())
            database.add(valute.aMD.mapToDb())
            database.add(valute.aUD.mapToDb())
            database.add(valute.aZN.mapToDb())
            database.add(valute.bGN.mapToDb())
            database.add(valute.bRL.mapToDb())
            database.add(valute.bYN.mapToDb())
            database.add(valute.cAD.mapToDb())
            database.add(valute.cHF.mapToDb())
            database.add(valute.cNY.mapToDb())
            database.add(valute.cZK.mapToDb())
            database.add(valute.dKK.mapToDb())
            database.add(valute.eGP.mapToDb())
            database.add(valute.eUR.mapToDb())
            database.add(valute.gEL.mapToDb())
            database.add(valute.hKD.mapToDb())
            database.add(valute.hUF.mapToDb())
            database.add(valute.iDR.mapToDb())
            database.add(valute.iNR.mapToDb())
            database.add(valute.jPY.mapToDb())
            database.add(valute.kGS.mapToDb())
            database.add(valute.kRW.mapToDb())
            database.add(valute.kZT.mapToDb())
            database.add(valute.mDL.mapToDb())
            database.add(valute.nOK.mapToDb())
            database.add(valute.nZD.mapToDb())
            database.add(valute.pLN.mapToDb())
            database.add(valute.qAR.mapToDb())
            database.add(valute.rON.mapToDb())
            database.add(valute.rSD.mapToDb())
            database.add(valute.sEK.mapToDb())
            database.add(valute.sGD.mapToDb())
            database.add(valute.tHB.mapToDb())
            database.add(valute.tJS.mapToDb())
            database.add(valute.tMT.mapToDb())
            database.add(valute.tRY.mapToDb())
            database.add(valute.uAH.mapToDb())
            database.add(valute.uSD.mapToDb())
            database.add(valute.uZS.mapToDb())
            database.add(valute.vND.mapToDb())
            database.add(valute.zAR.mapToDb())
        }
        putCurrenciesToDb(database)
    }
}

