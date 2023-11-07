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
import javax.inject.Singleton


@Singleton
class DataRepository @Inject constructor(private val currenciesDao: CurrenciesDAO) {
    val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)

    @Inject
    lateinit var dataApi: DataApi

    suspend fun getValues(): ValCurs {
        return dataApi.getValues()
    }

    //  кладем список в БД
    fun putCurrenciesToDb(currencies: List<Currencies>) {
        scope.launch { currenciesDao.insertAll(currencies) }
    }

    // забирает все из БД
    fun getCurrenciesFromDB(): Flow<List<Currencies>> {
        return currenciesDao.getCachedCurrencies()
    }

    private fun UniversalCurrency.maptodb(): Currencies =
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
        val db = mutableListOf<Currencies>()

        api.run {
            db.add(valute.aED.maptodb())
            db.add(valute.aMD.maptodb())
            db.add(valute.aUD.maptodb())
            db.add(valute.aZN.maptodb())
            db.add(valute.bGN.maptodb())
            db.add(valute.bRL.maptodb())
            db.add(valute.bYN.maptodb())
            db.add(valute.cAD.maptodb())
            db.add(valute.cHF.maptodb())
            db.add(valute.cNY.maptodb())
            db.add(valute.cZK.maptodb())
            db.add(valute.dKK.maptodb())
            db.add(valute.eGP.maptodb())
            db.add(valute.eUR.maptodb())
            db.add(valute.gEL.maptodb())
            db.add(valute.hKD.maptodb())
            db.add(valute.hUF.maptodb())
            db.add(valute.iDR.maptodb())
            db.add(valute.iNR.maptodb())
            db.add(valute.jPY.maptodb())
            db.add(valute.kGS.maptodb())
            db.add(valute.kRW.maptodb())
            db.add(valute.kZT.maptodb())
            db.add(valute.mDL.maptodb())
            db.add(valute.nOK.maptodb())
            db.add(valute.nZD.maptodb())
            db.add(valute.pLN.maptodb())
            db.add(valute.qAR.maptodb())
            db.add(valute.rON.maptodb())
            db.add(valute.rSD.maptodb())
            db.add(valute.sEK.maptodb())
            db.add(valute.sGD.maptodb())
            db.add(valute.tHB.maptodb())
            db.add(valute.tJS.maptodb())
            db.add(valute.tMT.maptodb())
            db.add(valute.tRY.maptodb())
            db.add(valute.uAH.maptodb())
            db.add(valute.uSD.maptodb())
            db.add(valute.uZS.maptodb())
            db.add(valute.vND.maptodb())
            db.add(valute.zAR.maptodb())
        }
        putCurrenciesToDb(db)
    }
}

