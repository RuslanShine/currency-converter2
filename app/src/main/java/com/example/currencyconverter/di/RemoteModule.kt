package com.example.currencyconverter.di

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.example.currencyconverter.data.DataApi
import com.example.currencyconverter.data.DataRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(@ApplicationContext context: Context): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(ChuckerInterceptor(context))
            .build()

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl(com.example.currencyconverter.data.ApiConstants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    @Provides
    @Singleton
    fun provideTmdbApi(retrofit: Retrofit): DataApi = retrofit.create(DataApi::class.java)

    @Provides
    @Singleton
    fun provideDataRepositoryApi(dataApi: DataApi): DataRepository = DataRepository(dataApi)
}