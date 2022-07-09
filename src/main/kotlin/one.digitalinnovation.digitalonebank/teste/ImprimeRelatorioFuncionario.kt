package main.kotlin.one.digitalinnovation.digitalonebank.teste

import main.kotlin.one.digitalinnovation.digitalonebank.Funcionario

class ImprimeRelatorioFuncionario {

    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                    funcionario.toString()
            )
        }
    }

}