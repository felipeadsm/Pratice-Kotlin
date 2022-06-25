package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da Silva",
        cpf = "345.678.900.98",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)
    TesteAutenticacao().autentica(jose)

}
