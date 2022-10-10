class Test {
    var depan: String = ""
    var belakang: String? = null
    var umur: Int = 22
}

fun main() {
    val reza = Test()
    reza.depan = "Reza"
    reza.belakang = "Kurniawan"
    reza.umur = 22

    println("Nama kamu ${reza.depan} ${reza.belakang}, dan umur kamu ${reza.umur} Tahun")

}