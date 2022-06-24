package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Felipe"

    var cpf: String = "123.123.123-11"
    private set

    inner class Endereco {
        var rua: String = "Rua Emilio Castelar"
    }
}

fun main(){
    val felipe = Pessoa()

    felipe.cpf = "987.654.321-99"

    println(felipe.nome)
    println(felipe.cpf)
    println(felipe.Endereco().rua)
}