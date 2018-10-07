import Currying.*
import org.junit.jupiter.api.Test

internal class CurryingTest {
  @Test
  fun adderTest() {
    assert(adder(2, 3) == 5)
  }

  @Test
  fun adderCurriedTest() {
    assert(adderCurried(2)(3) == 5)
  }

  @Test
  fun adderCurriedAltTest() {
    assert(adderCurriedArrow(2)(3) == 5)
  }

  @Test
  fun greetTest() {
    assert(greet("Hello", "World") == "Hello, World")
  }

  @Test
  fun helloTest() {
    assert(hello("World") == "Hello, World")
  }
}
