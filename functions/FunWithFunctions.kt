// Function a returns a string.
fun a(): String {
  return "I can haz functionz!"
}

// Parameter can be a value or a function.
fun b(parameter: () -> String): String {
  return parameter()
}

// Higher order function c Returns defined function a.
fun c(): () -> String {
  return ::a
}

fun main() {
  // Call function b, and pass it a named function a.
  println(b(::a))

  // Call function b, and pass it an anonymous function.
  println(b(fun(): String { return "I can haz anonymuz functionz!" }))

  // Call function b, and pass it a lambda function.
  println(b({ "I can haz lambda functionz!" }))

  // Call function c, which returns another function a. Then call that a function.
  println(c()())
}
