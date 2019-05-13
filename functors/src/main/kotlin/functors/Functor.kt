package functors

class Functor<T>(val value: T) {
    fun map(function: (T) -> T): Functor<T> {
        return Functor(function(value))
    }
}
