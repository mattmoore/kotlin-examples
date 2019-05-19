package applicatives

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ApplicativeTest {
    // value.apply(function)
    fun valueFunctionApplyTest() {
        val result = Functor(1).apply(Functor({ x: Int -> x + 1 }))
        assertTrue(result is Functor<Int>)
        assertEquals(result.value, Functor(1).value)
    }

    // function.apply(value)
    fun functionValueApplyTest() {
        val result = Functor({ x: Int -> x + 1 }).apply(Functor(1))
        assertTrue(result is Functor<Int>)
        assertEquals(result.value, Functor(1).value)
    }

    // value.map(function).apply(value)
    fun valueMapFunctionApplyTest() {
        fun add(x: Int) = { y: Int -> x + y }
        val result = Functor(1).map(::add).apply(Functor(1))
        assertTrue(result is Functor<Int>)
        assertEquals(result.value, Functor(1).value)
    }

    // function.apply(value).apply(value)
    fun functionApplyValueApplyValue() {
        fun add(x: Int) = { y: Int -> x + y }
        val result = Functor(::add).apply(Functor(1)).apply(Functor(1))
        assertTrue(result is Functor<Int>)
        assertEquals(result.value, Functor(1).value)
    }
}
