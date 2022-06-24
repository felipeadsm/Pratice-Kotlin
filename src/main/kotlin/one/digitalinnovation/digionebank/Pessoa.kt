package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Felipe"
    var cpf: String = "123.123.123-11"
}

fun main(){
    val felipe = Pessoa()

    println(felipe.nome)
    println(felipe.cpf)
}