enum class Moneda(val simbolo: String) {
    DOLAR("$"),EURO("€"),PESO("COP$")
}

fun main() {
    Moneda.values().forEach {
        println("${it.name}: ${it.simbolo}")
    }
}
