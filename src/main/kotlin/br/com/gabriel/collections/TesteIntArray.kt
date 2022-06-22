package br.com.gabriel.collections

fun main() {
    // Criação do Array
    val values = IntArray(5)

    // Passando os valores para cada posição
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2


    //Percorrendo o Array
    for(valor in values){
        println(valor) // Imprimindo os valores
    }

    println("----------------------")

    // Outra forma de percorrer o Array
    values.forEach {
        println(it)
    }

    println("----------------------")

    // Outra forma de percorrer o Array
    for(index in values.indices) {
        println(values[index])
    }

    println("----------------------")

    values.sort()
    for(valor in values) {
        println(valor)
    }


}