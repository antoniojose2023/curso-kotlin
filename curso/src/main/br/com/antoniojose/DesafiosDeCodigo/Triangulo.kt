package main.br.com.antoniojose.DesafiosDeCodigo

import java.text.DecimalFormat
import java.util.*


fun main() {
        val input = Scanner(System.`in`)
        val a = input.nextFloat()
        val b = input.nextFloat()
        val c = input.nextFloat()


        val perimetro = a + b + c
        val area = ((a+b)*c)/2

        var dec = DecimalFormat("##.0")

        if (a<( b+c   ) &&  b<( a+c   ) &&  c<(  a+b   )){
            var perimetroFormatado = dec.format(perimetro)
            println(String.format("Perimetro = "+perimetroFormatado ))
        }else{
            var areaFormatada = dec.format(area)
            println(String.format("Area = "+  areaFormatada     ))
        }
}