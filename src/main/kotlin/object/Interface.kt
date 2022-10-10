package data

// interface pertama
interface Apel{
    fun cetakNamaApel()
    fun caraMakanApel(){
        println("Langsung digiit")
    }
}
// interface kedua
interface Jeruk{
    fun cetakNamaJeruk()
    fun caraMakanJeruk(){
        println("Di kupas dahulu, baru dimakan")
    }
}

class Buah: Apel, Jeruk{
    override fun cetakNamaApel() {
        println("Ini buah Apel")
    }

    override fun cetakNamaJeruk() {
        println("Ini buah Jeruk")
    }
}

fun main() {
    val buah = Buah()
    buah.cetakNamaApel()
    buah.caraMakanApel()

    buah.cetakNamaJeruk()
    buah.caraMakanJeruk()
}