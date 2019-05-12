data class Author(val firstName: String, val lastName: String)

data class Book(val title: String, val author: Author)

val books = listOf(
  Book("Microservices Architecture", Author("Chris", "Richardson")),
  Book("Kotlin in Action", Author("Dmitry", "Jemerov"))
)

fun main() {
  // Want to find books written by Chris Richardson.

  // for loop
  var authors = mutableListOf<String>()
  for (book in books) {
    authors.add("${book.author.firstName} ${book.author.lastName}")
  }
  println(authors)

  // map
  println(books.map { "${it.author.firstName} ${it.author.lastName}" })

  // Now, I want to get author for a specific book.
  // "Folding functions (map/filter/etc)" allow me to do this:
  println(
    books.filter { it.title == "Kotlin in Action" }
         .map { "${it.author.firstName} ${it.author.lastName}" }
  )
}
