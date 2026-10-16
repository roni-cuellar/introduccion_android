class Persona(val nombre: String,val edad: Int) {
    fun presentarse()=println("Hola, soy $nombre y tengo $edad años")
}

fun main() {
    Persona("Ana",25).presentarse()
}
