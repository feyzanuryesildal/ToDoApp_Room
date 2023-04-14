package com.example.newsapiproject_retrofit_mvvm.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newsapiproject_retrofit_mvvm.databinding.AdapterNewsBinding
import com.example.newsapiproject_retrofit_mvvm.network.model.newsModel

class MainAdapter(newsModel: newsModel) : RecyclerView.Adapter<MainViewHolder>() {
    var news = mutableListOf<newsModel>()
    fun setNewsList(news: List<newsModel>) {
        this.news = news.toMutableList()
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AdapterNewsBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }
    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val news = news[position]
        //holder.binding.name.text = news.status
        //Glide.with(holder.itemView.context).load(news).into(holder.binding.imageview)
    }
    override fun getItemCount(): Int {
        return news.size
    }
}
class MainViewHolder(val binding: AdapterNewsBinding) : RecyclerView.ViewHolder(binding.root) {
}