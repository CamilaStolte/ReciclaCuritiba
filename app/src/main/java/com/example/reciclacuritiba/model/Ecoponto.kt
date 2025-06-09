package com.example.reciclacuritiba.model

data class Ecoponto(
    val id: Long = 0,
    val nome: String,
    val endereco: String,
    val materiais: List<String>,
    val latitude: Double,
    val longitude: Double
) 