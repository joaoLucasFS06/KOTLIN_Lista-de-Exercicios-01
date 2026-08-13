data class Endereco(val cidade: String?)
data class Aluno(val nome: String, val endereco: Endereco?)

fun main() {
    val ana = Aluno("Ana", null)
    val beto = Aluno("Beto", Endereco("São Paulo"))
    val caio = Aluno("Caio", Endereco(null))

    println(ana.endereco?.cidade ?: "não informada")
    println(beto.endereco?.cidade ?: "não informada")
    println(caio.endereco?.cidade ?: "não informada")
}


// não informada
// São Paulo
// não informada