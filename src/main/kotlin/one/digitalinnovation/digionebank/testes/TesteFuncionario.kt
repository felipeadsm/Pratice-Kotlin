package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val felipe = Pessoa(nome = "Felipe Augusto", cpf = "123.456.789-90")
    println(felipe.nome)
    println(felipe.cpf)

    val funcionario1 = Funcionario("João Batista", "123.456.123-90", BigDecimal.valueOf(10000.00))
    println(funcionario1.nome)
    println(funcionario1.cpf)
    println("R$ " + funcionario1.salario)
}