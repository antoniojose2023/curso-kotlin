package main.br.com.antoniojose.DesafiosDeCodigo

//import java.util.Scanner


fun main(args: Array<String>) {
    val nTestes = readLine()!!.toInt()
    var i = 0

    while (i <  nTestes   ){
        var cont = 0
        while (cont == 0) {
             val raios = readLine()

            val raiosArray = raios!!.split(" ").map {
                it.toInt()
            }

            val r1 = raiosArray[0]
            val r2 = raiosArray[1]

            println()
            println(r1 + r2)

            cont++
        }
        i++
    }
}





