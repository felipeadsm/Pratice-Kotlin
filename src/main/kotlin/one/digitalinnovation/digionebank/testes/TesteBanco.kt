package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val bb = Banco("Banco do Brasil", 123)

    println(bb.info())

    val nubank = bb.copy(nome = "Nubank", numero = 321)

    println(nubank.info())
}