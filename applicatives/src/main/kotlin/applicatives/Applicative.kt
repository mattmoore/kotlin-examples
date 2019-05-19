package applicatives

fun <A, B> Functor<A>.apply(f: Functor<(A) -> B>, dummyImplicit: Any? = null): Functor<B> {
    return f.map { it(value) }
}

fun <A, B> Functor<(A) -> B>.apply(f: Functor<A>): Functor<B> {
    return f.map { value(it) }
}
