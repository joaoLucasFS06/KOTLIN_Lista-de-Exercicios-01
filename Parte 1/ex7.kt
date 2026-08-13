fun saudacao(nome: String, prefixo: String = "Olá"): String = "$prefixo, $nome!"

fun main() {
    println(saudacao("Maria"))
    // Saída: Olá, Maria!

    println(saudacao("João", "Bom dia"))
    // Saída: Bom dia, João!
}