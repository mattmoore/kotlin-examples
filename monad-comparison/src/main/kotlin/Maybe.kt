package io.mattmoore.monads

sealed class Maybe
data class Just(val value: Int?) : Maybe()
object Nothing : Maybe()

fun maybe(value: Int?) : Maybe {
  if (value == null) return Nothing
  return Just(value)
}

fun fromMaybe(value: Maybe) : Int? {
  return (value!! as Just).value
}
