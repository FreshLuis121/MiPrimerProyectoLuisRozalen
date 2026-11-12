package com.example.sprint1luis

import kotlin.math.abs

fun main() {

}

fun ejercicio1Reto3() {
    println("Introduce una contraseña:")
    val password = readlnOrNull() ?: ""

    val errores = mutableListOf<String>()

    if (password.length < 8) {
        errores.add("Falta tener al menos 8 caracteres")
    }
    if (!password.any { it.isUpperCase() }) {
        errores.add("Falta una letra mayúscula")
    }
    if (!password.any { it.isLowerCase() }) {
        errores.add("Falta una letra minúscula")
    }
    if (!password.any { it.isDigit() }) {
        errores.add("Falta un número")
    }
    if (password.contains(" ")) {
        errores.add("No debe contener espacios")
    }

    if (errores.isEmpty()) {
        println("¡Contraseña válida!")
    } else {
        print("Contraseña no válida:")
        for (error in errores) {
            print(" - $error.")
        }
        println()
    }
}

fun ejercicio2Reto3() {
    val temperaturas = mutableListOf<Double>()

    println("Introduce temperaturas (escribe 'fin' para terminar):")
    while (true) {
        val entrada = readlnOrNull()?.trim() ?: continue
        if (entrada.equals("fin", ignoreCase = true)) {
            break
        }
        val temp = entrada.toDoubleOrNull()
        if (temp != null) {
            temperaturas.add(temp)
        } else {
            println("Por favor, introduce un número válido o 'fin'.")
        }
    }

    if (temperaturas.isEmpty()) {
        println("No se han introducido temperaturas.")
        return
    }

    val maxima = temperaturas.maxOrNull()!!
    val minima = temperaturas.minOrNull()!!
    val media = temperaturas.average()
    val porEncimaMedia = temperaturas.count { it > media }

    var maxDiferencia = 0.0
    val movimientos = mutableListOf<String>()

    for (i in 0 until temperaturas.size - 1) {
        val actual = temperaturas[i]
        val siguiente = temperaturas[i + 1]

        val diff = abs(siguiente - actual)
        if (diff > maxDiferencia) {
            maxDiferencia = diff
        }

        when {
            siguiente > actual -> movimientos.add("De $actual a $siguiente: Subió")
            siguiente < actual -> movimientos.add("De $actual a $siguiente: Bajó")
            else -> movimientos.add("De $actual a $siguiente: Se mantuvo")
        }
    }

    println("\n--- RESULTADOS ---")
    println("Máxima: $maxima")
    println("Mínima: $minima")
    println("Media: $media")
    println("Por encima de la media: $porEncimaMedia")
    if (temperaturas.size > 1) {
        println("Mayor variación consecutiva: $maxDiferencia")
        println("Evolución entre mediciones:")
        for (mov in movimientos) {
            println(" - $mov")
        }
    } else {
        println("Mayor variación consecutiva: N/A (se necesita más de una medición)")
    }
}

fun ejercicio3Reto3() {
    val correo: String? = "alumno@correo.com"

    correo?.let {
        println("Enviando mensaje a $it")
    } ?: run {
        println("No se ha indicado ningún correo")
    }
}
