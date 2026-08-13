fun botao(rotulo: String, aoClicar: () -> Unit) {
    println("[$rotulo] clicado")
    aoClicar()
}

fun main() {
    botao("Salvar") {
        println("Salvando...")
    }
}

// Saídas
// [Salvar] clicado
// Salvando...