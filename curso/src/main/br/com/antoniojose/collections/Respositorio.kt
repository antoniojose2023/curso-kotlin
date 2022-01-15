package main.br.com.antoniojose.collections

class Respositorio<T>{

    var map = mutableMapOf<String, T>()

    fun createMap(id: String, value: T){

          map.put( id, value )

    }

    fun deleteMap(id: String){

        map.remove(id)

    }

    fun listaMap() = map.values


}
