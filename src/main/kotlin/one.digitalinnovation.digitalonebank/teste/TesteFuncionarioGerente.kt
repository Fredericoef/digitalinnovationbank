package main.kotlin.one.digitalinnovation.digitalonebank.teste

import main.kotlin.one.digitalinnovation.digitalonebank.Analista
import main.kotlin.one.digitalinnovation.digitalonebank.Funcionario
import main.kotlin.one.digitalinnovation.digitalonebank.Gerente

fun main() {
    val maria = Gerente("Maria Helena", "1234567857", 5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)

}
