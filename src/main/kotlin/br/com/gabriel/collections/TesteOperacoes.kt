package br.com.gabriel.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("----------------------------")
    println("Maior salario: ${salarios.maxOrNull() }")
    println("Menor salario: ${salarios.minOrNull()}")
    println("A média dos salarios é: ${salarios.average()}")

    println("----------------------------")

    val salariosMaiorQue2500 = salarios.filter { it > 2500 }
    salariosMaiorQue2500.forEach {
        println(it)
    }
}