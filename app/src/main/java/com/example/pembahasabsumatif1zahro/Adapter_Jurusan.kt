package com.example.pembahasabsumatif1zahro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter_Jurusan (private val dataset: ArrayList<DataJurusan>):
        RecyclerView.Adapter<Adapter_Jurusan.ViewHolder>(){
            class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
                val gambar :ImageView = view.findViewById(R.id.rvJurusan)
                val tulisan : TextView = view.findViewById(R.id.textJurusan)

            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_adapter_jurusan,parent,false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val DataJurusan = dataset[position]
        holder.gambar.setImageResource(DataJurusan.gambar)
        holder.tulisan.text = DataJurusan.nama
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}