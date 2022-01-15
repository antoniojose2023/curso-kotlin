package main.br.com.antoniojose.collections

fun main() {

    var func1 = ModelFuncionario("antonio", 800.0, "clt")
    var func2 = ModelFuncionario("maria", 500.0, "pj")
    var func3 = ModelFuncionario("joao", 900.0, "clt")

    var setFunc1 = setOf(func1, func3)
    var setFunc2 = setOf(func2)
    var setFunc3 = setOf(func1, func2, func3)

    println("-------------------------------------")
    println(setFunc1.union(setFunc2))

    println("-------------------------------------")
    println(setFunc2.intersect(setFunc3))

    println("-------------------------------------")
    println(setFunc3.subtract(setFunc2))

}


class ModelFuncionario(var nome: String, var salario: Double, var tipo: String){

    override fun toString(): String =
        """
           $nome  $salario  $tipo
       """

}