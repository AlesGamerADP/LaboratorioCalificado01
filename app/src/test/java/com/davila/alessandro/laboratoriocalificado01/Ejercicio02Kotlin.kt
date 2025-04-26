package com.davila.alessandro.laboratoriocalificado01
import org.junit.Test

class Ejercicio02Kotlin {

    @Test
    fun vocal() {
        val texto = "Hola Mundo"  // Frase de entrada
        val vocales = contarV(texto.lowercase())  // Convierte a minúsculas y cuenta las vocales
        println(vocales)  // Imprime la cantidad de vocales encontradas
    }

    @Test
    fun vocal2() {
        val texto = "Kotlin es genial"  // Otra frase de entrada
        val vocales = contarV(texto.lowercase())  // Convierte a minúsculas y cuenta las vocales
        println(vocales)  // Imprime la cantidad de vocales encontradas
    }

    private fun contarV(frase: String): Int {
        // Cuenta cuántos caracteres de la frase están dentro del conjunto de vocales "aeiou"
        return frase.count { it in "aeiou" }
    }
}