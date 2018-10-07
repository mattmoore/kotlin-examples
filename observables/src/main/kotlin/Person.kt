package com.github.mattmoore.kast

import kotlin.properties.Delegates

public class Person {
    var observed: Boolean = false
    var name: String by Delegates.observable("no name") { property, oldValue, newValue ->
        observed = true
    }
}
