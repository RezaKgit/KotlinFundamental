fun main() {
    // Dengan Range
    for (i in 1..20) {
        println("Value is $i")
    }

    // Dengan Array
    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    for (day in days) {
        println(day)
    }

    // Dengan Index
    for ((i, value ) in days.withIndex()) {
        println("$i Day => $value")
    }

    //Dengan forEach
    println("Perulangan Dengan ForEach")
    days.forEach { day ->
        println("Day is $day")
    }

    // Dengan forEach -> Index
    println("Perulangan Dengan ForEach -> Index")
    days.forEachIndexed {
        i, day ->
        println("$i Day => $day")
    }

}