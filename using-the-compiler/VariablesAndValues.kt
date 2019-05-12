package VariablesAndValues

fun main(args: Array<String>) {
  list().forEach { x ->
    println(x)
  }
}

fun list(): List<Int> {
  return listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
}
