package com.example.kt_recyclerviewteste

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val flowerList = DataSource(this).getFlowerList()
        //Tinha feito assim antes e mudei para o código das linhas23 e 24, para
        //explorar os recursos do Contexto (Context)

        val context: Context = applicationContext
        var listaDeFlores = context.resources.getStringArray(R.array.flower_array)

        val recyclerView : RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = FlowerAdapter(listaDeFlores)

    }
}