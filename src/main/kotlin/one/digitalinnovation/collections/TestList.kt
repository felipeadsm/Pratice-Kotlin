package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 3000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "PJ")
    val pedro = Funcionario("Pedro", 4000.0, "CLT")

    val funcionarios = listOf(joao, maria, pedro)

    funcionarios.forEach { println(it) }

    println(funcionarios.find { it.nome == "Maria" })

    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    funcionarios.groupBy { it.tipoContrato }.forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContrato: String
) {
    override fun toString(): String = """
        Nome: $nome
        Salário: $salario
        ------------------------------------------------------
    """.trimIndent()
}