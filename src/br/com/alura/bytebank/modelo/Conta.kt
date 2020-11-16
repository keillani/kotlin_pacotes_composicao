package br.com.alura.bytebank.modelo

//import totalContas

//var totalContas = 0
//private set

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    //companion object declaration == Singleton (objetivo de criar uma instância única)
    companion object{

        var total=0
        private set

        fun incrementa(){
            total++
        }
    }

    init {
        println("Criando conta")
//        totalContas++
        total++ //conpanion object privado portanto so podera ser usado dentro da classe
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

//    init {
////        totalContas++
//    }

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

//    init {
////        totalContas++
//    }

    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}