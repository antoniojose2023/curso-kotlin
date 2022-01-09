package main.br.com.antoniojose.collections

fun main(){

    var valores = intArrayOf(1,5,6,4,9)


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