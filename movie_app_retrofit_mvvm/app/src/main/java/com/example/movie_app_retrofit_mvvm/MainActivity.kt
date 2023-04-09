package com.example.movie_app_retrofit_mvvm

import android.graphics.Movie
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.movie_app_retrofit_mvvm.adapter.MovieAdapter
import com.example.movie_app_retrofit_mvvm.viewModel.MovieViewModel
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {

    private lateinit var movieViewModel: MovieViewModel
    private lateinit var movieRecyclerView: RecyclerView
    private lateinit var movieAdapter: MovieAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieRecyclerView = findViewById<RecyclerView>(R.id.movieRecyclerView)

        movieViewModel = ViewModelProvider(this).get(MovieViewModel::class.java)
        movieViewModel.getMovieList()

        movieViewModel.movieList.observe(this) {
            movieAdapter = MovieAdapter(it)
            movieRecyclerView.layoutManager = LinearLayoutManager(this)
            movieRecyclerView.adapter = movieAdapter
        }
    }
}