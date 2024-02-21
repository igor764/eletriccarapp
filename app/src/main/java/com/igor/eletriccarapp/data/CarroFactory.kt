package com.igor.eletriccarapp.data

import com.igor.eletriccarapp.domain.Carro

object CarroFactory {

    val list = listOf<Carro>(
        Carro(
            id = 1,
            preco = "R$ 300.000,00",
            bateria = "300 kwh",
            potencia = "200 cv",
            recarga = "30 min",
            urlPhoto = "www.google.com.br"

        )
    )
}