package com.example.kt_recyclerviewteste

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlowerAdapter (private val flowerList: Array<String>) :
    RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder>() {

    // Returns a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.flower_item, parent, false)
        return FlowerViewHolder(view)
    }

    // Displays data at a certain position
    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.bind(flowerList[position])
    }

    // Returns size of data list
    override fun getItemCount(): Int {
        return flowerList.size
    }

    //Describes an item view and its place within the RecyclerView
    inner class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val flowerTextView: TextView = itemView.findViewById(R.id.flower_text)
        fun bind(flowerName: String){
            flowerTextView.text = flowerName
        }
    }

}