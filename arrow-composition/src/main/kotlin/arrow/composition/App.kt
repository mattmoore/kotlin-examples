package arrow.composition

fun main(args: Array<String>) {
  println(and("John", hello("Matt")))
}

fun hello(name: String): String {
  return "Hello, ${name}"
}

fun and(name: String): String {
  return " and ${name}"
}
