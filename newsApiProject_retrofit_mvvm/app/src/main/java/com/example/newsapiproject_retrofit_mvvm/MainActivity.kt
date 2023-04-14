package com.example.newsapiproject_retrofit_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsapiproject_retrofit_mvvm.adapter.MainAdapter
import com.example.newsapiproject_retrofit_mvvm.newsViewModel.MainViewModel

import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var productViewModel: MainViewModel
    private lateinit var productsRecyclerView: RecyclerView
    private lateinit var productsAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        productsRecyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        productViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        productViewModel.getAllNews()

        productViewModel.newsList.observe(this){
            productsAdapter = MainAdapter(it)
            productsRecyclerView.layoutManager = LinearLayoutManager(this)
            productsRecyclerView.adapter = productsAdapter

        }


    }
}