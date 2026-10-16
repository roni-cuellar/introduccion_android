open class Animal {
    open fun hacerSonido()=println("Sonido")
}

class Perro : Animal() {
    override fun hacerSonido()=println("Guau")
}

class Gato : Animal() {
    override fun hacerSonido()=println("Miau")
}

fun main() {
    listOf(Perro(),Gato()).forEach {
        it.hacerSonido()
    }
}
