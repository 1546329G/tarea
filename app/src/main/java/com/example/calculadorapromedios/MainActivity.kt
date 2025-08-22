package com.example.calculadorapromedios

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Asignación de vistas a variables
        val num1EditText = findViewById<EditText>(R.id.etCalificacion1)
        val num2EditText = findViewById<EditText>(R.id.etCalificacion2)
        val num3EditText = findViewById<EditText>(R.id.etCalificacion3)
        val calculateButton = findViewById<Button>(R.id.btnCalcular)
        val resultTextView = findViewById<TextView>(R.id.tvResultado)

        // Acción al hacer clic en el botón
        calculateButton.setOnClickListener {
            // Manejo de errores para evitar que la app se cierre si los campos están vacíos
            try {
                // Obtener las calificaciones de los campos de texto
                val calificacion1 = num1EditText.text.toString().toDouble()
                val calificacion2 = num2EditText.text.toString().toDouble()
                val calificacion3 = num3EditText.text.toString().toDouble()

                // Calcular el promedio
                val promedio = (calificacion1 + calificacion2 + calificacion3) / 3

                // Mostrar el resultado en el TextView
                resultTextView.text = "Resultado: ${String.format("%.0f", promedio)}"
            } catch (e: NumberFormatException) {
                // Mostrar un mensaje de error si los campos no son números válidos
                Toast.makeText(this, "Por favor, ingrese valores numéricos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}