 var balance = 10_000

 fun main() {

     val playTheGame = {
         balance -= 1_000
         println("Playing the game Odong-Odong!")
     }

     for (i in 1..9) {
         doTransaction(playTheGame)
     }
 }

 inline fun doTransaction(doPlay:() -> Unit) {
     println("Balance before play: $balance")
     doPlay()
     println("Balance after play: $balance")
 }