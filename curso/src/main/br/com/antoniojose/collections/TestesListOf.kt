package main.br.com.antoniojose.collections


fun main(){

    var func1 = Funcionario("antonio", 800.0, "clt")
    var func2 = Funcionario("maria", 500.0, "pj")
    var func3 = Funcionario("joao", 900.0, "clt")

    var lista = listOf(func1, func2, func3)

    lista.forEach {
        println(it)
    }

    println("---------------------------------------")

    lista.sortedBy { it.salario }.forEach {
        println(it)
    }

    println("---------------------------------------")

   println( lista.find { it.nome == "maria"  })

    println("---------------------------------------")
    println("Agrupando por tipo")
    lista.groupBy { it.tipo }.forEach {
        println(it)
    }


}


class Funcionario(var nome: String, var salario: Double, var tipo: String){

    override fun toString(): String =
       """
           $nome
           $salario
           $tipo
       """


}