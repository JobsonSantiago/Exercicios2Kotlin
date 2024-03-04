fun main (args: Array<String>){
    println("Digite a base do triângulo isóceles:")
    var base = readLine()!!.toDouble()
    println("Digite a altura do triângulo isoceles:")
    var alt = readLine()!!.toDouble()

    println("A área do triângulo isóceles é " +areaTrianguloIso(base, alt))
}

fun areaTrianguloIso (base: Double, alt: Double): Double {
    return (base * alt) / 2
}