package com.github.mattmoore.kotlinexamples.examplePropertyExclusionaryGenerator

import org.junit.jupiter.api.Test

internal class ExamplePropertyPermutationExclusionTest {
    @Test
    fun twoLetterPermutationsGeneratorTest() {
        val twoLetterPermutations = twoLetterPermutationsGenerator()
        assert(twoLetterPermutations.values.containsAll(listOf("AA")))
    }

    @Test
    fun permutationsExcludingGoodValues() {
        val generator = twoLetterPermutationsGenerator()
        val goodInputs = states.keys.toList()
        val badInputs = permutationsExcludingGoodValues(goodInputs, generator)
        validateKnownGoodPlusPermutations(goodInputs, badInputs)
    }

    val validateKnownGoodPlusPermutations = { good: List<String>, bad: List<String> ->
        assert(good.containsAll(states.keys))
        assert(bad.containsAll(listOf("AA", "ZZ")))
        assert(! bad.containsAll(good))
    }

    val states = hashMapOf<String, String>(
        "AL" to "Alabama",
        "AK" to "Alaska",
        "AZ" to "Arizona",
        "AR" to "Arkansas",
        "CA" to "California",
        "CO" to "Colorado",
        "CT" to "Connecticut",
        "DE" to "Delaware",
        "FL" to "Florida",
        "GA" to "Georgia",
        "HI" to "Hawaii",
        "ID" to "Idaho",
        "IL" to "Illinois",
        "IN" to "Indiana",
        "IA" to "Iowa",
        "KS" to "Kansas",
        "KY" to "Kentucky",
        "LA" to "Louisiana",
        "ME" to "Maine",
        "MD" to "Maryland",
        "MA" to "Massachusetts",
        "MI" to "Michigan",
        "MN" to "Minnesota",
        "MS" to "Mississippi",
        "MO" to "Missouri",
        "MT" to "Montana",
        "NE" to "Nebraska",
        "NV" to "Nevada",
        "NH" to "New Hampshire",
        "NJ" to "New Jersey",
        "NM" to "New Mexico",
        "NY" to "New York",
        "NC" to "North Carolina",
        "ND" to "North Dakota",
        "OH" to "Ohio",
        "OK" to "Oklahoma",
        "OR" to "Oregon",
        "PA" to "Pennsylvania",
        "RI" to "Rhode Island",
        "SC" to "South Carolina",
        "SD" to "South Dakota",
        "TN" to "Tennessee",
        "TX" to "Texas",
        "UT" to "Utah",
        "VT" to "Vermont",
        "VA" to "Virginia",
        "WA" to "Washington",
        "WV" to "West Virginia",
        "WI" to "Wisconsin",
        "WY" to "Wyoming"
    )
}