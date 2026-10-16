sealed class Resultado {
    data class Exito(val dato: String): Resultado()
    data class Error(val mensaje: String): Resultado()
    object Cargando : Resultado()
}
fun mostrar(r:Resultado) {
    when(r) {
        is Resultado.Exito->println(r.dato)
        is Resultado.Error->println(r.mensaje)
        Resultado.Cargando->println("Cargando")
    }
}

fun main() {
    mostrar(Resultado.Exito("Correcto"))
}
