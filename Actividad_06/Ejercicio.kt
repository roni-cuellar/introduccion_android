interface Repositorio<T> {
    fun agregar(item:T)
    fun obtenerTodos(): List<T>
}

class RepositorioMemoria<T>:Repositorio<T> {
    private val datos=mutableListOf<T>()
    override fun agregar(item:T) {
        datos.add(item)
    }
    override fun obtenerTodos(): List<T> = datos
}

fun main() {
    val r=RepositorioMemoria<String>()
    r.agregar("Ana")
    println(r.obtenerTodos())
}
