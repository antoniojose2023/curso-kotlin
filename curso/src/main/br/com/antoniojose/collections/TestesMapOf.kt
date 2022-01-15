package main.br.com.antoniojose.collections

fun main() {

    var pair: Pair<String, Double> = Pair("antonio", 200.0)

    var map2 = mapOf(pair)
    map2.forEach { (k,v) -> println("$k - $v") }

    println("---------------------------------------------")
    var map1 = mapOf(
        "antonio" to 200,
        "maria" to 400,
        "joao" to 600
    )

    map1.forEach { (k,v) -> println("chave $k " +  "valor $v") }

}