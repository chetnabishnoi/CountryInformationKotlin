package com.countryinformationkotlin

import com.countryinformationkotlin.model.Country
import io.reactivex.Flowable
import retrofit2.http.GET

interface CountryService {

    @GET
    fun getCountries(): Flowable<List<Country>>
}