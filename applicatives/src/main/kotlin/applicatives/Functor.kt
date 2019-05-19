package applicatives

class Functor<out A>(val value: A) {
    inline fun <B> map(f: (A) -> B): Functor<B> = Functor(f(value))
}
