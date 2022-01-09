package main.br.com.antoniojose.collections

fun main(){

    var salarios = DoubleArray(3)

    salarios[0] = 100.0
    salarios[1] = 200.0
    salarios[2] = 500.0

    salarios.sort()
    println("-----------------------")
    for (salario in salarios){

           println(salario)
    }

    println("-----------------------")
    salarios.forEach {

        println(it)
    }

    println("-----------------------")
    salarios.forEachIndexed{ index, valor ->
         salarios[index] = valor * 10
         println(salarios[index])
    }

}