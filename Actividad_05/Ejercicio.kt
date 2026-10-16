interface Reproducible {
    fun play()
    fun pause()
}

class Cancion : Reproducible {
    override fun play()=println("Canción reproduciendo")
    override fun pause()=println("Canción pausada")
}

class Video : Reproducible {
    override fun play()=println("Video reproduciendo")
    override fun pause()=println("Video pausado")
}

fun main() {
    listOf(Cancion(),Video()).forEach {
        it.play()
        it.pause()
    }
}
