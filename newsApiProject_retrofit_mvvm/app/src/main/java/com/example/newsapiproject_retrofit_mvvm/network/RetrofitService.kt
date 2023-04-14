package com.example.newsapiproject_retrofit_mvvm.network
import com.example.newsapiproject_retrofit_mvvm.network.model.newsModel
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {
    @GET("/")
    fun getAllNewsData(): Call<newsModel>

}