package com.davila.alessandro.laboratoriocalificado01
import org.junit.Test

class Ejercicio01Kotlin {

    @Test
    fun Anagrama1() {
        val palabra1 = "listen"
        val palabra2 = "silent"
        Anagrama(palabra1, palabra2)
    }

    @Test
    fun Anagrama2() {
        val palabra1 = "hello"
        val palabra2 = "world"
        Anagrama(palabra1, palabra2)
    }

    private fun Anagrama(palabra1: String, palabra2: String): Boolean {
        if (palabra1.lowercase() == palabra2.lowercase()) {
            return false
        }
        val result = palabra1.lowercase().toCharArray().sortedArray().contentEquals(palabra2.lowercase().toCharArray().sortedArray())
        println(result)
        return result
    }

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
