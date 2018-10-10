import org.junit.jupiter.api.Test
import MapFilter.*

internal class MapFilterTest {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    @Test
    fun myMapTest() {
        val expectedResult = list.map { it * 2 }
        val result = list.myMap { it * 2 }
        assert(result == expectedResult)
    }

    @Test
    fun myFilterTest() {
        val expectedResult = list.filter { it % 2 == 0 }
        val result = list.myFilter { it % 2 == 0 }
        assert(result == expectedResult)
    }
}