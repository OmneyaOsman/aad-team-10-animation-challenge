package com.aad.alc4.team10.animatedweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.aad.alc4.team10.animatedweatherapp.ui.main.RegionFragment
import com.aad.alc4.team10.animatedweatherapp.ui.main.dummy.DummyContent
import com.aad.alc4.team10.animatedweatherapp.ui.main.regionsModel.post
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
  println(post)

    }

}
