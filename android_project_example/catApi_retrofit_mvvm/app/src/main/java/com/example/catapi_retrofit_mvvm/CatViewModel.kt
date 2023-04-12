package com.example.catapi_retrofit_mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CatViewModel : ViewModel() {
    private val apiService = Retrofit.Builder()
        .baseUrl("https://api.thecatapi.com/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(CatApiService::class.java)

    private val _catImageUrl = MutableLiveData<String>()
    val catImageUrl: LiveData<String>
        get() = _catImageUrl

    init {
        viewModelScope.launch {
            val catList = apiService.getRandomCat()
            val catUrl = catList.first().url
            _catImageUrl.value = catUrl
        }
    }
}
