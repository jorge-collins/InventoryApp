package com.example.inventoryapp

import java.io.Serializable

class Item(
    val itemId: String,
    val itemName: String,
    val itemPrice: Double,
    val itemDescription: String,
    val itemImage: Int,
    val itemLocation: String,
    val itemGPS: String,
    val itemComments: String
) : Serializable