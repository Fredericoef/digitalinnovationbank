package main.kotlin.one.digitalinnovation.digitalonebank.teste

import main.kotlin.one.digitalinnovation.digitalonebank.Analista
import main.kotlin.one.digitalinnovation.digitalonebank.Funcionario

fun main() {
    val joao = Analista("João Pedro", "1234567897", 2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)

}
