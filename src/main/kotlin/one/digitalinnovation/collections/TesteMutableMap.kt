package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 3000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "PJ")
    val pedro = Funcionario("Pedro", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)

    println("******************************************************")
    println(repositorio.findById(joao.nome))

    println("******************************************************")
    repositorio.findAll().forEach { println(it) }

    println("******************************************************")
    println(repositorio.remove(pedro.nome))
    repositorio.findAll().forEach { println(it) }

}