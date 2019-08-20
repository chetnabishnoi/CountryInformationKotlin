package com.countryinformationkotlin.di.module

import android.app.Application
import android.graphics.drawable.PictureDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade
import com.countryinformationkotlin.R
import com.countryinformationkotlin.glide.SvgSoftwareLayerSetter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule {

    @Singleton
    @Provides
    internal fun provideGlideSvgInstance(application: Application): RequestBuilder<PictureDrawable> {
        return Glide.with(application.applicationContext)
            .`as`(PictureDrawable::class.java)
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)
            .transition(withCrossFade())
            .listener(SvgSoftwareLayerSetter())
    }
}