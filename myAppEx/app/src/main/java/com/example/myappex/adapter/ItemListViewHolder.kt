package com.example.myappex.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myappex.R
import com.example.myappex.model.ItemModel

class ItemListViewHolder (itemView : View): RecyclerView.ViewHolder(itemView){

    fun bindItems(itemModel : ItemModel) {
        val description = itemView.findViewById(R.id.item_textName) as TextView
        val image = itemView.findViewById(R.id.image) as ImageView

        description.text= itemModel.description
        image.setImageResource(itemModel.image)
    }
}