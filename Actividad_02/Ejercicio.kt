class Automovil(val marca: String,val modelo: String,val anio: Int) {
    constructor(marca:String,modelo:String): this(marca,modelo,2025)
}

fun main() {
    println(Automovil("Mazda","3").anio)
}
