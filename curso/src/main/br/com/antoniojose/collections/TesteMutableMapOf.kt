package main.br.com.antoniojose.collections

fun main() {

    var respositorio = Respositorio<Funcionario>()

    var func1 = Funcionario("antonio", 800.0, "clt")
    var func2 = Funcionario("maria", 500.0, "pj")
    var func3 = Funcionario("joao", 900.0, "clt")


    respositorio.createMap("1", func1)
    respositorio.createMap("2", func2)
    respositorio.createMap("3", func3)

    println("------------------------------")
    respositorio.listaMap().forEach{
        println(it)

    }

    println("------------------------------")
    respositorio.deleteMap("1")
    respositorio.listaMap().forEach{
        println(it)

    }

}