fun main (args: Array<String>){
    println("Digite a base do triângulo escaleno: ")
    var base = readLine()!!.toDouble()
    println("Digite a altura do triângulo escaleno")
    var alt = readLine()!!.toDouble()

    println("A área do triângulo escaleno é: " + areaTrianguloEsc(base, alt))
}

fun areaTrianguloEsc (base: Double, alt: Double): Double {
    return (base * alt) / 2
}