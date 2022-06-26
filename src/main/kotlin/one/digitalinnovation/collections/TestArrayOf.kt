package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 8, 9, 1, 6)

    values.forEach {
        println("arrayOf: $it")
    }

    values.sort()
    values.forEach {
        println("arrayOf with sort: $it")
    }
}