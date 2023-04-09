package com.example.movie_app_retrofit_mvvm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movie_app_retrofit_mvvm.R
import com.example.movie_app_retrofit_mvvm.network.model.MovieModel


    class MovieAdapter(private val movies: List<MovieModel>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

        inner class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val titleTextView: TextView = view.findViewById(R.id.titleTextView)
            val yearTextView: TextView = view.findViewById(R.id.yearTextView)
            val directorTextView: TextView = view.findViewById(R.id.directorTextView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
            return MovieViewHolder(view)
        }

        override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
            val movie = movies[position]
            holder.titleTextView.text = movie.Title
            holder.yearTextView.text = movie.Year
            holder.directorTextView.text = movie.Director
        }

        override fun getItemCount() = movies.size
    }

