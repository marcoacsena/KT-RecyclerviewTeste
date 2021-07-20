package com.example.kt_recyclerviewteste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

//    private lateinit var mainAdapter: MainAdapter
//    private lateinit var rvListaDeCompras: RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val flowerList = DataSource(this).getFlowerList()
//
//        mainAdapter = MainAdapter()
//
//        rvListaDeCompras.adapter = MainAdapter()

        val flowerList = DataSource(this).getFlowerList()
        val recyclerView : RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = FlowerAdapter(flowerList)
    }
}