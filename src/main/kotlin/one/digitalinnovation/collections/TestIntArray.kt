package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 8
    values[2] = 9
    values[3] = 0
    values[4] = 2

    for (valor in values ){
        println("for: $valor")
    }

    values.forEach {valor ->
        println("forEach: $valor")
    }

    for (index in values.indices){
        println("for index: " + values[index])
    }

    values.sort()
    for (valor in values ) {
        println("for with sort: $valor")
    }

}