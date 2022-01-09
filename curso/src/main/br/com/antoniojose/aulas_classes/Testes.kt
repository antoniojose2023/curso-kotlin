package main.br.com.antoniojose.aulas_classes

fun main(){

//    var digitalOneBank = Banco(nome = "OneBank", numero = 10)
//
//
//    println(digitalOneBank.nome)
//    println(digitalOneBank.numero)
//
//
//    val filial = digitalOneBank.copy("Banco filial")
//    println(filial.nome)
//    println(filial.numero)

//    println(TipoPessoa.PF.s)

       var antonio = Administrador("antonio", "2131546545", 100.0, "127")

       println(antonio.nome)
       println(antonio.cpf)
       println(antonio.salario)

       println("Login "+antonio.login())

}

