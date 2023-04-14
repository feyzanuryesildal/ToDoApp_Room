package com.example.newsapiproject_retrofit_mvvm.network
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitInstance {
    var retrofitService: RetrofitService? = null
    fun getRetrofitInstance(): RetrofitService{
        if (retrofitService == null) {
            var retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofitService = retrofit.create(RetrofitService::class.java)
        }
            return retrofitService!!

    }
}
