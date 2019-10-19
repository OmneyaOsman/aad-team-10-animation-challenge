package com.aad.alc4.team10.animatedweatherapp.ui.main.regionsModel

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Region(
    @field:SerializedName("Name") val name: String?,
    @field:SerializedName("Countries") val countries: List<Country>?
):Serializable

data class Country(
    @field:SerializedName("Name") val name: String?,
    @field:SerializedName("Cities") val countries: List<City>?
):Serializable

data class City(
    @field:SerializedName("Name") val name: String?,
    @field:SerializedName("Zip") val zipCode: Int?
):Serializable