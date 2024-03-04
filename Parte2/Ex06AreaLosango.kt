import kotlin.jvm.internal.Ref.DoubleRef

fun main (args: Array<String>){
    println("Digite o valor de uma diagonal do losango: ")
    var d1 = readLine()!!.toDouble()
    println("Digite o valor da outra diagonal do losango: ")
    var d2 = readLine()!!.toDouble()

    println("A área do losango é: " +areaDoLosango(d1,d2))
}

fun areaDoLosango (d1:Double, d2:Double): Double {
    return (d1 * d2)/2
}