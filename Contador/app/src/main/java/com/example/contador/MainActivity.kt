package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var contador = 0
        val  botonMas: Button = findViewById(R.id.buttonMas)
        val botonMenos: Button = findViewById(R.id.buttonMenos)
        val botonReset: Button = findViewById(R.id.buttonReset)
        val textoSalida: TextView = findViewById(R.id.textView2)

        botonMas.setOnClickListener {
            contador++ // Incrementar el contador
            textoSalida.text = contador.toString() // Mostrar el contador en el TextView
        }

        botonMenos.setOnClickListener {
            if (contador <= 0) {
                contador = 0
            } else {
                contador--
            }
            textoSalida.text = contador.toString() // Mostrar el contador en el TextView
        }

        botonReset.setOnClickListener {
            contador = 0 // Restablecer el contador a cero
            textoSalida.text = contador.toString() // Mostrar el contador en el TextView
        }


    }
}