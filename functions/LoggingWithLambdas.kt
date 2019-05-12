import java.time.LocalDateTime

fun runWithLog(functionToRun: () -> Unit) {
  functionToRun()
  println("Your lambda finished at ${LocalDateTime.now()}.")
}

fun main() {
  runWithLog { println("I can haz lambdaz! I can do all the thingz!") }
}
