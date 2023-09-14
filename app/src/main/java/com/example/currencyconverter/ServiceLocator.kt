package com.example.currencyconverter

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceLocator {

    private lateinit var okHttpClient: OkHttpClient

    lateinit var dataApi: com.example.currencyconverter.data.DataApi

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
            .baseUrl(com.example.currencyconverter.data.ApiConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
        dataApi = builder.create(com.example.currencyconverter.data.DataApi::class.java)
    }
}