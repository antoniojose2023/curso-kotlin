package main.br.com.antoniojose.collections


fun main() {

    var func1 = Funcionario("antonio", 800.0, "clt")
    var func2 = Funcionario("maria", 500.0, "pj")
    var func3 = Funcionario("joao", 900.0, "clt")

    var listaMutavel = mutableListOf(func1, func2, func3)

    println("---------------------------------------------")
    listaMutavel.forEach {
        println(it)
    }

    println("---------------------------------------------")
    var func4 = Funcionario("Kelly", 500.0, "pj")
    listaMutavel.add(func4)
    listaMutavel.forEach {
        println(it)
    }

    println("---------------------------------------------")
    listaMutavel.remove(func3)
    listaMutavel.forEach {
        println(it)
    }


    println("---------------------Set------------------------")
    var mutabelSet = mutableSetOf<Funcionario>()

    mutabelSet.add(func1)
    mutabelSet.add(func2)

    mutabelSet.forEach {
        println(it)
    }


}