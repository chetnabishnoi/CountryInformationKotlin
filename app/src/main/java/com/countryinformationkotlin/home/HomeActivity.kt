package com.countryinformationkotlin.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.countryinformationkotlin.R
import com.countryinformationkotlin.home.ui.homeactivity1.HomeFragment

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HomeFragment.newInstance())
                .commitNow()
        }
    }

}
