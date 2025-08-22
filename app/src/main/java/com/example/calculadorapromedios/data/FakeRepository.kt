package com.example.calculadorapromedios.data

class FakeRepository {
    fun guardarPromedio(promedio: Double): String{
        return "Promedio ${String.format("%.0f",promedio)} guardado exitosamente.";
    }

}