package com.example.newsapiproject_retrofit_mvvm.newsViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newsapiproject_retrofit_mvvm.network.model.newsModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel constructor(private val repository: MainRepository): ViewModel() {

    val newsList = MutableLiveData<newsModel>()
    val errorMessage = MutableLiveData<String>()
    val newsListData: LiveData<newsModel> get() = newsList

    fun getAllNews() {
        val response = repository.getAllNews()
        response.enqueue(object : Callback<newsModel> {
            override fun onResponse(call: Call<newsModel>, response: Response<newsModel>) {
                newsList.postValue(response.body())
            }

            override fun onFailure(call: Call<newsModel>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }
}



/*fun getAllMovies() {
        val response = repository.getAllNews()
        response.enqueue(object : Callback<newsModel> {
            override fun onResponse(call: Call<newsModel>, response: Response<newsModel>) {
                newsList.postValue(response.body())
            }
            override fun onFailure(call: Call<newsModel>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }*/