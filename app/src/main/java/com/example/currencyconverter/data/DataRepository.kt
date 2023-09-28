package com.example.currencyconverter.data

import androidx.room.Room
import com.example.convertmy.data.ValCurs
import com.example.convertmy.data.Valute
import com.example.currencyconverter.data.DAO.CurrenciesDAO
import com.example.currencyconverter.data.db.CurrenciesDatabase
import com.example.currencyconverter.data.entity.Currencies
import com.example.currencyconverter.viewModel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.qualifiers.ApplicationContext
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.Executors
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class DataRepository @Inject constructor(private val currenciesDao: CurrenciesDAO) {


    @Inject
    lateinit var dataApi: DataApi


    suspend fun getValues(): ValCurs {
        return dataApi.getValues()
    }

    //  кладем список в БД
    fun putToDb(currencies: List<Currencies>) {
        Executors.newSingleThreadExecutor().execute() {
            currenciesDao.insertAll(currencies)
        }
    }

    // забирает все из БД
    fun getAllFromDB(): List<Currencies> {
        return currenciesDao.getCachedCurrencies()
    }


    suspend fun getCurrenciesFromApi(callback: HomeViewModel.ApiCallback) {
        val api = dataApi.getValues()

        val listDB = mutableListOf<Currencies>(
            Currencies(
                date = api.date,
                previousDate = api.previousDate,
                timestamp = api.timestamp,
                previousURL = api.previousURL,
                aED = api.valute.aED,
                aMD = api.valute.aMD,
                aUD = api.valute.aUD,
                aZN = api.valute.aZN,
                bGN = api.valute.bGN,
                bRL = api.valute.bRL,
                bYN = api.valute.bYN,
                cAD = api.valute.cAD,
                cHF = api.valute.cHF,
                cNY = api.valute.cNY,
                cZK = api.valute.cZK,
                dKK = api.valute.dKK,
                eGP = api.valute.eGP,
                eUR = api.valute.eUR,
                gBP = api.valute.gBP,
                gEL = api.valute.gEL,
                hKD = api.valute.hKD,
                hUF = api.valute.hUF,
                iDR = api.valute.iDR,
                iNR = api.valute.iNR,
                jPY = api.valute.jPY,
                kGS = api.valute.kGS,
                kRW = api.valute.kRW,
                kZT = api.valute.kZT,
                mDL = api.valute.mDL,
                nOK = api.valute.nOK,
                nZD = api.valute.nZD,
                pLN = api.valute.pLN,
                qAR = api.valute.qAR,
                rON = api.valute.rON,
                rSD = api.valute.rSD,
                sEK = api.valute.sEK,
                sGD = api.valute.sGD,
                tHB = api.valute.tHB,
                tJS = api.valute.tJS,
                tMT = api.valute.tMT,
                tRY = api.valute.tRY,
                uAH = api.valute.uAH,
                uSD = api.valute.uSD,
                uZS = api.valute.uZS,
                vND = api.valute.vND,
                xDR = api.valute.xDR,
                zAR = api.valute.zAR
            )
        )
        putToDb(listDB)

        object : Callback<Valute> {
            override fun onResponse(call: Call<Valute>, response: Response<Valute>) {
                putToDb(listDB)
                callback.onSuccess(listDB)
            }

            override fun onFailure(call: Call<Valute>, t: Throwable) {
                callback.onFailure()
            }
        }

    }

}

