package com.example.myappex.adapter

import com.example.myappex.R
import com.example.myappex.model.ItemModel

object MockList {

    fun getMockedItemList(): List<ItemModel> {
        val itemModel1 = ItemModel(
            R.drawable.facebook,
            "FACEBOOK",
        )
        val itemModel2 = ItemModel(
            R.drawable.instagram,
            "INSTAGRAM",
        )
        val itemModel3 = ItemModel(
            R.drawable.facebook,
            "WHATSAPP",
        )
        val itemModel4 = ItemModel(
            R.drawable.instagram,
            "YOUTUBE",
        )
        val itemModel5 = ItemModel(
            R.drawable.instagram,
            "TWITTER",
        )
        val itemModel6 = ItemModel(
            R.drawable.instagram,
            "LINKEDIN",
        )
        val itemModel7 = ItemModel(
            R.drawable.instagram,
            "SNAPCHAT",
        )
        val itemModel8 = ItemModel(
            R.drawable.facebook,
            "SKYPE",
        )

        val itemList: ArrayList<ItemModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)
        itemList.add(itemModel8)
        return itemList
    }

}