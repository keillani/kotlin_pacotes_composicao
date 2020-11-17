import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco=Endereco()

    val objeto=Any()
    imprime(objeto)

    imprime(1)
    imprime(1.0)
    imprime(endereco)
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}