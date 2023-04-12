package com.example.newsapiproject_retrofit_mvvm.network.model

data class newsModel(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)