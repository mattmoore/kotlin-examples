package applicatives

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FunctorTest {
    @Test
    fun mapTest() {
        fun inc(n: Int) = n + 1
        val result = Functor(1).map(::inc).map(::inc)
        assertTrue(result is Functor)
        assertEquals(result.value, Functor(3).value)
    }
}
