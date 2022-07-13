package main.br.com.antoniojose.aulas_classes

import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val nota1 = input.nextDouble()
    val nota2 = input.nextDouble()
    val nota3 = input.nextDouble()
    val media = ((  nota1 * 2.0   ) + ( nota2 * 3.0 ) + ( nota3 * 5.0 )) / (   2+3+5   )  //complete os espaços em branco
    System.out.printf("MEDIA = %.2f\n", media)
}