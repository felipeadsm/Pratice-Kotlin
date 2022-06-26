package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 3000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "PJ")
    val pedro = Funcionario("Pedro", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println("union: $it") }

    val funcionarios3 = setOf(joao, pedro, maria)
    val resultUnion1 = funcionarios3.subtract(funcionarios2)
    resultUnion1.forEach { println("subtract: $it") }

    val resultInterssect = funcionarios3.intersect(funcionarios2)
    resultUnion1.forEach { println("interssect: $it") }
}