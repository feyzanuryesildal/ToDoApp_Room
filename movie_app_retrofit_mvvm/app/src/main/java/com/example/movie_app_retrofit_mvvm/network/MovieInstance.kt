package com.example.movie_app_retrofit_mvvm.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MovieInstance {

    fun getRetrofitInstance() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}