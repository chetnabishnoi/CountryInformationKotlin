package com.countryinformationkotlin.di.component

import android.content.Context
import com.countryinformationkotlin.CountryApplication
import com.countryinformationkotlin.di.module.AppModule
import com.countryinformationkotlin.di.module.HomeModule
import com.countryinformationkotlin.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class,
        NetworkModule::class,
        AppModule::class,
        HomeModule::class]
)
interface AppComponent : AndroidInjector<CountryApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }
}