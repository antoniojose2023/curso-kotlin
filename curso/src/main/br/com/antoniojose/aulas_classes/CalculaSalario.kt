package main.br.com.antoniojose.aulas_classes

import java.lang.Exception
import java.text.DateFormat
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*


fun main() {

//    val input = Scanner(System.`in`)
//    val salario = input.nextDouble()
//
//    var reajuste = when{
//         salario > 2000.00 -> 4
//         salario in 1200.01..2000.00 -> 7
//         salario in 800.01..1200.00 -> 10
//         salario in 400.01..800.00 -> 12
//         else -> 15
//    }
//
//    //escreva o seu código nos espaços em branco
//    val valorReajuste = (salario * reajuste.toDouble())/100
//    val novoSalario = salario + valorReajuste
//
//
//    println( "Novo salario: %.2f".format(novoSalario))
//    println( "Reajuste ganho: %.2f".format(valorReajuste))
//    println( "Em percentual: ${reajuste} %")


        val input = Scanner(System.`in`)

        val a = input.nextInt()
        val b = input.nextInt()
        val c = input.nextInt()
        val d = input.nextInt()
        //Continue o código com uma solução possível para o problema

        try{
            if ( b > c  &&  d > a  && ( c + d ) > ( a + b) && c > 0 && d > 0 && a % 2 == 0 ) {
                println("Valores aceitos")
            } else {
                println("Valores nao aceitos")
            }
        }catch (ex: Exception){
            //
        }




}