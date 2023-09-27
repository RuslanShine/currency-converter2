package com.example.currencyconverter.data

import com.example.convertmy.data.ValCurs
import com.example.currencyconverter.data.DAO.CurrenciesDAO
import com.example.currencyconverter.data.entity.Currencies
import com.example.currencyconverter.viewModel.HomeViewModel
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
        dataApi.getValues()
        object : Callback<ValCurs> {
            override fun onResponse(call: Call<ValCurs>, response: Response<ValCurs>) {
                val list = Converter.convertApiListDtoList(response.body()?.valute)
                list.forEach {
                    putToDb(list)
                }
                callback.onSuccess(list)
            }

            override fun onFailure(call: Call<ValCurs>, t: Throwable) {
                callback.onFailure()
            }


        }

    }

}

