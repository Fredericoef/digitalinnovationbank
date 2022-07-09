package main.kotlin.one.digitalinnovation.digitalonebank.teste

import main.kotlin.one.digitalinnovation.digitalonebank.Gerente
import main.kotlin.one.digitalinnovation.digitalonebank.Logavel

class TesteAutenticacao {
    fun autentica(logavel: Logavel) = println(logavel.login())
}