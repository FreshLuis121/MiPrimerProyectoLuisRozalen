package com.example.sprint1luis

import kotlin.random.Random

fun main() {
    val name = "Mary"
    val age = 20
    println("$name is $age years old")

}

fun ejercicio2() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}

fun ejercicio3() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val totalNumbers = greenNumbers.size + redNumbers.size
    println("Total number of numbers: $totalNumbers")
}

fun ejercicio4() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}

fun ejercicio5() {
    val studentGrades = mutableMapOf("Ana" to 8.5, "Luis" to 9.0, "Carlos" to 7.2)
    println(studentGrades)
}

fun ejercicio6() {
    val firstResult = Random.nextInt(1, 7)
    val secondResult = Random.nextInt(1, 7)

    println("Dado 1: $firstResult")
    println("Dado 2: $secondResult")

    if (firstResult == secondResult) {
        println("¡Has ganado! Han salido los mismos números.")
    } else {
        println("Has perdido. ¡Inténtalo de nuevo!")
    }
}

fun ejercicio7() {
    val button = "A"
    val action = when (button) {
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    }
    println(action)
}