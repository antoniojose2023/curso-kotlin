package main.br.com.antoniojose.collections



 fun Array<Int>.somatoria() = this.reduce { acc, i ->  acc + i}

 fun Array<Int>.media() = if(this.isEmpty()) 0 else somatoria()/this.size.toInt()