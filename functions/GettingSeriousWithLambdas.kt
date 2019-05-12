data class Person(val name: String, val age: Int)

fun search(people: List<Person>, where: (Person) -> Boolean): List<Person> {
  val found = mutableListOf<Person>()
  people.forEach {
    if (where(it)) found.add(it)
  }
  return found
}

fun main() {
  val people = listOf(
    Person("Matt", 32),
    Person("Sally", 21),
    Person("Susan", 42)
  )
  val results = search(people, where = { person: Person -> person.age > 30 && person.name.startsWith('S') })
  println(results)
}
