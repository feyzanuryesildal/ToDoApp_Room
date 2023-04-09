package com.example.movie_app_retrofit_mvvm.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movie_app_retrofit_mvvm.network.MovieInstance
import com.example.movie_app_retrofit_mvvm.network.MovieService
import com.example.movie_app_retrofit_mvvm.network.model.MovieModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MovieViewModel : ViewModel(){


    private val _movieList = MutableLiveData<List<MovieModel>>()
    val movieList: LiveData<List<MovieModel>> get() = _movieList


    fun getMovieList() {

        val movieInstance = MovieInstance.getRetrofitInstance().create(MovieService::class.java)
        movieInstance.getMovieData().enqueue(object : Callback<List<MovieModel>> {
            override fun onResponse(
                call: Call<List<MovieModel>>,
                response: Response<List<MovieModel>>
            ) {
                _movieList.postValue(response.body())
            }

            override fun onFailure(call: Call<List<MovieModel>>, t: Throwable) {

            }
        })
    }
}