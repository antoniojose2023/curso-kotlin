package main.br.com.antoniojose.aulas_classes

class Pessoa {

    var nome: String = "Maria"

    var cpf: String = "123.456.789-98"
    private set

    constructor()

    fun retonarDados() = nome +" - "+ cpf

}


fun main(){

    var antonio = Pessoa()

    println(antonio.nome)
    println(antonio.cpf)
    println(antonio.retonarDados())


}