package main.br.com.antoniojose.DesafiosDeCodigo


fun main(){

    var tartarura = IntArray(3)

   tartarura[0] = 10
   //tartarura[1] = 1
   //tartarura[2] = 2

    for(n in 0 until tartarura.size){

        if(tartarura[n] < 10){
                println("Nivel 1 - tartaruga ${n}: "+tartarura[n])
                break
        }else if(tartarura[n] > 10 && tartarura[n] < 20){
            println("Nivel 2 - tartaruga ${n}: "+tartarura[n])
            break
        }else if(tartarura[n] >= 20){
            println("Nivel 3 - tartaruga ${n}: "+tartarura[n])
            break
        }

    }

}