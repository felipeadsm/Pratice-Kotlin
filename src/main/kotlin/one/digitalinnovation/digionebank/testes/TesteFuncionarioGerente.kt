package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria João", "987.456.123-90",20000.00, "senha123")
    ImrprimeRelatorioFuncionario.imprime(maria)
    TesteAutenticacao().autentica(maria)
}
