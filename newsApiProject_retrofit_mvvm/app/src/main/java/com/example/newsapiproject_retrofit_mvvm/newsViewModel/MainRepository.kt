package com.example.newsapiproject_retrofit_mvvm.newsViewModel

import com.example.newsapiproject_retrofit_mvvm.network.RetrofitService

class MainRepository constructor(private val retrofitService:RetrofitService) {
    fun getAllNews() = retrofitService.getAllNewsData()
}