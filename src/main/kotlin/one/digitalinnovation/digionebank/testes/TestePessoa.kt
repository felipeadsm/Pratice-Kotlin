package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main(){
    val felipe = Pessoa(nome = "Felipe Augusto", cpf = "123.456.789-90")

    println(felipe.nome)
    println(felipe.cpf)
}