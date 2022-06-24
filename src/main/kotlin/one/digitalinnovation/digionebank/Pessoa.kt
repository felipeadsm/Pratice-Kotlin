package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Felipe"

    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun pessoaInfo() = "Nome: $nome e CPF: $cpf"

    inner class Endereco {
        var rua: String = "Rua Emilio Castelar"
    }
}

fun main(){
    val felipe = Pessoa()

    println(felipe.pessoaInfo())
}