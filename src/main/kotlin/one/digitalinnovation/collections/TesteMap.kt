package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Pedro", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf("Pedro" to 2780.0, "Maria" to 5670.0)

    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

}