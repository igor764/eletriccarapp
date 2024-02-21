package com.igor.eletriccarapp.UI.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.igor.eletriccarapp.R
import com.igor.eletriccarapp.domain.Carro

class CarAdapter(private val carros:List<Carro>): RecyclerView.Adapter<CarAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent,
            false)
        return ViewHolder(view)
    }



    override fun getItemCount(): Int = carros.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.preco.text = carros[position].preco
        holder.bateria.text = carros[position].bateria
        holder.potencia.text = carros[position].potencia
        holder.recarga.text = carros[position].recarga
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val preco: TextView
        val bateria: TextView
        val potencia : TextView
        val recarga: TextView
        init {
            view.apply {
                preco = findViewById(R.id.tv_preco_value)
                bateria = findViewById(R.id.tv_bateria_values)
                potencia = findViewById(R.id.tv_potencia_values)
                recarga = findViewById(R.id.tv_recarga_values)

            }
            }

    }
}