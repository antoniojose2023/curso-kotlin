package main.br.com.antoniojose.aula_classes

class Pessoa {

    var nome: String = "Maria"
    var cpf: String = "123.456.789-98"

}


fun main(){

    println(Pessoa().nome)
    println(Pessoa().cpf)

}