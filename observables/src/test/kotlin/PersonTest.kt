import com.github.mattmoore.kast.Person
import org.junit.jupiter.api.Test

internal class PersonTest {
    @Test
    fun nameTest() {
        var person = Person()
        assert(person.observed == false)
        person.name = "Matt"
        assert(person.observed == true)
    }
}