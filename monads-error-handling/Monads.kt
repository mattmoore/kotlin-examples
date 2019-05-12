sealed class SuccessOrFailure
class Success<T>(val value: T): SuccessOrFailure()
class Failure(): SuccessOrFailure()

fun <T>eitherMonad(function: () -> T): SuccessOrFailure {
  return try { Success(function()) }
  catch (e: Throwable) { Failure() }
}

fun main(args: Array<String>) {
  val result = eitherMonad({ java.io.File(args[0]).readText() })
  when (result) {
    is Success<*> -> println("Hello, ${result.value}")
    is Failure    -> println("Couldn't find the file!")
  }
}
