import org.junit.jupiter.api.Test

internal class CompositionTest {
  val list = (1..10).toList()

  @Test
  fun takeEvensTest() {
    assert(takeEvens(list) == listOf(2, 4, 6, 8, 10))
  }

  @Test
  fun combineTest() {
    assert(combine(list) == 55)
  }

  @Test
  fun takeGreaterThan3Test() {
    assert(takeGreaterThan3(list) == listOf(4, 5, 6, 7, 8, 9, 10))
  }

  @Test
  fun takeEvensGreaterThan3Test() {
    assert(takeEvensGreaterThan3(list) == listOf(4, 6, 8, 10))
  }

  @Test
  fun takeSumOfEvensGreaterThan3Test() {
    assert(takeSumOfEvensGreaterThan3(list) == 28)
  }
}