package com.countryinformationkotlin.di.module

import com.countryinformationkotlin.di.ViewModelBuilder
import com.countryinformationkotlin.ui.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeModule {

    @ContributesAndroidInjector(modules = [ViewModelBuilder::class])
    abstract fun contributeHomeFragment(): HomeFragment
}
