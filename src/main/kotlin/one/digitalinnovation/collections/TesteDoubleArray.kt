package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(4)

    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 5000.0
    salarios[3] = 7000.0

    salarios.forEach { println("for each: $it") }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario *1.1
    }
    salarios.forEach { println("for each indexed: $ $it") }

    val salaries = doubleArrayOf(1500.0, 3500.0, 5500.0, 7500.0)
    salaries.sort()
    salaries.forEach { println("arrayDoubleOf: $it") }

}