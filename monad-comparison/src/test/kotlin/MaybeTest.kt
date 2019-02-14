import org.junit.jupiter.api.Test
import io.mattmoore.monads.*

internal class MaybeTest {
  @Test
  fun liftTest() {
    assert(Just(1).value == 1)
    assert(maybe(1) is Just)
    assert(fromMaybe(maybe(1)) == 1)
    assert(maybe(0) is Maybe)
  }
}
