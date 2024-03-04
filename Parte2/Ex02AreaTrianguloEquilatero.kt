import java.lang.Math.sqrt

fun main(args: Array<String>){
    println("Digite o lado do triângulo equilátero: ")
    var lado = readLine()!!.toDouble()
    println("A área do triângulo equilátero "+areaTrianguloEqui(lado))
}
fun areaTrianguloEqui(lado: Double): Double{
    var a = ((lado*lado) * sqrt(3.0) /4)
    return a
}