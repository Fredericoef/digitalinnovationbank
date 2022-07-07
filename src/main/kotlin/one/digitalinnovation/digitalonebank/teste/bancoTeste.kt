package main.kotlin.one.digitalinnovation.digitalonebank.teste

import main.kotlin.one.digitalinnovation.digitalonebank.Banco

fun main(){
    val digiOneBank = Banco(nome = "Digione", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Digitwo")
    println(banco2.info())
}