package com.example.inventoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_item.*
import kotlinx.android.synthetic.main.item_product.*

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val item = intent.getSerializableExtra("item") as Item

        detImage.setImageResource(item.itemImage)
        detId.text = item.itemId
        detName.text = item.itemName
        detDescription.text = item.itemDescription
        detLocation.text = item.itemLocation
    }
}