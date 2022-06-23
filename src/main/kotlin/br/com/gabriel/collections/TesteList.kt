package br.com.gabriel.collections

fun main() {
    val joao = Funcionario("Joao", 7900.0, "CLT")
    val pedro = Funcionario("Pedro", 2000.0, "PJ")
    val maria = Funcionario("Maria", 6000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach {
        println(it)
    }

    println("----------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("----------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}

