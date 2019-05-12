data class Person(val name: String, val age: Int)

fun main() {
  val people = listOf(
    Person("Matt", 32),
    Person("Sally", 21),
    Person("Susan", 42)
  )
  val results = people.filter { person: Person ->
    person.age > 30 &&
    person.name.startsWith('S')
  }
  println(results)
}
