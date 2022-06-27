package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 3000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "PJ")
    val pedro = Funcionario("Pedro", 4000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println("Dois elementos: $it") }

    funcionarios.add(pedro)
    funcionarios.forEach { println("Adicionando elementos: $it") }

    funcionarios.remove(joao)
    funcionarios.forEach { println("Removendo elementos: $it") }

    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println("MutableSetOf: $it") }

    funcionarioSet.add(maria)
    funcionarioSet.add(pedro)
    funcionarioSet.forEach { println("Adicionando elementos: $it") }

}