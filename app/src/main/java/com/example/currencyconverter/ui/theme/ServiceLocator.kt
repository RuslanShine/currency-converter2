package com.example.currencyconverter.ui.theme

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.example.currencyconverter.ui.theme.data.ApiConstants
import com.example.currencyconverter.ui.theme.data.DataApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import java.util.logging.XMLFormatter

object ServiceLocator {

    private lateinit var okHttpClient: OkHttpClient

    lateinit var dataApi: DataApi

    fun initiation(context: Context) {
        okHttpClient = OkHttpClient.Builder()
//            .callTimeout(30, TimeUnit.SECONDS)
//            .readTimeout(30, TimeUnit.SECONDS)
            /*.addInterceptor(HttpLoggingInterceptor().apply {
                if (BuildConfig.DEBUG) {
                    level = HttpLoggingInterceptor.Level.BASIC
                }
            })*/
            .addInterceptor(ChuckerInterceptor(context))
            .build()

        val builder = Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
        dataApi = builder.create(DataApi::class.java)
    }
}