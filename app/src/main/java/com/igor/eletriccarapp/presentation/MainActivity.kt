package com.igor.eletriccarapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.igor.eletriccarapp.R
import com.igor.eletriccarapp.presentation.adapter.CarAdapter


class MainActivity : AppCompatActivity() {
lateinit var btn : Button
lateinit var carroLista: RecyclerView
lateinit var resultado : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListener()
        setupList()
    }
    fun setupView(){
        btn = findViewById<Button>(R.id.btn_calcular_1)
        carroLista = findViewById(R.id.rc_listcar)
    }

    fun setupList(){
        var dados = arrayOf(
            "Cupcake",
            "Donut",
            "Froyo",
            "GingerBread",

        )
        val adapter = CarAdapter(dados)
        carroLista.adapter = adapter
    }
    fun setupListener(){
        btn.setOnClickListener(){
          startActivity(Intent(this,CalcularAutonomiaActivity::class.java))
          }

        }
    }

