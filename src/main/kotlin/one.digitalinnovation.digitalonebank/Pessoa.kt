package main.kotlin.one.digitalinnovation.digitalonebank


class Pessoa {
    var nome: String = "Josefino"
    var cpf: String = "032.878.254-12"

    inner class Endereco {
        var rua:String = "Rua teste"
    }

}

fun main() {
    val josefino = Pessoa()

    println(josefino.nome)
    println(josefino.cpf)
    println(josefino.Endereco().rua)
}