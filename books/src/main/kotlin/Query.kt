class Query {
    fun authorsFromYearRange(yearStart: Int, yearEnd: Int, authors: List<Author>) : List<Author> {
        return authors.filter { it.birthYear >= yearStart && it.birthYear <= yearEnd}
    }

    @JvmName("authorsFromYearRangeFromBooks")
    fun authorsFromYearRange(yearStart: Int, yearEnd: Int, books: List<Book>) : List<Author> {
        return authorsFromYearRange(yearStart, yearEnd, books.map { it.author })
    }

    fun topAuthorsByLastName(limit: Int, authors: List<Author>) : List<Author> {
        return authors.asSequence()
                .sortedBy { "${it.lastName} ${it.firstName}" }
                .distinctBy { listOf(it.lastName, it.firstName) }
                .take(limit)
                .toList()
    }

    @JvmName("topAuthorsByLastNameFromBooks")
    fun topAuthorsByLastName(limit: Int, books: List<Book>) : List<Author> {
        return topAuthorsByLastName(limit = 15, authors = books.map { it.author })
    }
}