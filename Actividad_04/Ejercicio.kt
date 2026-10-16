data class Libro(val titulo: String,val autor: String,val anio: Int)

fun main() {
    val a=Libro("Libro","Ana",2020)
    println(a)
    println(a.copy(anio=2025))
}
