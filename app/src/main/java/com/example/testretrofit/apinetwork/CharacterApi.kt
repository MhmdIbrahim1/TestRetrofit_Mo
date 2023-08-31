package com.example.testretrofit.apinetwork

import com.example.testretrofit.apinetwork.CharacterResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterApi {
    @GET("character")
    fun getCharacter(@Query("page")page: String): retrofit2.Call<CharacterResponse>
}