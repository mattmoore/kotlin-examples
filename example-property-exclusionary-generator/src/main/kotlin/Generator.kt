package com.github.mattmoore.kotlinexamples.examplePropertyExclusionaryGenerator

data class Generator(val values: List<String>)

val permutationsExcludingGoodValues = { knownGoods: List<String>, generator: Generator ->
    generator.values.minus(knownGoods)
}

val stateCodeToName = { code: String, states: HashMap<String, String> ->
    states[code]
}

// TODO: Create an actual generator. Past midnight and too tired right now.
val twoLetterPermutationsGenerator = {
    var twoLetterPermutations = mutableListOf<String>()
    Generator(doubleAlphabet())
}

val alphabet = { ('A'..'Z').map { it.toString() }.toList() }

val doubleAlphabet = { (alphabet() zip alphabet()).map { "${it.first}${it.second}" } }

fun factorial(n: Int): Long { return if (n == 1) n.toLong() else n * factorial(n-1) }
