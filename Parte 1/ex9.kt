fun main() {
    val nomes = listOf("Igao", "Felipao", "Jaozao", "Kaikao")

    // 1
    val emMaiusculas: (String) -> String = { nome -> nome.uppercase() }

    // 2
    val resultadoNomeado = nomes
        .filter { nome -> nome.length > 4 }
        .map { nome -> emMaiusculas(nome) }

    println(resultadoNomeado)

    // 3
    val resultadoIt = nomes
        .filter { it.length > 4 }
        .map { emMaiusculas(it) }

    println(resultadoIt)
}


// Saídas
// [FELIPAO, JAOZAO, KAIKAO]
// [FELIPAO, JAOZAO, KAIKAO]