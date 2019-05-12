data class Person(val name: String, val age: Int)

fun searchAgeRange(people: List<Person>, startAge: Int, endAge: Int): List<Person> {
  val found = mutableListOf<Person>()
  people.forEach {
    if (it.age in startAge..endAge) found.add(it)
  }
  return found
}

fun main() {
  val people = listOf(
    Person("Matt", 30),
    Person("Matt", 32),
    Person("Luke", 20),
    Person("Sally", 21),
    Person("Susan", 42)
  )
  val results = searchAgeRange(people, 20, 30)
  println(results)
}
