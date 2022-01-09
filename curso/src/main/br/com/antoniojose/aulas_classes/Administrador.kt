package main.br.com.antoniojose.aulas_classes

class Administrador(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String) : Funcionario(nome, cpf, 100.0), Logavel {

    override fun login() = "123" == senha

}