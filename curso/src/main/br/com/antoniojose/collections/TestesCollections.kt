package main.br.com.antoniojose.collections

fun main(){

    var valores = IntArray(5)

    valores[0] = 1
    valores[1] = 5
    valores[2] = 4
    valores[3] = 9
    valores[4] = 8


    valores.sort()
    for(valor in valores){
        println(valor)
    }


    println("-------------------------------")
    valores.forEach {
        println(it)
    }

    println("-------------------------------")
    valores.forEach {
        println(it)
    }

    println("-------------------------------")
    for (indice in valores.indices){

        println(valores[indice])
    }
}