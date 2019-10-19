package com.aad.alc4.team10.animatedweatherapp.ui.main.regionsModel

import com.google.gson.Gson
import java.io.File

val gson= Gson()
val bufferedReader = File("aad-team-10-animation-challenge/api").bufferedReader()
val inputString = bufferedReader.use { it.readText() }
var post = gson.fromJson(inputString, Region::class.java)
