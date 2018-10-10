package MapFilter

inline fun <T> Iterable<T>.myMap(transform: (T) -> T): List<T> {
    return this.fold(mutableListOf()) { ys: MutableList<T>, x: T ->
        ys.add(transform(x))
        ys
    }
}

fun <T> Iterable<T>.myFilter(predicate: (T) -> Boolean): Iterable<T> {
    return this.filter { predicate(it) }
}
