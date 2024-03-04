fun main(args: Array<String>){
    println("Digite a altura do triângulo:")
    var alt = readLine()!!.toDouble()
    println("Digite a base do triângulo")
    var base = readLine()!!.toDouble()

    println("A área do triângulo é "+ areaTriangulo(alt, base))
}

fun areaTriangulo(alt: Double, base: Double): Double {
    return alt * base
}
