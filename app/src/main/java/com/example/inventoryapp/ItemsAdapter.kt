package com.example.inventoryapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_product.view.*

class ItemsAdapter(private val mContext: Context, private val itemsList: List<Item>) : ArrayAdapter<Item>(mContext, 0, itemsList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_product, parent, false)

        val item = itemsList[position]

        layout.txtName.text = item.itemName
        layout.txtLocation.text = item.itemLocation
        layout.imgItem.setImageResource(item.itemImage)

        return layout
    }
}