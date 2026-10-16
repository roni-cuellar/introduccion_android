enum class Nivel(val puntos: Int) {
    BAJO(10),MEDIO(50),ALTO(100)
    fun esMayorQue(nivel:Nivel)=puntos>nivel.puntos
}

fun main() {
    println(Nivel.ALTO.esMayorQue(Nivel.MEDIO))
}
