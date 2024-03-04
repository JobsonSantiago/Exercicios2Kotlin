import kotlin.math.pow

fun main (args: Array<String>){
    println("Digite o raio do círculo: ")
    var raio = readLine()!!.toDouble()
    var pi = 3.14
    println("A circunferência do círculo é: " +areaDaCircunferencia(raio, pi))
}

fun areaDaCircunferencia (raio: Double, pi: Double): Double {
    return pi * (raio.pow(2))
}
