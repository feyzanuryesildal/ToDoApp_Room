package com.example.catapi_retrofit_mvvm

import retrofit2.http.GET

interface CatApiService {
    @GET("images/search")
    suspend fun getRandomCat(): List<Cat>
}

data class Cat(val url: String)