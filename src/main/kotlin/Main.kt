
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


// ====================================================
// Inheritance
//open class Manusia(val nama: String, val beratBadan: Double, val umur: Int, val jenisKelamin: Boolean){
//
//    open fun belajar(){
//        println("$nama sedang belajar!")
//    }
//
//    open fun makan(){
//        println("$nama sedang makan!")
//    }
//}
//
//class Mahasiswa(pNama: String, pBeratBadan: Double, pUmur: Int, pJenisKelamin: Boolean, val NIM: String)
//    : Manusia(pNama, pBeratBadan, pUmur, pJenisKelamin) {
//
//
//    override fun makan(){
//        println("$nama sedang memakan ayam !")
//    }
//
//    fun tidur() {
//        println("$nama sedang tidur di kampus !")
//    }
//}
//
//fun main(){
//    val udin = Mahasiswa("Udin Prawira", 65.8, 21, true, "61286187")
//
//    udin.belajar()
//    udin.makan()
//    udin.tidur()
//}
//



//    val numbers = (1..10).toList()
//    println(numbers.shuffled())
//    println(numbers.shuffled())
//    println(numbers.shuffled())
//    println(numbers.shuffled())
//
//    var number: Int
//    var hasil = 0
//
//    println("Input 0 for stop program")
//    while (true) {
//        print("Enter a number: ")
//        number = readLine()!!.toInt()
//
//        if (number == 0)
//            break
//        hasil += number
//    }
//
//    print("sum = $hasil")
