package com.igor.eletriccarapp.UI

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.igor.eletriccarapp.R

class CalcularAutonomiaActivity: AppCompatActivity(){
    lateinit var preco : EditText
    lateinit var btnCalcular : Button
    lateinit var kmPercorrido : EditText
    lateinit var resultado : TextView
    lateinit var iconeVoltar : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia)
        setupView()
        setupListener()
    }
    fun setupView(){
        preco = findViewById<EditText>(R.id.et_preço_km)
        kmPercorrido = findViewById<EditText>(R.id.et_km_percorrido)
        btnCalcular = findViewById<Button>(R.id.btn_calcular)
        resultado = findViewById(R.id.tv_resultado)
        iconeVoltar = findViewById(R.id.im_icone_close)
    }
    fun setupListener(){
        btnCalcular.setOnClickListener(){
            calcular()

        }
        iconeVoltar.setOnClickListener(){
            finish()
        }
    }
    fun calcular(){
        val preço = preco.text.toString().toFloat()
        val km = kmPercorrido.text.toString().toFloat()
        val result = preço / km
        resultado.text = result.toString()
    }
}