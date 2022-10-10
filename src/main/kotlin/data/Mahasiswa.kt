package data

open class Manusia(val nama: String, val beratBadan: Double,
                   val umur: Int, val jenisKelamin: Boolean) {

    open fun belajar(){
        println("$nama sedang belajar!")
    }

    open fun makan(){
        println("$nama sedang makan!")
    }
}

class Mahasiswa(pNama: String, pBeratBadan: Double, pUmur: Int, pJenisKelamin: Boolean, val NIM: String)
    : Manusia(pNama, pBeratBadan, pUmur, pJenisKelamin) {


    override fun makan(){
        println("$nama sedang memakan ayam !")
    }

    fun tidur() {
        println("$nama sedang tidur di kampus !")
    }
}

fun main(){
    val udin = Mahasiswa("Udin Prawira", 65.8, 21, true, "61286187")

    udin.belajar()
    udin.makan()
    udin.tidur()
}