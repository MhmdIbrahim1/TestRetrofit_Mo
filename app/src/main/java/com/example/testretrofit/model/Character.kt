package com.example.testretrofit.model

import com.google.gson.annotations.SerializedName


data class Character(
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String
)
