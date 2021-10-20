import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco=Endereco(logradouro = "teste", numero = 1, cep = "00000-000")
    val enderecoNovo=Endereco(logradouro = "teste", numero = 1, cep = "00000-000")
    
    val testeEquals = endereco.equals(enderecoNovo)
    val testeHashCode = endereco.hashCode()
    val testeHashCode2 = enderecoNovo.hashCode()
    println(endereco)
    println(enderecoNovo)
    println(testeEquals)
    println(testeHashCode)
    println(testeHashCode2)
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}