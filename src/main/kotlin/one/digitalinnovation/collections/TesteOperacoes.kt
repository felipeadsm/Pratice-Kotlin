package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 3334.0)

    for (salario in salarios) {
        println("Salarios: $salario")
    }

    println("Marior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média dos salários: ${salarios.average()}")

    val salariosMaior2500 = salarios.filter { it > 2500 }
    salariosMaior2500.forEach{println("Salário maior que 2000: $it")}
}