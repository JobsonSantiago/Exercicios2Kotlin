fun main (args: Array<String>){
    println("Digite o valor da base maior do trapézio")
    var b1 = readLine()!!.toDouble()
    println ("Digite o valor da base menor do trapézio")
    var b2 = readLine()!!.toDouble()
    println("Digite o valor da altura do trapézio")
    var h = readLine()!!.toDouble()

    println("A área do losango é: " +areaDoTrapezio(b1,b2,h))
}

fun areaDoTrapezio (b1:Double, b2:Double, h:Double): Double{
    return ((b1+b2)*h)/2
}