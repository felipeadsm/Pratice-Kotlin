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

    println("entre 2000 e 5000: " + salarios.count{it in 2000.0..5000.0})

    println("Procurar elemento no array: " + salarios.find { it == 2250.0 })

    println("Usando any: " + salarios.any { it == 1000.0 })
    println("Usando any: " + salarios.any { it == 500.0 })
}