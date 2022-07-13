package main.br.com.antoniojose.DesafiosDeCodigo


import kotlin.math.log

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    for (i in 1..n) {
        var str = readLine()!!
        var N1 : Int = str.substring(0, 1).toInt()
        var N2 : Int = str.substring(2).toInt()
        var x : String = str.substring(1, 2)


//TODO: Complete os espaços em branco com uma possível solução para o desafio

        if (N1.equals(  N2  )) {
            println(  N1 * N2   )
        } else {
            if (x.toUpperCase()== x) {
                println(  N2 - N1  )
            } else {
                println(  N1 + N2  )
            }
        }
    }
}