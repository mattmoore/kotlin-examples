package Sequences

// BAD
// Multiple maps over an array. Each map expands the list fully before continuing to the next map.
// If you run this function it will enter an infinite loop.
fun badComposition() : Int {
    return (1..Int.MAX_VALUE)
            .map { it + 1 }
            .map { it + 1 }
            .first()
}

// GOOD
// Multiple maps over an array. Each item in the list is iterated over by the composed maps, only as each item is needed.
// This prevents infinite looping.
fun goodComposition() : Int {
    return (1..Int.MAX_VALUE)
            .asSequence()
            .map { it + 1 }
            .map { it + 1 }
            .first()
}
