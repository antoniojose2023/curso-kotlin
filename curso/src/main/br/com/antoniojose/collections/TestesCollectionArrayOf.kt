package main.br.com.antoniojose.collections

fun main(){

   var nomes = Array<String>(3){""}

    nomes[0] = "maria"
    nomes[1] = "jose"
    nomes[2] = "kelly"

    for (nome in nomes){
        println(nome)
    }


    println("---------------------------------")
    nomes = arrayOf("maria", "jose", "kelly")

    for(nome in nomes){
        println(nome)
    }

    println("---------------------------------")
    nomes.forEach {
        println(it)
    }


}