import java.time.LocalDateTime

fun runWithLog(functionToRun: () -> Unit) {
  functionToRun()
  println("Your lambda finished at ${LocalDateTime.now()}.")
}

fun iCanDoThingz() {
  println("I haz no lambdaz! I can do all the thingz but harder!")
}

fun main() {
  runWithLog { iCanDoThingz() }
}
