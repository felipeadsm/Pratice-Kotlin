package one.digitalinnovation.collections

fun main() {
    val nomes = Array(4) {""}

    nomes[0] = "Felipe"
    nomes[1] = "Augusto"
    nomes[2] = "da Silva"
    nomes[3] = "Mendonça"

    for (nome in nomes) {
        println("for: $nome")
    }

    nomes.sort()
    nomes.forEach { println("for each ordenado: $it") }

    val names = arrayOf("Felipe", "Augusto", "da Silva", "Mendonça")
    names.sort()
    names.forEach { println("for each arrayOf: $it") }
}