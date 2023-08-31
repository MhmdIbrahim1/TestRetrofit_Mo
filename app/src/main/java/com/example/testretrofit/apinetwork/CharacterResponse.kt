package com.example.testretrofit.apinetwork

import com.example.testretrofit.model.Character
import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("results")
    val results: List<Character>
)