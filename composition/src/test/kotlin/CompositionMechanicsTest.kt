import org.junit.jupiter.api.Test

internal class CompositionMechanicsTest {

    @Test
    fun composeTest() {
        fun adder(x: Int): Int { return x + 1 }
        val result = (::adder compose ::adder compose ::adder)(1)
        assert(result == 4)
    }
}