package main.br.com.antoniojose.collections

fun main() {


    var notas = doubleArrayOf(10.0, 8.0, 5.0, 2.0)

    var maiortNota = notas.maxOrNull()
    var menortNota = notas.minOrNull()
    var mediaNotas = notas.average()

    println(maiortNota)
    println(menortNota)
    println(mediaNotas)

    println("---------------------------------------------")
  var notasFiltrada = notas.filter {  it >= 8  }

    notasFiltrada.forEach {
        println(" Notas "+it)
    }

    var cont = notas.count { it >= 2 }
    println(cont)

    println("---------------------------------------------")
    var notaPesquisa = notas.find { it == 2.0 }

    println(notaPesquisa)

    println("---------------------------------------------")
    var verdadeiroFalso = notas.any { it == 12.0 }

    println(verdadeiroFalso)

}