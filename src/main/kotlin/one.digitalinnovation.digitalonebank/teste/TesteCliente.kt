package main.kotlin.one.digitalinnovation.digitalonebank.teste

import main.kotlin.one.digitalinnovation.digitalonebank.Cliente
import main.kotlin.one.digitalinnovation.digitalonebank.ClienteTipo

fun main(){
    val jose = Cliente(
            nome = "Jose Silva",
            cpf = "123.123456-77",
            clienteTipo = ClienteTipo.PF,
            senha = "123456"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)
}