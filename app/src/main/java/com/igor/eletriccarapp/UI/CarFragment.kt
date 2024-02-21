package com.igor.eletriccarapp.UI

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.igor.eletriccarapp.R
import com.igor.eletriccarapp.UI.adapter.CarAdapter
import com.igor.eletriccarapp.data.CarroFactory

class CarFragment: Fragment() {
    lateinit var btn : Button
    lateinit var carroLista: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.car_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view)
        setupList()
        setupListener()
    }

    fun setupView(view: View){
      view.apply {
          btn = findViewById<Button>(R.id.btn_calcular_1)
          carroLista = findViewById(R.id.rc_listcar)
      }


    }
    fun setupList(){
        val adapter = CarAdapter(CarroFactory.list)
        carroLista.adapter = adapter
    }
    fun setupListener(){
        btn.setOnClickListener(){
            //startActivity(Intent(this,CalcularAutonomiaActivity::class.java))
        }
}
}