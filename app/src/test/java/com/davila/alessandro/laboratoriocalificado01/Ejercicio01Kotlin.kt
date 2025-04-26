package com.davila.alessandro.laboratoriocalificado01
import org.junit.Test

class Ejercicio01Kotlin {

    @Test
    fun Anagrama1() {
        val palabra1 = "listen"  // Primera palabra para comparar
        val palabra2 = "silent"  // Segunda palabra para comparar
        Anagrama(palabra1, palabra2)  // Llama a la función Anagrama con ambas palabras
    }

    @Test
    fun Anagrama2() {
        val palabra1 = "hello"  // Primera palabra para comparar
        val palabra2 = "world"  // Segunda palabra para comparar
        Anagrama(palabra1, palabra2)  // Llama a la función Anagrama con ambas palabras
    }

    private fun Anagrama(palabra1: String, palabra2: String): Boolean {
        // Si las palabras son exactamente iguales (ignorando mayúsculas), no se consideran anagramas
        if (palabra1.lowercase() == palabra2.lowercase()) {
            return false
        }

        // Convierte ambas palabras a minúsculas, las transforma en arreglos de caracteres, los ordena
        // y compara si son iguales. Si lo son, entonces son anagramas.
        val result = palabra1.lowercase().toCharArray().sortedArray()
            .contentEquals(palabra2.lowercase().toCharArray().sortedArray())

        println(result)  // Imprime el resultado (true o false) en consola
        return result    // Retorna el resultado de la comparación
    }

}
