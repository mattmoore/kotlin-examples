package Currying

import arrow.syntax.function.curried

val adder =
  { x: Int, y: Int ->
    x + y
  }

// Doing currying without additional help
val adderCurried =
  { x: Int ->
    { y: Int -> adder(x, y) }
  }

// Create curried version with Arrow
val adderCurriedArrow =
  adder.curried()

// greet takes two parameters: a greeting and a name, e.g., "Hello" and "World"
val greet =
  { greeting: String, name: String ->
    "$greeting, $name"
  }

// hello uses currying to create a partial function starting with "Hello" greeting,
// then allows for the specific name to be passed in.
val hello =
  greet.curried()("Hello")
