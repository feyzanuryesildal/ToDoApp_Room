package com.example.movie_app_retrofit_mvvm.network


import com.example.movie_app_retrofit_mvvm.network.model.MovieModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {
    @GET(API_KEY)
     fun getMovieData(): Call<List<MovieModel>>

}