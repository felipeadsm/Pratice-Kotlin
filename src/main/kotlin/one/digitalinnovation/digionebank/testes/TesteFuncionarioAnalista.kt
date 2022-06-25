package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista("João Batista", "123.456.123-90",10000.00)
    ImrprimeRelatorioFuncionario.imprime(joao)
}