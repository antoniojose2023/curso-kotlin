package main.br.com.antoniojose.aulas_classes

abstract class Funcionario(
    override var nome: String,
    override var cpf: String,
    var salario: Double
) : Pessoa(nome, cpf) {

}