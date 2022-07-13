package main.br.com.antoniojose.aulas_classes

import java.util.*

fun main(){

    var input = Scanner(System.`in`)

    var a = input.nextInt()
    var b = input.nextInt()
    var c = input.nextInt()
    var d = input.nextInt()

    var diferenca = (a*b - c*d)

    println("DIFERENCA = $diferenca")

}