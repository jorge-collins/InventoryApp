package com.example.inventoryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item1 = Item("0204", "Camara", 7700.0, "Sony profesional", R.drawable.camara, "K8", "24.136274118819735, -110.42587891904695", "RC dañado" )
        val item2 = Item("10445", "PC Escritorio", 3000.0, "Dell 9020", R.drawable.pc, "Oficina Eventos", "24.136140718112102, -110.42591646997204", "" )

        val listItems = listOf(item1, item2)

        val adapter = ItemsAdapter(this, listItems)

        lista.adapter = adapter

        lista.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, ItemActivity::class.java)
            intent.putExtra("item", listItems[position])
            startActivity(intent)
        }
    }
}