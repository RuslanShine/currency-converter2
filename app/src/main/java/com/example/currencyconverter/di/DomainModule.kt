//package com.example.currencyconverter.di
//
//import com.example.currencyconverter.data.DataRepository
//import com.example.currencyconverter.domain.usecase.RecalculatingValuesUseCase
//import com.example.currencyconverter.domain.usecase.SetCharCodeValuesUseCase
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.android.components.ViewModelComponent
//import dagger.hilt.components.SingletonComponent
//
//@Module
//@InstallIn(SingletonComponent::class)
//class DomainModule {
//
//    @Provides
//    fun provideRecalculatingValuesUseCase(dataRepository: DataRepository): RecalculatingValuesUseCase {
//        return RecalculatingValuesUseCase(dataRepository)
//    }
//
//    @Provides
//    fun provideSetCharCodeValuesUseCase(dataRepository: DataRepository): SetCharCodeValuesUseCase  {
//        return SetCharCodeValuesUseCase (dataRepository)
//    }
//
//}