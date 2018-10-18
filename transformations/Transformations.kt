val greet = { name: String -> "Hello, $name" }

val punctuate = { text: String -> "$text." }

val applyTransformations = { value: String, transformations: List<(String) -> String> ->
  transformations.fold(value) { agg: String, f -> f(agg) }
}

fun main(args: Array<String>) {
  val transformations = listOf(greet, punctuate)
  val result = applyTransformations("Matt", transformations)
  println(result)
}
