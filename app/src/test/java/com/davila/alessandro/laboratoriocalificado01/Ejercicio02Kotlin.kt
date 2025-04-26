package com.davila.alessandro.laboratoriocalificado01
import org.junit.Test

class Ejercicio02Kotlin {

    @Test
    fun vocal() {
        val texto = "Hola Mundo"
        val vocales = contarV(texto.lowercase())
        println(vocales)
    }
    @Test
    fun vocal2() {
        val texto = "Kotlin es genial"
        val vocales = contarV(texto.lowercase())
        println(vocales)
    }

    private fun contarV(frase: String): Int {
        return frase.count { it in "aeiou" }
    }
}